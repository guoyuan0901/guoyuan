package day4;
//stringLength(s)&&&&repeatString(s)
import java.util.Scanner;
public class 密码验证合格程序 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String s = in.nextLine();
            if (matchCharacter(s)) {
                System.out.println("OK");
            }else{
                System.out.println("NG");
            }
        }
    }

    private static boolean stringLength(String s) {
        if(s==null||s.length()<=8){
            return false;
        }
        return true;
    }//

    private static boolean matchCharacter(String s) {
        char c[]=s.toCharArray();
        int count = 0;
        int uppercase=0;
        int lowercase=0;
        int num=0;
        for(int i=0;i<c.length;i++) {
            if ((c[i] >= 'a' && c[i] <= 'z')) {
                lowercase=1;
            }else if ((c[i] >= 'A' && c[i] <= 'Z')) {
                uppercase=1;
            }else if ((c[i] >= '0' && c[i] <= '9')) {
                num=1;
            }else {
                count=1;
            }
        }
        if(count+num+uppercase+lowercase >= 3){
            return true;
        }
        return false;
    }//字符种类数

    private static boolean repeatString(String s) {
        for(int i=0 ;i<s.length()-3 ;i++){//截取的起始位置取值范围
            String substr1 =s.substring(i, i+3);//截取长度为3的字符串
            if (s.substring(i+1).contains(substr1))
                return false;
        }
        return true;
    }//重复字符串
    //这里判断了3的字符串，因为>3的是包含关系
}

