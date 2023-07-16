
import heapq


class Solution:
    def largestInteger(self, num: int) -> int:
        even = []
        odd = []
        res = []
        cstr = str(num)
        for i in cstr:
            if int(i) % 2 == 0:
                even.append(-int(i))
            else:
                odd.append(-int(i))
        heapq.heapify(even)
        heapq.heapify(odd)
        for value in cstr:
            val = int(value)
            if val % 2 == 0:
                res.append(str(-heapq.heappop(even)))
            else:
                res.append(str(-heapq.heappop(odd)))
        return int("".join(res))


s = Solution()

assert 3162 == (s.largestInteger(3162))
assert 3412 == (s.largestInteger(1234))
assert 87655 == (s.largestInteger(65875))
assert 427 == (s.largestInteger(247))

