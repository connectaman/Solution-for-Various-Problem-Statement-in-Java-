package LengthofLastWord;

public class Solution {
    public static int lengthOfLastWord(String s) {
        String[] words = s.split(" ");
        if(words.length <= 1){
            return 0;
        }
        String lastword = words[words.length-1];
        int len = lastword.length();
        return len;
    }
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("    "));
        System.out.println(lengthOfLastWord("Hello World"));
    }
}
