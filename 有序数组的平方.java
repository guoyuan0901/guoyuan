package day6;

import java.util.Arrays;

public class 有序数组的平方 {
    public static int[] sortedSquares(int[] A) {
        for(int i=0;i<A.length;i++){
            A[i]=A[i]*A[i];
        }
        Arrays.sort(A);//负数平方之后可能大，所以需要先平方再排序
        return A;
    }

    public static void main(String[] args) {
        int[]A={-4,-1,0,3,10};
        System.out.println(Arrays.toString(sortedSquares(A)));
    }
}
