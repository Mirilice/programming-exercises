package leetcode.Strings;

public class Solution58 {
    public int lengthOfLastWord(String s) {
        int total = 0;
        String word = s.trim();
        int i = word.length() - 1;
        
        while (i >= 0 && word.charAt(i) != ' '){
            total++;
            i--;
        }
        return total;
    }
}

