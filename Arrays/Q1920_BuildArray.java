package Arrays;

public class Q1920_BuildArray {
    public static void main(String[] args) {
        int[] arr = {0,2,1,5,3,4};
    }
    public static int[] buildArray1(int[] nums){
        int[] ans = new int[nums.length];
        buildArrayHelper(nums,ans, 0);
        return ans;
    }

    public static void buildArrayHelper(int[] nums,int[] ans,int i) {
        if(i == nums.length){
            return;
        }
        ans[i] = nums[nums[i]];
        buildArrayHelper(nums,ans,i+1 );
    }

//    public static int[] buildArray2(int[] nums) {
//        int[] arr = new int[nums.length];
//        for(int i = 0; i < nums.length; i++){
//            arr[i] = nums[nums[i]];
//        }
//        return arr;
//    }
}
