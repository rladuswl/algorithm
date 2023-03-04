import sys
sys.stdin = open("input.txt", "r")
input = sys.stdin.readline

# 8. 사과나무
from collections import deque

dx = [-1, 0, 1, 0]
dy = [0, 1, 0, -1]

n = int(input())
arr = [list(map(int, input().split())) for _ in range(n)]

ch = [[0]*n for _ in range(n)]
Q = deque()
ch[n//2][n//2] = 1
Q.append((n//2, n//2))

L = 0
sum = 0
sum += arr[n//2][n//2]

while True:
    if L == n//2:
        break
    size = len(Q)
    for i in range(size):
        tmp = Q.popleft()
        for j in range(4):
            x = tmp[0] + dx[j]
            y = tmp[1] + dy[j]
            if ch[x][y] == 0:
                sum += arr[x][y]
                ch[x][y] = 1
                Q.append((x, y))

    L+=1

print(sum)