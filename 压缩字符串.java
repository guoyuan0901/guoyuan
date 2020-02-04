package day11;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class 压缩字符串 {
    public static char[] compress(char[] chars) {
        Map<Character,Integer> map=new TreeMap<>();
        for(char c:chars){
            int n=map.getOrDefault(c,0)+1;
            map.put(c,n);
        }
        char []array=new char[map.size()*2];
        int index=0;
        for(Map.Entry<Character,Integer> e:map.entrySet()){
            char c=e.getKey();
            array[index++]=c;
            int n=e.getValue();
            array[index++]=(char)(n+'0');
        }
        return array;
    }

    public static void main(String[] args) {
        char[]chars={'a','a','b','b','c','c','c'};
        System.out.println(Arrays.toString(compress(chars)));
    }
}
