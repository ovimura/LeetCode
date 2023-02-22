

class Solution:

    def squareIsWhite(self, coordinates: str) -> bool:
        x = ord(coordinates[0]) - ord('a')
        y = int(coordinates[1])-1
        a = [0, 1]*4
        b = [1, 0]*4
        board = [b, a, b, a, b, a, b, a]
        return board[x][y] == 0


s = Solution()


assert not (s.squareIsWhite("a1"))


