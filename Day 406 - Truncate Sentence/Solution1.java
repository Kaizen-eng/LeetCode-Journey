class Solution {

    public String truncateSentence(String s, int k) {

        String[] words = s.split(" ");

        String res = words[0];

        for (int i = 1; i < k; i++) {
            res += " " + words[i];
        }

        return res;
    }
}
