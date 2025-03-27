package Arrays;

public class Q540_SingleElementInSortedArray {
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,3,4,4,8,8};
    }
    public int singleNonDuplicate(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        for(int i = 0; i < nums.length; i++){
            if(i == 0 && nums[i] != nums[i+1]){
                return nums[i];
            }
            else if(i == nums.length - 1 && nums[i] != nums[i-1]){
                return nums[i];
            }
            else if( i > 0 && i < nums.length && nums[i] != nums[i-1] && nums[i] != nums[i+1]){
                return nums[i];
            }
        }
        return -1;
    }
}
