import sys
#sys.stdin = open("input.txt", "r")
input = sys.stdin.readline

# 5. 동전 분배하기

def DFS(L):
    global m

    if L == n:
        cha = max(money) - min(money)
        if m > cha:
            tmp = set()
            for x in money:
                tmp.add(x)
            if len(tmp) == 3:
                m = cha
    else:
        for i in range(3):
            money[i] += coin[L]
            DFS(L+1)
            money[i] -= coin[L]

n = int(input())
coin = []
for _ in range(n):
    coin.append(int(input()))

money = [0]*3
m = 2147000000
DFS(0)
print(m)
