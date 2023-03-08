import sys
#sys.stdin = open("input.txt", "r")
input = sys.stdin.readline

# 11. 등산경로
dx = [-1, 0, 1, 0]
dy = [0, 1, 0, -1]

def DFS(x, y):
    global cnt

    if x == max_x and y == max_y:
        cnt+=1
    else:
        for i in range(4):
            xx = x + dx[i]
            yy = y + dy[i]
            if (0<=xx<n) and (0<=yy<n) and (graph[x][y]<graph[xx][yy]):
                if ch[xx][yy] == 0:
                    ch[xx][yy] = 1
                    DFS(xx, yy)
                    ch[xx][yy] = 0

n = int(input())
graph = [list(map(int, input().split())) for _ in range(n)]

ch = [[0]*n for _ in range(n)]
graph_min = 2147000000
graph_max = -2147000000
min_x, min_y = 0, 0
max_x, max_y = 0, 0
for i in range(n):
    for j in range(n):
        if graph[i][j] < graph_min:
            graph_min = graph[i][j]
            min_x, min_y = i, j
        elif graph[i][j] > graph_max:
            graph_max = graph[i][j]
            max_x, max_y = i, j

cnt = 0
ch[min_x][min_y] = 1
DFS(min_x, min_y)
print(cnt)
