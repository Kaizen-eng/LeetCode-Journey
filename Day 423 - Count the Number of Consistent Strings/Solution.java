class Solution {

    public int countConsistentStrings(String allowed, String[] words) {

        int n = 0;

        Set<Character> allowedSet = new HashSet<>();

        for (char ch : allowed.toCharArray()) {

            allowedSet.add(ch);

        }

        for (String word : words) {
            boolean consistent = true;

            for (char ch : word.toCharArray()) {
                if (!allowedSet.contains(ch)) {
                    consistent = false;
                    break;
                }
            }

            if (consistent) n++;

        }

        return n;
        
    }

}
