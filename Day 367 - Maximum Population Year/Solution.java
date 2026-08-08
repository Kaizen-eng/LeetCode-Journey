class Solution {

    public int maximumPopulation(int[][] logs) {

        int[] population = new int[101];

        for (int[] log : logs) {
            
            int birth = log[0];
            int death = log[1];
            
            population[birth - 1950]++;
            population[death - 1950]--;
        }
        
        int currentPopulation = 0;
        int maxPopulation = 0;
        int answer = 1950;
        
        for (int i = 0; i < 101; i++) {
            
            currentPopulation += population[i];
            
            if (currentPopulation > maxPopulation) {
                maxPopulation = currentPopulation;
                answer = i + 1950;
            }
        }
        
        return answer;
        
    }

}
