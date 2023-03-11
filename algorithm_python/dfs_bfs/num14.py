import sys
#sys.stdin = open("input.txt", "r")
input = sys.stdin.readline

# 14. 안전영역

# DFS
sys.setrecursionlimit(10**6)

dx = [-1, 0, 1, 0]
dy = [0, 1, 0, -1]

def DFS(x, y, h):
    ch[x][y] = 1
    for i in range(4):
        xx = x + dx[i]
        yy = y + dy[i]
        if (0<=xx<n) and (0<=yy<n) and (ch[xx][yy] == 0) and (graph[xx][yy] > h):
            DFS(xx, yy, h)


n = int(input())
cnt = 0
res = 0
graph = [list(map(int, input().split())) for _ in range(n)]

for h in range(100):
    ch = [[0]*n for _ in range(n)]
    cnt = 0
    for i in range(n):
        for j in range(n):
            if ch[i][j] == 0 and graph[i][j] > h:
                cnt+=1
                DFS(i, j, h)
    res = max(res, cnt)
    if cnt == 0:
        break
print(res)

# BFS
'''
from collections import deque

dx = [-1, 0, 1, 0]
dy = [0, 1, 0, -1]

n = int(input())
graph = [list(map(int, input().split())) for _ in range(n)]

max_arr = []
for line in graph:
    max_arr.append(max(line))
m = max(max_arr)

Q = deque()
ch = [[0]*n for _ in range(n)]
answer = []
for k in range(m):
    cnt = 0
    for i in range(n):
        for j in range(n):
            if graph[i][j] > k:
                ch[i][j] = 1

    for x in range(n):
        for y in range(n):
            if ch[x][y] == 1:
                Q.append((x, y))
                while Q:
                    ch[x][y] = 0
                    a, b = Q.popleft()
                    for t in range(4):
                        xx = a + dx[t]
                        yy = b + dy[t]
                        if (0<=xx<n) and (0<=yy<n) and (ch[xx][yy] == 1):
                            ch[xx][yy] = 0
                            Q.append((xx, yy))
                cnt+=1
    answer.append(cnt)

print(max(answer))
'''