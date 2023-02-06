import sys
#sys.stdin = open("input.txt", "r")
input = sys.stdin.readline

# 10. 조합 구하기

def DFS(L, s):
    global cnt

    if L == m:
        for x in res:
            print(x, end=' ')
        print()
        cnt+=1
    else:
        for i in range(s, n+1):
            res[L] = i
            DFS(L+1, i+1)


n, m = map(int, input().split())
res = [0]*m
cnt = 0
DFS(0, 1)
print(cnt)