package day3;
import java.util.Scanner;
//10.0.3.193--->167773121
//24 16 8 1对应，二进制转十进制是乘以阶乘
//167969729--->10.3.3.193
//十进制转换
//因为ip地址的格式固定
public class 整数与IP地址之间的转换 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String ip=in.nextLine();
            String ip_10=in.nextLine();
            ipToTen(ip);
            tenToIp(ip_10);
        }
    }

    private static void tenToIp(String ip_10) {
        long ip=Long.parseLong(ip_10);
        long a = ip>>24;
        long b = (ip-(a<<24))>>16;
        long c = (ip-(a<<24)-(b<<16))>>8;
        long d = ip-(a<<24)-(b<<16)-(c<<8);
        System.out.println(a+"."+b+"."+c+"."+d);
    }

    private static void ipToTen(String ip) {
        String string=new String();
        String str[]=ip.split("\\.");
        for(String s:str){
            string+=s;
        }
        System.out.println((Long.parseLong(str[0])<<24)+(Long.parseLong(str[1])<<16)+(Long.parseLong(str[2])<<8)+Long.parseLong(str[3]));
    }
}
