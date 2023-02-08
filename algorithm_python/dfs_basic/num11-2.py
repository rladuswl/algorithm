import sys
#sys.stdin = open("input.txt", "r")
input = sys.stdin.readline

# 11-2. 수들의 조합
# 라이브러리를 이용한 조합

import itertools as it

n, k = map(int, input().split())
arr = list(map(int, input().split()))
m = int(input())

cnt = 0
for tmp in it.combinations(arr, k):
    if sum(tmp) % m == 0:
        cnt+=1
print(cnt)
