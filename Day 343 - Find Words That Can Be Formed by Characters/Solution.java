class Solution {

    public int countCharacters(String[] words, String chars) {

        int answer = 0;
        int[] freq = new int[26];

        for (int i = 0; i < chars.length(); i++) {
            freq[chars.charAt(i) - 'a']++;
        }

        for (String word : words) {

            boolean valid = true;
            int[] temp = freq.clone();

            for (char ch : word.toCharArray()) {

                temp[ch - 'a']--;

                if (temp[ch - 'a'] < 0) {
                    valid = false;
                    break;
                }
            }

            if (valid) {
                answer += word.length();
            }
        }

        return answer;
    }
}
