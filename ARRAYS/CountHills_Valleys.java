package ARRAYS;

public class CountHills_Valleys{
    public int countHillValley(int[] nums) {
        int hill=0;
        int valley=0;
        for(int i=1;i<nums.length-1;i++){
            int left  = i-1;
            int right  = i+1;

            while(right<nums.length && nums[right]==nums[i]){
                right++;
            }
            while(left>=0 && nums[left]==nums[i]){
                left--;
            }
            if(left>=0 && right<nums.length){
                if(nums[i]>nums[left] && nums[i]>nums[right]){
                    hill++;
                }
                else if(nums[i]<nums[left] && nums[i]<nums[right]){
                    valley++;
                }
            }
            if (right != i + 1) i = right - 1;
        }
        return hill+valley;
    }
}

