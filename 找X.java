package day3;

import java.util.Scanner;

public class 找X {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while(in.hasNext()){
            int n=in.nextInt();
            int array[]=new int[n];
            for(int i=0;i<n;i++){
                array[i]=in.nextInt();
            }
            int x=in.nextInt();
            int flag=0;
            for(int i=0;i<n;i++){
                if(array[i]==x){
                    System.out.println(i);
                    flag=1;
                }
            }
            if(flag==0) {
                System.out.println(-1);
            }
        }
    }
}
