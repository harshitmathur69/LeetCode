package Arrays;

public class Q35_SearchInsertPosition {
    public static void main(String[] args) {
        int[] arr = {1,3,5,6};
        int target = 2;
    }
    public int searchInsert(int[] nums, int target){
        int start = 0;
        int end = nums.length - 1;
        while(start < end){
            int mid = start + (end - start)/2;
            if(target == nums[mid]){
                return mid;
            }else if(target < nums[mid]){
                end = mid - 1;
            }else if(target > nums[mid]){
                start = mid + 1;
            }
        }
        for(int i = 0; i < nums.length - 1; i++){
            if(target < nums[0]){
                return 0;
            }
            if(nums[i] < target && nums[i+1] > target){
                return i+1;
            }
        }
        if(target > nums[end]) {
            return nums.length;
        }
        return start;
    }
}
