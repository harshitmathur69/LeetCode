package Arrays;

public class Q136_SingleNumber {
    public static void main(String[] args) {
        int[] arr = {4,1,2,1,2};
    }
    public static int singleNumber(int[] nums) {
        int unique = 0;
        for(int n : nums){
            unique ^= n;
        }
        return unique;
    }
}
