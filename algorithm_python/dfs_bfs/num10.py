import sys
sys.stdin = open("input.txt", "r")
input = sys.stdin.readline

# 10. 미로탐색 (DFS)
def DFS(x, y):
    global cnt

    if x == 6 and y == 6:
        cnt+=1
    else:
        for i in range(4):
            xx = x + dx[i]
            yy = y + dy[i]
            if (0<=xx<7) and (0<=yy<7) and (graph[xx][yy] == 0):
                graph[xx][yy] = 1
                DFS(xx, yy)
                graph[xx][yy] = 0


graph = [list(map(int, input().split())) for _ in range(7)]

dx = [-1, 0, 1, 0]
dy = [0, 1, 0, -1]
graph[0][0] = 1
cnt = 0
DFS(0, 0)
print(cnt)