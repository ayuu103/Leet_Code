public class Solution {
    public int longestPalindrome(String s) {
int[] Count = new int[128];
        for (char c : s.toCharArray()) {
            Count[c]++;
        }

        int length = 0;
        for (int count :Count) {
            length += (count / 2) * 2;
            if (length % 2 == 0 && count % 2 == 1) {
                length++;
            }
        }
        return length;
    }
}