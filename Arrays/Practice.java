package Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class Practice{
    public static void main(String[] args){
        char[] arr = {'c','f','j'};
        System.out.println(nextGreatestLetter(arr,'d'));
    }
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