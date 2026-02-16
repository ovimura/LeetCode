class Solution:
    def distinctIntegers(self, n: int) -> int:
        days = 100000**1
        board = set()
        board.add(n)
        while True:
            r = set()
            for i in range(1, n+1):
                for x in board:
                    if x % i == 1:
                        r.add(i)
            if r.issubset(board):
                break
            board = board.union(r)
        return len(board)


s = Solution()

assert 4 == (s.distinctIntegers(5))