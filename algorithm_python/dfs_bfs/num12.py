import sys
#sys.stdin = open("input.txt", "r")
input = sys.stdin.readline

# 12. 단지 번호 붙이기

# BFS
from collections import deque

Q = deque()
dx = [-1, 0, 1, 0]
dy = [0, 1, 0, -1]

def BFS(x, y):
    global count

    Q.append((x, y))
    graph[x][y] = 0
    count = 1

    while Q:
        a, b = Q.popleft()
        for k in range(4):
            xx = a + dx[k]
            yy = b + dy[k]
            if (0<=xx<n) and (0<=yy<n) and (graph[xx][yy] == 1):
                graph[xx][yy] = 0
                Q.append((xx, yy))
                count+=1

n = int(input())
graph = [list(map(int, input().rstrip())) for _ in range(n)]

cnt = 0
count = 0
answer = []
for i in range(n):
    for j in range(n):
        if graph[i][j] == 1:
            BFS(i, j)
            cnt+=1
            answer.append(count)
            count = 0


print(cnt)
answer.sort()
for x in answer:
    print(x)


# DFS
'''
dx = [-1, 0, 1, 0]
dy = [0, 1, 0, -1]

def DFS(x, y):
    global cnt

    cnt+=1
    graph[x][y] = 0
    for i in range(4):
        xx = x + dx[i]
        yy = y + dy[i]
        if (0<=xx<n) and (0<=yy<n) and (graph[xx][yy] == 1):
            DFS(xx, yy)


n = int(input())
graph = [list(map(int, input().rstrip())) for _ in range(n)]
res = []
for i in range(n):
    for j in range(n):
        if graph[i][j] == 1:
            cnt=0
            DFS(i, j)
            res.append(cnt)

print(len(res))
res.sort()
for x in res:
    print(x)
'''