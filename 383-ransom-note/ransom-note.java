class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] magazineChars = new int[26];     
        for (char c : magazine.toCharArray()) 
            magazineChars[c - 'a']++;
        for (char c : ransomNote.toCharArray()) {
            if (magazineChars[c - 'a'] > 0) {
                magazineChars[c - 'a']--;
            } else {
                return false;
            }
        }
        return true;
    }
}
