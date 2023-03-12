from typing import List


class Solution:
    def findRotation(self, mat: List[List[int]], target: List[List[int]]) -> bool:
        count_rotate = 0
        while not self.isEqual(mat, target) and count_rotate < 4:
            mat = self.rotate(mat)
            count_rotate += 1
        return count_rotate < 4

    def isEqual(self, m1, m2) -> bool:
        for i in range(len(m1)):
            for j in range(len(m1[0])):
                if m1[i][j] != m2[i][j]:
                    return False
        return True

    def rotate(self, mat) -> List[List]:
        temp = [[0]*len(mat) for _ in range(len(mat))]
        for i in range(len(mat)):
            row = []
            for j in range(len(mat[0])):
                row.append(mat[i][j])
            r = len(temp)-i-1
            for k in range(len(row)):
                temp[k][r] = row[k]
        return temp

    def prin(self, mat):
        for i in range(len(mat)):
            out = "["
            for j in range(len(mat[0])):
                out += str(mat[i][j]) + ","
            out += "]"
            print(out)


ss = Solution()

# ss.print([[1,2,3], [2,3,4], [3,4,5]])
# ss.rotate([[1,2,3], [2,3,4], [3,4,5]], [[1,2,3], [2,3,4], [3,4,5]])
print(ss.findRotation([[1,2,3], [2,3,4], [3,4,5]], [[1,2,3], [2,3,4], [3,4,5]]))
