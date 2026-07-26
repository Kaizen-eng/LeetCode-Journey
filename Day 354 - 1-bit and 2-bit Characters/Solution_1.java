class Solution {

    public boolean isOneBitCharacter(int[] bits) {

        int op = 0;

        for (int i = 0; i < bits.length; i++) {

            if (bits[i] == 0) {
                op = 1;
            }

            if (bits[i] == 1) {
                i++;
                op = 2;
            }
        }

        return op == 1;
    }
}
