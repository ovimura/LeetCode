from typing import List


class Solution:
    def minMovesToSeat(self, seats: List[int], students: List[int]) -> int:
        seats.sort()
        students.sort()
        min_moves = 0
        for i in range(len(seats)):
            min_moves += (abs(seats[i] - students[i]))
        return min_moves


s = Solution()

assert 4 == (s.minMovesToSeat([3, 1, 5], [2, 7, 4]))

