from typing import List

class Solution:
    def minNumberOfHours(self, initialEnergy: int, initialExperience: int, energy: List[int], experience: List[int]) -> int:
        n = len(energy)
        tenerty = [0]*n
        texperience = [0]*n
        t_en = 0
        t_ex = 0
        for i in range(n):
            if initialEnergy > energy[i]:
                tenerty[i] = (initialEnergy - energy[i])
                initialEnergy -= energy[i]
            else:
                temp_energy = ((energy[i] - initialEnergy) + 1)
                t_en += temp_energy
                initialEnergy = (initialEnergy + temp_energy) - energy[i]
                tenerty[i] = initialEnergy
            if initialExperience > experience[i]:
                texperience[i] = (experience[i] + initialExperience)
                initialExperience += experience[i]
            else:
                temp_experience = (experience[i] - initialExperience) + 1
                t_ex += temp_experience
                initialExperience = (initialExperience + temp_experience) + experience[i]
                texperience[i] = initialExperience
        r = t_ex + t_en
        return r


s = Solution()

assert 8 == (s.minNumberOfHours(5, 3, [1, 4, 3, 2], [2, 6, 3, 1]))

