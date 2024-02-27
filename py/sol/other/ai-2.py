from typing import List


def distinctAverages(nums: List[int]) -> int:
    dist_avg = set()
    while len(nums) != 0:
        m1:int = min(nums)
        m2:int = max(nums)
        dist_avg.add((m1+m2)/2)
        nums.remove(m1)
        nums.remove(m2)
    return len(dist_avg)


print(distinctAverages([1,2,3,4]))

assert distinctAverages([1, 2, 3, 4]) == 1

assert distinctAverages([]) == 0

assert distinctAverages([4, 1, 4, 0, 3, 5]) == 2

assert distinctAverages([4, 4]) == 1


