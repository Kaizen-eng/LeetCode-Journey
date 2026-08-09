class Solution {

    public String reverseByType(String s) {

        char[] chars = s.toCharArray();

        int low = 0, high = chars.length - 1;

        while (low < high) {

            while (low < high && !Character.isLetter(chars[low])) {
                low++;
            }

            while (low < high && !Character.isLetter(chars[high])) {
                high--;
            }

            char temp = chars[low];
            chars[low] = chars[high];
            chars[high] = temp;

            low++;
            high--;
        }

        low = 0;
        high = chars.length - 1;

        while (low < high) {

            while (low < high && Character.isLetter(chars[low])) {
                low++;
            }

            while (low < high && Character.isLetter(chars[high])) {
                high--;
            }

            char temp = chars[low];
            chars[low] = chars[high];
            chars[high] = temp;

            low++;
            high--;
        }

        return new String(chars);
        
    }

}
