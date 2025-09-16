package ARRAYS;

public class Majority_Elements{
    public int majorityElement(int[] nums) {
        int count = 1;
        int x = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(count==0){
                x = nums[i];
                count = 1;
            }else if(nums[i] == x){
                count++;
            }else{
                count--;
            }
        }
        return x;
    }
}
