class Solution {

    public int[] findEvenNumbers(int[] digits) {

        boolean[] found = new boolean[1000];

        for (int i = 0; i < digits.length; i++) {
            for (int j = 0; j < digits.length; j++) {
                for (int k = 0; k < digits.length; k++) {
                    if (i == j || j == k || i == k) continue;
                    if (digits[i] == 0) continue;
                    if (digits[k] % 2 != 0) continue;

                    int number = digits[i] * 100 + digits[j] * 10 + digits[k];
                    found[number] = true;
                }
            }
        }

        int count = 0;
        for (int num = 100; num < 1000; num++) {
            if (found[num]) count++;
        }

        int[] answer = new int[count];
        int index = 0;

        for (int num = 100; num < 1000; num++) {
            if (found[num]) {
                answer[index++] = num;
            }
        }

        return answer;
        
    }

}
