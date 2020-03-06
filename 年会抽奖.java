package day5;

import java.util.Scanner;
//假设a的名字没有被a拿到，其他n - 1个人都有可能拿到，即有n - 1种情况。
// 假设b拿到了a的名字，那么对于b的名字有两种情况，
//第一种是b的名字被a拿到了，也就是a、b互相拿到了对方的名字，那么对于其他n - 2个人互相拿错又是一个子问题f(n - 2).
//第二种是b的名字没有被a拿到，则剩下的问题是子问题f(n - 1).
//因此可得递推公式f(n) = (n - 1) * (f(n - 1) + f(n - 2)).
//最终得出公式n人都不获奖的概率h(n) = (n - 1) * (f(n - 1) + f(n - 2)) / (n!).
public class 年会抽奖 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while(in.hasNext()){
            int n=in.nextInt();
            float m=(num(n)/factorial(n))*100;
            System.out.printf("%.2f",m);
            System.out.println("%");
        }
    }

    private static float factorial(int n) {
        if(n==0){
            return 1;
        }
        return n*factorial(n-1);
    }//分子

    private static float num(int n) {
        if(n==1){
            return 0;//一个人的时候绝对中奖
        }
        if(n==2){
            return 1;//2个人是，有可能两个人互相拿了对方的名字
        }
        return (n-1)*(num(n-1)+num(n-2));
        //

    }//分母
}
