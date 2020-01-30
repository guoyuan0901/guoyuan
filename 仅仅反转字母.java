package day6;

public class 仅仅反转字母 {
    public static String reverseOnlyLetters(String S) {
        int left=0;
        int right=S.length()-1;
        char[]array=S.toCharArray();
        while(left<right) {
            while (left < right && !Isletter(array[left])) {
                left++;
            }
            while (left < right && !Isletter(array[right])) {
                right--;
            }
                char c=array[left];
                array[left]=array[right];
                array[right]=c;
                left++;
                right--;
        }
        return new String(array);
    }
    public static boolean Isletter(char c) {
        if((c>='a'&&c<='z')||(c>='A'&&c<='Z')) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String S="ab-cd";
        System.out.println(reverseOnlyLetters(S));
    }
}
