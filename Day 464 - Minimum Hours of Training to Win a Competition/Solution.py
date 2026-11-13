class Solution:
    def minNumberOfHours(self, initialEnergy: int, initialExperience: int,energy: List[int], experience: List[int]) -> int:

        total_energy = sum(energy) + 1
        energy_training = max(0, total_energy - initialEnergy)

        experience_training = 0

        for opponent in experience:

            if initialExperience <= opponent:
                training = opponent - initialExperience + 1

                experience_training += training
                initialExperience += training

            initialExperience += opponent

        return energy_training + experience_training
