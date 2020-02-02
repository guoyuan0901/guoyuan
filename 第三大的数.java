package day8;

import java.util.*;

public class 第三大的数 {
    public static int thirdMax(int[] nums) {
       Arrays.sort(nums);
       int count=1;
       int max=nums[nums.length-1];
       for(int i=nums.length-2;i>=0;i--){
           if(nums[i]<max){
               max=nums[i];
               count++;
               if(count>=3){
                   break;
               }
           }
       }
       if(count<3){
           return nums[nums.length-1];
       }
       return max;
    }

    public static void main(String[] args) {
        int[] nums={1,2,2,5,3,5};
        System.out.println(thirdMax(nums));
    }
}
