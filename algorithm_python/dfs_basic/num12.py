import sys

# sys.stdin = open("input.txt", "r")
input = sys.stdin.readline

# 12. 인접행렬 (가중치 방향그래프)

n, m = map(int, input().split())

answer = [[0] * n for _ in range(n)]
for i in range(m):
    a, b, c = map(int, input().split())
    answer[a - 1][b - 1] = c

for i in range(len(answer)):
    for j in range(len(answer[i])):
        print(answer[i][j], end=' ')
    print()