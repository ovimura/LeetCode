from typing import List


class Solution:
    def closetTarget(self, words: List[str], target: str, startIndex: int) -> int:
        r = 0
        n = len(words)
        l = 0
        i = startIndex
        while words[i % n] != target:
            i += 1
            r += 1
            if r > n:
                break
        j = startIndex
        while words[j % n] != target:
            j -= 1
            l += 1
            if l > n:
                break
        if min(r, l) > n:
            return -1
        else:
            return min(r, l)


s = Solution()

assert 4 == (s.closetTarget(["hsdqinnoha","mqhskgeqzr","zemkwvqrww","zemkwvqrww","daljcrktje","fghofclnwp","djwdworyka",
                      "cxfpybanhd","fghofclnwp","fghofclnwp"],
                     "zemkwvqrww", 8))

assert 1 == (s.closetTarget(["a", "b", "leetcode"], "leetcode", 0))

assert 1 == (s.closetTarget(["hello", "i", "am", "leetcode", "hello"], "hello", 1))

assert -1 == (s.closetTarget(["i", "eat", "leetcode"], "ate", 0))
