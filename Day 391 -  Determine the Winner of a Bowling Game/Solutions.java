class Solution {

    public int isWinner(int[] player1, int[] player2) {

        int score1 = calculateScore(player1);
        int score2 = calculateScore(player2);

        if (score1 > score2)
            return 1;
        else if (score2 > score1)
            return 2;
        else
            return 0;
    }

    private int calculateScore(int[] player) {

        int total = 0;

        for (int i = 0; i < player.length; i++) {

            int current = player[i];

            if ((i > 0 && player[i - 1] == 10) ||
                (i > 1 && player[i - 2] == 10)) {

                current *= 2;
            }

            total += current;
        }

        return total;
    }
}
