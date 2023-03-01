import sys
#sys.stdin = open("input.txt", "r")
input = sys.stdin.readline

# 4. 동전 바꿔주기

def DFS(L, s):
    global cnt

    if s > T:
        return

    if L == k:
        if s == T:
            cnt+=1
    else:
        for i in range(n[L]+1):
            DFS(L+1, s+(p[L]*i))

T = int(input())
k = int(input())
p = list()
n = list()
for _ in range(k):
    a, b = map(int, input().split())
    p.append(a)
    n.append(b)

cnt = 0
DFS(0, 0)
print(cnt)