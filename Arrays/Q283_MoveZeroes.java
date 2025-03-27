package Arrays;

public class Q283_MoveZeroes {
    public static void main(String[] args) {

    }
    static void moveZeroes1(int[] nums) {
        moveZeroesHelper(nums, 0, 0);
    }

    static void moveZeroesHelper(int[] nums, int currentIndex, int nonZeroIndex) {
        if (currentIndex == nums.length) {
            while (nonZeroIndex < nums.length) {
                nums[nonZeroIndex] = 0;
                nonZeroIndex++;
            }
            return;
        }
        if (nums[currentIndex] != 0) {
            nums[nonZeroIndex] = nums[currentIndex];
            nonZeroIndex++;
        }
        moveZeroesHelper(nums, currentIndex + 1, nonZeroIndex);
    }

//    public void moveZeroes2(int[] nums) {
//        if (nums.length == 1) {
//            return;
//        }
//        int nonZeroIndex = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] != 0) {
//                nums[nonZeroIndex] = nums[i];
//                nonZeroIndex++;
//            }
//        }
//        while(nonZeroIndex<nums.length){
//            nums[nonZeroIndex] = 0;
//            nonZeroIndex++;
//        }
//    }
}
