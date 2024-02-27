import timeit
import random


def average_eligible_divisible(nums, divisors):
    """
    Calculates the average of numbers divisible by any element in divisors.
    """

    total_sum = 0
    count = 0
    for num in nums:
        if any(num % divisor == 0 for divisor in divisors):
            total_sum += num
            count += 1

    return total_sum // count if count > 0 else 0


# Test cases
def test_average_eligible_divisible():
    assert average_eligible_divisible([1, 3, 6, 10, 12, 15], [3]) == 9
    assert average_eligible_divisible([1, 2, 4, 5, 8, 10], [2, 5]) == 5
    assert average_eligible_divisible([2, 3, 5, 7, 11], [3, 5]) == 4
    assert average_eligible_divisible([], [3]) == 0


# Performance measurement
def measure_performance(nums_length, divisors):
    nums = random.sample(range(1, 10000), nums_length)  # Create random list
    stmt = f"average_eligible_divisible(nums, {divisors})"
    setup = "from __main__ import average_eligible_divisible, nums"
    time_taken = timeit.timeit(stmt=stmt, setup=setup, number=10000)
    print(f"Array Length: {nums_length}, Time: {time_taken:.5f} seconds")


if __name__ == "__main__":
    test_average_eligible_divisible()  # Run test cases
    print("Tests passed!")

    # Measure performance with different array sizes and divisors
    measure_performance(1000, [3, 5])
    measure_performance(5000, [3, 5, 7])
    measure_performance(10000, [2, 3, 5, 7, 11])



