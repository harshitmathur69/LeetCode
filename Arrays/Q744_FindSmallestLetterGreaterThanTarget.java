package Arrays;

public class Q744_FindSmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
        char[] arr = {'c','f','j'};
        char target = 'a';
    }
//    public char nextGreatestLetter(char[] letters, char target){
//        int start = 0;
//        int end = letters.length - 1;
//        while(start <= end){
//            int mid = start + (end - start)/2;
//            if(target < letters[mid]){
//                end = mid - 1;
//            }else{
//                start = mid + 1;
//            }
//        }
//        return letters[start % letters.length];
//    }
    public static char nextGreatestLetter(char[] letters, char target){
        for(int i = 0; i < letters.length; i++){
            if(letters[i] > target){
                char candidate = letters[i];
                for(int j = i+1; j < letters.length; j++){
                    if(letters[j] > target && letters[j] < candidate){
                        candidate = letters[j];
                    }
                }
                return candidate;
            }
        }
        return letters[0];
    }
}
