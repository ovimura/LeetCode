from typing import List


class Solution:

    @staticmethod
    def shuffle(nums: List[int], n: int) -> List[int]:
        li = []
        j = 0
        for i in range(0, len(nums), 2):
            li.append(nums[j])
            li.append(nums[n+j])
            j += 1
        return li


def main():
    s = Solution()
    nums = [2, 5, 1, 3, 4, 7]
    result = s.shuffle(nums, 3)
    expected_output = [2, 3, 5, 4, 1, 7]
    assert result == expected_output
    failed = False
    for i in range(0, len(nums)):
        if result[i] != expected_output[i]:
            failed = True
    if failed:
        print("Test for Solution Implementation Failed!")
    else:
        print("Test for Solution Implementation Passed!")


if __name__ == "__main__":
    main()

