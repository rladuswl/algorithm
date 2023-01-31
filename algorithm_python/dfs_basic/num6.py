import sys
#sys.stdin = open("input.txt", "r")
input = sys.stdin.readline

# 6. 중복순열 구하기

def DFS(L):
    global cnt

    if L == m:
        for x in res:
            print(x, end=' ')
        print()
        cnt+=1
    else:
        for i in range(1, n+1):
            res[L] = i
            DFS(L+1)


n, m = map(int, input().split())
cnt = 0
res = [0] * m
DFS(0)
print(cnt)