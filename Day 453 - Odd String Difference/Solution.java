class Solution {

    public String oddString(String[] words) {

          for (int i = 0; i < words.length; i++) {
            int[] current = new int[words[i].length() - 1];

            for (int j = 0; j < words[i].length() - 1; j++) {
                current[j] = words[i].charAt(j + 1) - words[i].charAt(j);
            }

            boolean found = false;

            for (int k = 0; k < words.length; k++) {
                if (i == k) continue;

                boolean same = true;

                for (int j = 0; j < current.length; j++) {
                    int diff = words[k].charAt(j + 1) - words[k].charAt(j);

                    if (current[j] != diff) {
                        same = false;
                        break;
                    }
                }

                if (same) {
                    found = true;
                    break;
                }
            }

            if (!found) return words[i];
        }

        return "";
        
    }

}
