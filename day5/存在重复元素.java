package day5;

public class 存在重复元素 {
    public static boolean containsDuplicate(int[] nums) {
        int[] array=new int[nums.length];
        array=nums.clone();
        for(int i=0;i<array.length;i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (array[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int []nums={ 1,2,3,4};
        System.out.println(containsDuplicate(nums));
    }
}
