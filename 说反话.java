package day7;
import java.util.*;
public class 说反话 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String s=in.nextLine();
            String []str=s.split(" ");
            for(int i=0;i<str.length/2;i++){
                String string=str[i];
                str[i]=str[str.length-1-i];
                str[str.length-1-i]=string;
            }
            for(String a:str){
                System.out.print(a);
                System.out.print(" ");
            }

        }
    }

}
