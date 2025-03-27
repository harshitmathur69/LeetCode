package Arrays;

public class Q1929_ConcatenationOfArray {
    public static void main(String[] args) {

    }
    static int[] getConcatenation(int[] nums){
        int[] ans = new int[nums.length * 2];
        for(int i = 0; i < nums.length * 2;i++){
            while(i < nums.length){
                ans[i] = nums[i];
                i++;
            }
            while(i >= nums.length && i < nums.length*2){
                ans[i] = nums[i - nums.length];
                i++;
            }
        }
        return ans;
    }
}
