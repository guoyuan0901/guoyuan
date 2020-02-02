package day7;

public class 寻找数组中心索引 {
    public int pivotIndex(int[] nums) {
        int left=0;
        int sum=0;
        for(int i=1;i<nums.length;i++) {
            sum += nums[i];
        }
        for(int j=0;j<nums.length;j++) {
            if(left*2+nums[j]==sum){
                return j;
            }
            left+=nums[j];
        }
        return -1;
    }
}
