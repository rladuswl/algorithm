import sys
sys.stdin = open("input.txt", "r")
input = sys.stdin.readline

# 13. 경로 탐색 (그래프 DFS)

def DFS(v):
    global cnt

    if v == n:
        for x in path:
            print(x, end=' ')
        print()
        cnt+=1
    else:
        for i in range(1, n+1):
            if g[v][i] == 1 and ch[i] == 0:
                ch[i] = 1
                path.append(i)
                DFS(i)
                path.pop()
                ch[i] = 0


n, m = map(int, input().split())
g = [[0]*(n+1) for _ in range(n+1)]
for i in range(m):
    a, b = map(int, input().split())
    g[a][b] = 1

cnt = 0
path = []
path.append(1)
ch = [0] * (n+1)
ch[1] = 1
DFS(1)
print(cnt)