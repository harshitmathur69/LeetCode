package Arrays;

public class Q88_MergeSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,0,0,0};
        int[] arr2 = {2,5,6};
        merge(arr1,3,arr2,3);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int f = m - 1;
        int s = n - 1;
        int index = m + n - 1;
        while (f >= 0 && s >= 0) {
            if (nums1[f] > nums2[s]) {
                nums1[index] = nums1[f];
                f--;
            } else {
                nums1[index] = nums2[s];
                s--;
            }
            index--;
        }
        while (s >= 0) {
            nums1[index] = nums2[s];
            s--;
            index--;
        }
    }
}
