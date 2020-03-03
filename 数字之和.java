package day2;

import java.util.Scanner;

public class 数字之和 {
    //计算整数各位数字之和及平方的各位数字之和
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        while(in.hasNext()){
            int n=in.nextInt();
            int m=n*n;//平方值
            System.out.print(Func(n));//递归调用
            System.out.print(" ");
            System.out.print(Func(m));
            System.out.println();
        }
    }

    private static int Func(int n) {
        int sum=0;
        if(n<=9){
            return n;
        }else{
            sum += n % 10;
            sum += Func(n/10);
        }
        return sum;
    }
}
