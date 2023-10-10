class Solution {
    public boolean isAnagram(String s, String t) {
        int len1 = s.length();
        int len2 = t.length();

        if (len1 != len2)
            return false;

        char c1[] = s.toCharArray();
        char c2[] = t.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        for (int i = 0; i < len1; i++) {
            if (c1[i] != c2[i]) {
                return false;
            }
        }
        return true;
    }
}

