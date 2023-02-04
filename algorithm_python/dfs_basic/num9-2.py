import sys
#sys.stdin = open("input.txt", "r")
input = sys.stdin.readline

# 9-2. 수열 추측하기 (순열, 파스칼 응용)
# 라이브러리를 이용한 순열

import itertools as it

n, f = map(int, input().split())

b = [1]*n
for i in range(1, n-1):
    b[i] = b[i-1]*(n-i)/i

arr = list(range(1, n+1))

for tmp in it.permutations(arr):
    sum = 0
    for L, x in enumerate(tmp):
        sum += (b[L] * x)
    if sum == f:
        for x in tmp:
            print(x, end=' ')
        break