import sys
sys.stdin = open("input.txt", "r")
input = sys.stdin.readline

# 3-2. 돌다리 건너기 (Bottom-Up)
n = int(input())
dy = [0]*(n+2)
dy[1] = 1
dy[2] = 2
for i in range(3, n+2):
    dy[i] = dy[i-2] + dy[i-1]
print(dy[n+1]) # 도착지점은 n+1