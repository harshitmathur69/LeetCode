package Arrays;

public class Q1480_RunningSum1DArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
    }
    public static int[] runningSum(int[] nums) {
        int[] arr = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            if(i == 0){
                arr[i] = nums[i];
            }else{
                arr[i] = arr[i-1] + nums[i];
            }
        }
        return arr;
    }
}
