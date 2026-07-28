class Solution {
    public String smallestPalindrome(String s) {

        // Step 1: Count the frequency of each character
        int[] freq = new int[26];

        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }

        // Step 2: Build the left half
        StringBuilder left = new StringBuilder();
        char middle = '\0';

        for (int i = 0; i < 26; i++) {

            // Add half of each character to the left half
            for (int j = 0; j < freq[i] / 2; j++) {
                left.append((char) ('a' + i));
            }

            // If any character has an odd count,
            // it'll become the middle character.
            if (freq[i] % 2 == 1) {
                middle = (char) ('a' + i);
            }
        }

        // Step 3: Build the answer
        StringBuilder ans = new StringBuilder();

        ans.append(left);

        if (middle != '\0') {
            ans.append(middle);
        }

        // Mirror the left half
        ans.append(new StringBuilder(left).reverse());

        return ans.toString();
    }
}
