import sys
#sys.stdin = open("input.txt", "r")

# 5. 바둑이 승차 - Cut Edge Tech (DFS)

def DFS(L, sum, tsum):
    global result

    # 이 조건문이 Cut Edge 하는 역할
    if sum + (total - tsum) < result:
        return

    if sum > c:
        return

    if L == n:
        if sum > result:
            result = sum
        return
    else:
        DFS(L+1, sum+w[L], tsum+w[L])
        DFS(L+1, sum, tsum+w[L])


c, n = map(int, input().split())
w = [0] * n
result = -2147000000
for i in range(n):
    w[i] = int(input())
total = sum(w)
DFS(0, 0, 0)
print(result)