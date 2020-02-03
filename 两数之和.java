package day9;

import java.util.Arrays;

public class 两数之和 {
    public static int[] twoSum(int[] nums, int target) {
        int []array=new int [2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    array[0]=i;
                    array[1]=j;
                    break;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int []nums={3,3};
        int target=6;
        System.out.println(Arrays.toString(twoSum(nums,target)));
    }
}
