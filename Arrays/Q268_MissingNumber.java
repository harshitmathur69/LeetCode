package Arrays;

import java.util.Arrays;

public class Q268_MissingNumber {
    public static void main(String[] args) {
        int[] arr = {3,0,1};

    }
    public static int missingNumber(int[] nums) {
        int i = 0;
        while(i < nums.length){
            int CorrectIndex = nums[i];
            if(nums[i] < nums.length && nums[i] != nums[CorrectIndex]){
                int temp = nums[i];
                nums[i] = nums[CorrectIndex];
                nums[CorrectIndex] = temp;
            }else{
                i++;
            }
        }
        for(int index = 0; index < nums.length; index++){
            if(index != nums[index]){
                return index;
            }
        }
        return nums.length;
    }

}
