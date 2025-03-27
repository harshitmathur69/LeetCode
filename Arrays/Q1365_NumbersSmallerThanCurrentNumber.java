package Arrays;

public class Q1365_NumbersSmallerThanCurrentNumber {
    public static void main(String[] args) {
        int[] arr = {8,1,2,2,3};
    }
    public static int[] smallerNumbersThanCurrent(int[] nums){
        int[] arr = new int[nums.length];
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            int number = nums[i];
            count = 0;
            for(int j = 0; j < nums.length; j++) {
                if (number > nums[j]) {
                    count++;
                }
            }
            arr[i] = count;
        }
        return arr;
    }
}
