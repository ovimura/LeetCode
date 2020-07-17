

# : list[list[int]]
def minTimeToVisitAllPoints(points) -> int:
    result = 0
    for i in range(len(points)-1):
        result += max(abs(points[i][0]-points[i+1][0]), abs(points[i][1]-points[i+1][1]))
    return result


pts = [[3,2],[-2,2]]

assert minTimeToVisitAllPoints(pts) == 5

print(minTimeToVisitAllPoints(pts))

pts = [[1,1],[3,4],[-1,0]]

# assert minTimeToVisitAllPoints(pts) == 7

print(minTimeToVisitAllPoints(pts))

