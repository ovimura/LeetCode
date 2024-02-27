import random
from typing import List


def insertion_sorting(arr) -> List[int]:
    """
    Insertion sort is a simple sorting algorithm that builds the final sorted array (or list) one item at a time by
    comparisons. https://en.wikipedia.org/wiki/Insertion_sort
    :param arr: an array of int elements
    :return: sorted array of int elements
    """
    q = []
    while len(arr) != 0:  # n elements in arr
        i = arr.pop(0)
        if len(q) == 0:
            q.append(i)
        elif i <= q[0]:
            q = [i] + q
        elif i >= q[-1]:
            q.append(i)
        elif len(q) == 2:
            q = [q[0], i, q[1]]
        else:
            for j in range(1, len(q)-1):
                if q[j] <= i < q[j + 1]:
                    t1 = q[:j+1]
                    t1.append(i)
                    q = t1 + q[j+1:]
                    break
                elif q[j] > i > q[j - 1]:
                    t1 = q[:j]
                    t1.append(i)
                    q = t1 + q[j:]
                    break
    return q


a = [2, 1, 4, 4, 2, 1, 3, 3]

random.shuffle(a)

assert [1, 1, 2, 2, 3, 3, 4, 4] == insertion_sorting(a)



