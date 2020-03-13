package day10;

import java.util.*;

public class 键盘坏了 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String error = in.nextLine();
            String bingo = in.nextLine();
            String bin_up=bingo.toUpperCase();//因为题目要求输出大写字母
            char[] array = error.toUpperCase().toCharArray();
            String result = new String();
           for(int i=0;i<array.length;i++){
                if (!bin_up.contains(new String()+array[i])){//在正确的字符串中找出不存在的字符
                    if(result==null){
                        result+=array[i];
                    }else {
                        if (!result.contains(new String()+array[i])) {//保证不能重复
                            result += array[i];
                        }
                    }
                }
            }
            System.out.println(result.toUpperCase());
        }
    }
}
