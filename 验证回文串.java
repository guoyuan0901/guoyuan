package day11;

public class 验证回文串 {
    public static boolean IscCharacter(char c){
        if((c>='0'&&c<='9')||(c>='a'&&c<='z')||(c>='A'&&c<='Z')){
            return true;
        }
        return false;
    }
    public static boolean isPalindrome(String s) {
        String str=s.toLowerCase();
        StringBuffer stringBuffer=new StringBuffer();
        String[]array=str.split(" ");
        for(String string:array) {
            stringBuffer.append(string);
        }
        System.out.println(stringBuffer);
        int start=0;
        int end=stringBuffer.length()-1;
        while(start<=end){
            if(start<=end&&!IscCharacter(stringBuffer.charAt(start))){
                start++;
            }else if(start<=end&&!IscCharacter(stringBuffer.charAt(end))){
                end--;
            } else{//都是字母字符串
                if((stringBuffer.charAt(start)==stringBuffer.charAt(end))) {
                    start++;
                    end--;
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s="A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
}
