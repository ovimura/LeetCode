import random
from typing import List


def sorting(arr) -> List[int]:
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


# a = [2, 1, 4, 2, 1, 3]
a = [2, 1, 4, 4, 2, 1, 3, 3]

random.shuffle(a)

assert [1, 1, 2, 2, 3, 3, 4, 4] == sorting(a)



