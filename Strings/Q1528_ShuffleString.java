package Strings;

public class Q1528_ShuffleString {
    public static void main(String[] args) {

    }
    public static String restoreString(String s, int[] indices) {
        char[] chars = new char[indices.length];
        for(int i=0;i<indices.length;i++){
            chars[indices[i]] = s.charAt(i);
        }
        return String.valueOf(chars);
    }
}
