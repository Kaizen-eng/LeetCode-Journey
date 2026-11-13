class Solution {

    public int minNumberOfHours(int initialEnergy,int initialExperience,int[] energy,int[] experience) {

        int totalEnergy = 0;

        for (int opponent : energy) {
            totalEnergy += opponent;
        }

        int energyTraining = Math.max(
            0, totalEnergy + 1 - initialEnergy
        );

        int experienceTraining = 0;

        for (int opponent : experience) {

            if (initialExperience <= opponent) {

                int training =
                    opponent - initialExperience + 1;

                experienceTraining += training;
                initialExperience += training;
            }

            initialExperience += opponent;
        }

        return energyTraining + experienceTraining;
    }
}
