class Solution:
    def minimumMoves(self, s: str) -> int:
        min_moves = 0
        start = 0
        while start < len(s) and s[start] == 'O':
            start += 1
        if start < len(s):
            i = start
            while i < len(s):
                if s[i] == 'O':
                    while i < len(s) and s[i] == 'O':
                        i += 1
                if 'X' in s[i:i + 3]:
                    min_moves += 1
                i += 3
        return min_moves


ss = Solution()

assert 1 == (ss.minimumMoves("XXX"))
assert 2 == (ss.minimumMoves("XXOX"))
assert 0 == (ss.minimumMoves("OOOO"))
assert 1 == (ss.minimumMoves("OXOX"))
assert 2 == (ss.minimumMoves("OOOOXXXOXO"))
assert 2 == (ss.minimumMoves("XXXOOXXX"))
