import sys
#sys.stdin = open("input.txt", "r")
input = sys.stdin.readline

# 13. 섬나라 아일랜드

from collections import deque

dx = [-1, -1, 0, 1, 1, 1, 0, -1]
dy = [0, 1, 1, 1, 0, -1, -1, -1]

n = int(input())
graph = [list(map(int, input().split())) for _ in range(n)]

cnt = 0
Q = deque()
for i in range(n):
    for j in range(n):
        if graph[i][j] == 1:
            Q.append((i, j))
            graph[i][j] = 0
            while Q:
                a, b = Q.popleft()
                for k in range(8):
                    xx = a + dx[k]
                    yy = b + dy[k]
                    if (0<=xx<n) and (0<=yy<n) and (graph[xx][yy] == 1):
                        Q.append((xx, yy))
                        graph[xx][yy] = 0
            cnt+=1
print(cnt)