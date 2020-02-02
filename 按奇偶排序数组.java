package day7;

public class 按奇偶排序数组 {
    public int[] sortArrayByParity(int[] A) {
        if(A==null||A.length==1){
            return A;
        }
        int left=0;
        int right=A.length-1;
        while(left<right){
            if(A[left]%2==0) {
                left++;
            }else if(A[right]%2==0) {
                int n = A[left];
                A[left] = A[right];
                A[right] = n;
                left++;
                right--;
            }else{
                right--;
            }
        }
        return A;
    }
}
