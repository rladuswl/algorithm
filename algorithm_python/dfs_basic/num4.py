import sys

# 4. 합이 같은 부분집합 (DFS : 아마존 인터뷰)

# 방법 1
def DFS(L, sum):
    if sum > (total//2):
        return

    if L == n:
        if sum == (total - sum):
            print('YES')
            sys.exit(0)
    else:
        DFS(L+1, sum+arr[L])
        DFS(L+1, sum)

n = int(input())
arr = list(map(int, input().split()))
total = sum(arr)
DFS(0, 0)
print('NO')

'''
# 방법 2 (내 풀이)
def DFS(v):
    if v > n:
        answer = []
        s = 0
        for i in range(len(ch)):
            if ch[i] == 1:
                answer.append(arr[i])
        for x in arr:
            if x not in answer:
                s += x
        if s == sum(answer):
            print('YES')
            exit()

    else:
        ch[v-1] = 1
        DFS(v+1)
        ch[v-1] = 0
        DFS(v+1)

n = int(input())
ch = [0] * (n)
arr = list(map(int, input().split()))
DFS(1)
print('NO')
'''