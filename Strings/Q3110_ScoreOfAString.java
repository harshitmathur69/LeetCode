package Strings;

public class Q3110_ScoreOfAString {
    public static void main(String[] args){
        System.out.println(scoreOfString("hello"));
    }
    //    public static int scoreOfString(String s){
//        int sum = 0;
//        int diff = 0;
//        for(int i = 0; i < s.length()-1; i++){
//            diff = (int)(s.charAt(i)) - (int)(s.charAt(i+1));
//            sum += Math.abs(diff);
//        }
//        return sum;
//    }
    public static int scoreOfString(String s) {
        return scoreOfStringHelper(s, 0);
    }

    private static int scoreOfStringHelper(String s, int index) {
        if (index >= s.length() - 1) {
            return 0;
        }
        int diff = Math.abs(s.charAt(index) - s.charAt(index + 1));
        return diff + scoreOfStringHelper(s, index + 1);
    }
}
