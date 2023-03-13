import sys
sys.stdin = open("input.txt", "r")
input = sys.stdin.readline

# 2. 네트워크 선 자르기 (Top-Down : 재귀, 메모이제이션)

def DFS(len):
    if dy[len] > 0: # 가지 cut, 메모이제이션
        return dy[len]
    if len == 1 or len == 2:
        return len
    else:
        dy[len] = DFS(len-1) + DFS(len-2)
        return dy[len]

n = int(input())
dy = [0]*(n+1)
print(DFS(n))