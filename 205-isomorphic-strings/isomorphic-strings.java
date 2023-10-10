class Solution {
    public boolean isIsomorphic(String s, String t) {
        int n1 = s.length();
        int n2 = t.length();

        if (n1 != n2)
            return false;

        char[] c1 = new char[256]; 
        char[] c2 = new char[256]; 

        for (int i = 0; i < n1; i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);

            if (c1[charS] != 0) {
                if (c1[charS] != charT) {
                    return false;
                }
            } else {
                c1[charS] = charT;
            }

            if (c2[charT] != 0) {
                if (c2[charT] != charS) {
                    return false;
                }
            } else {
                c2[charT] = charS;
            }
        }

        return true;
    }
}

