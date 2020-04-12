import java.util.Scanner;

public class 字符串中找出连续最长数字串 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        char[]array=str.toCharArray();
        for (int i = 0; i < array.length; i++) {
            if (array[i]-'0' >= 0 && array[i]-'0' <= 9) {
                continue;
            } else
                array[i]=' ';
        }//将除数字之外的字符用空格替代
        // 因为string字符串不能进行修改 所以需要构建一个新的字符串
        String s=new String();
        for(char c:array){
            s+=c;
        }
        String[] group = s.split(" ");//将字符串用空格进行分割
        String max = group[0];
        for (int i = 1; i < group.length; i++) {
            if (group[i].length() > max.length()) {
                max = group[i];
            }
        }//找出长度最长的数字串
        System.out.println(max);
    }
}
