package Strings;

import java.util.ArrayList;
import java.util.List;

public class Q2942_FindWordsContainingCharacter {
    public static void main(String[] args){
        String[] arr = {"abc","bcd","aaaa","cbc"};
        System.out.println(findWordsContaining(arr,'a'));
    }
    //    public static List<Integer> findWordsContaining(String[] words, char x){
//        List<Integer> list = new ArrayList<>();
//        for(int i = 0; i < words.length; i++){
//            for(int j = 0; j < words[i].length(); j++){
//                if(x == words[i].charAt(j)){
//                    list.add(i);
//                    break;
//                }
//            }
//        }
//        return list;
//    }
    public static List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> list = new ArrayList<>();
        findWordsContainingHelper(words, x, 0, list);
        return list;
    }

    private static void findWordsContainingHelper(String[] words, char x, int index, List<Integer> list) {
        if (index >= words.length) {
            return;
        }

        if (words[index].indexOf(x) != -1) {
            list.add(index);
        }

        findWordsContainingHelper(words, x, index + 1, list);
    }
}
