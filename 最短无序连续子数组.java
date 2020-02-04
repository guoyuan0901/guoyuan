package day12;

public class 最短无序连续子数组 {
    public static int findUnsortedSubarray(int[] nums) {
        int left=-1;
        int right=-1;
        int max=nums[0];
        int min=nums[nums.length-1];
        for(int i=1;i<nums.length;i++) {
            if (nums[i] <max) {
                right = i;
            } else {
                max = nums[i];
            }
        }for(int i=nums.length-2;i>=0;i--) {
            if (nums[i]>min) {
                left = i;
            } else {
                min = nums[i];
            }
        }
        if(left==-1) {
            return 0;
        }
        return right-left+1;
    }

    public static void main(String[] args) {
        int []nums={1,3,2,3,3};
        System.out.println(findUnsortedSubarray(nums));
    }
}
