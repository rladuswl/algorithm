import sys
sys.stdin = open("input.txt", "r")
input = sys.stdin.readline

# 1. 최대점수 구하기 (DFS)

def DFS(L, sum, time):
    global res

    if time > m:
        return

    if L == n:
        if sum > res:
            res = sum
    else:
        DFS(L+1, sum+pv[L], time+pt[L])
        DFS(L+1, sum, time)


n, m = map(int, input().split())
pv = list()
pt = list()
for i in range(n):
    a, b = map(int, input().split())
    pv.append(a)
    pt.append(b)
res = -2147000000
DFS(0, 0, 0)
print(res)