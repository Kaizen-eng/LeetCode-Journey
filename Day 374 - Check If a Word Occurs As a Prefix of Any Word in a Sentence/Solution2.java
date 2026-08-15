class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {

        int L = 0;
        int wordIndex = 1;

        while (L < sentence.length()) {

            int R = L;
            int i = 0;

            while (R < sentence.length()
                    && sentence.charAt(R) != ' '
                    && i < searchWord.length()) {

                if (sentence.charAt(R) != searchWord.charAt(i)) {
                    break;
                }

                R++;
                i++;
            }

            if (i == searchWord.length()) {
                return wordIndex;
            }

            while (R < sentence.length() && sentence.charAt(R) != ' ') {
                R++;
            }

            L = R + 1;
            wordIndex++;
        }

        return -1;
    }
}
