package day10;

import java.util.Arrays;

public class 在排序数组中查找元素的第一个和最后一个位置 {
    public static int[] searchRange(int[] nums, int target) {
        int begin=-1;
        int end=-1;
        int []array=new int [2];
        if(nums.length==1&&nums[0]==target){
            return array;
        }
        for(int i=0;i<nums.length;i++) {
            if (nums[i] == target) {
                begin = i;
               break;
            }
        }
        for(int i=nums.length-1;i>=0;i--) {
            if (nums[i] == target) {
                end = i;
                break;
            }
        }
        array[0]=begin;
        array[1]=end;
        return array;
    }

    public static void main(String[] args) {
        int []nums={1};
        int target=1;
        System.out.println(Arrays.toString(searchRange(nums,target)));
    }
}
