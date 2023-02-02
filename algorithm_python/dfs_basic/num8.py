import sys
#sys.stdin = open("input.txt", "r")
input = sys.stdin.readline

# 8. 순열 구하기

def DFS(L):
    global cnt
    global ch

    if L == m:
        for x in res:
            print(x, end=' ')
        print()
        cnt += 1
    else:
        for i in range(1, n+1):
            if ch[i] == 0:
                res[L] = i
                ch[i] = 1
                DFS(L+1)
                ch[i] = 0


n, m = map(int, input().split())
res = [0] * m
cnt = 0
ch = [0] * (n+1)
DFS(0)
print(cnt)