package Strings;

public class Q1768_MergeStringsAlternately {
    public static void main(String[] args){
        System.out.println(mergeAlternately("abc","pqr"));

    }

    public static String mergeAlternately(String word1, String word2){
        String ans = "";
        int first = 0;
        int second = 0;
        while(first < word1.length() && second < word2.length()){
            ans = ans + word1.charAt(first);
            first++;
            ans = ans + word2.charAt(second);
            second++;
        }
        while(first < word1.length()){
            ans += word1.charAt(first);
            first++;
        }
        while(second < word2.length()){
            ans += word2.charAt(second);
            second++;
        }
        return ans;
    }
}
