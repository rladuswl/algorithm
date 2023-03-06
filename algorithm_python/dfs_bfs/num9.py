import sys
sys.stdin = open("input.txt", "r")
input = sys.stdin.readline

# 9. 미로의 최단거리 통로

from collections import deque

arr = [list(map(int, input().split())) for _ in range(7)]

dx = [-1, 0, 1, 0]
dy = [0, 1, 0, -1]
Q = deque()
Q.append((0, 0))
dis = [[0]*7 for _ in range(7)]
arr[0][0] = 1

while Q:
    p = Q.popleft()

    for i in range(4):
        x = p[0] + dx[i]
        y = p[1] + dy[i]
        if (0<=x<7) and (0<=y<7) and (arr[x][y] == 0):
            arr[x][y] = 1
            dis[x][y] = dis[p[0]][p[1]] + 1
            Q.append((x, y))

if dis[6][6] == 0:
    print(-1)
else:
    print(dis[6][6])

