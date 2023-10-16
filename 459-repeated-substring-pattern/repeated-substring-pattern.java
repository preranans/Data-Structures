class Solution {
    public boolean repeatedSubstringPattern(String s) {
    int n = s.length();
    for (int substringLength = 1; substringLength <= n / 2; substringLength++) {
        if (n % substringLength == 0) {
            String repeatedSubstring = s.substring(0, substringLength);
            StringBuilder repeatedString = new StringBuilder();
            for (int i = 0; i < n / substringLength; i++) {
                repeatedString.append(repeatedSubstring);
            }
            if (repeatedString.toString().equals(s)) {
                return true;
            }
        }
    }
    return false;
}
}