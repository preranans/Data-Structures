public class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        if (s.isEmpty()) {
            return 0;
        }
        StringBuilder reversed = new StringBuilder(s).reverse();
        int count = 0;
        int i = 0;
        while (i < reversed.length() && reversed.charAt(i) != ' ') {
            i++;
            count++;
        }
        return count;
    }
}
