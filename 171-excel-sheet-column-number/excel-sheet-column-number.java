class Solution {
    public int titleToNumber(String columnTitle) {
        int result = 0;
        for (int i = 0; i < columnTitle.length(); i++) {
            int digit = (int) columnTitle.charAt(i) - 'A' + 1;
            result = result * 26 + digit;
        }
        return result;
    }
}
