class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {

        List<String> result = new ArrayList<>();

        for (String word : words) {

            StringBuilder sb = new StringBuilder();

            for (char ch : word.toCharArray()) {

                if (ch == separator) {

                    if (sb.length() > 0) {
                        result.add(sb.toString());
                        sb.setLength(0);
                    }

                } else {
                    sb.append(ch);
                }
            }

            if (sb.length() > 0) {
                result.add(sb.toString());
            }
        }

        return result;
    }
}
