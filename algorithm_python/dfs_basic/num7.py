import sys
#sys.stdin = open("input.txt", "r")
input = sys.stdin.readline

# 7. 동전 교환 - Cut Edge Tech

def DFS(v, sum):
    global res
    global cut

    # Cut Edge Tech 로 (v>res) 조건도 있어야 함!
    if (sum > m) or (v > res):
        cut = True
        return

    if sum == m:
        if v < res:
            res = v
    else:
        for i in range(n):
            DFS(v + 1, sum + arrN[i])
            if cut:
                cut = False
                break


n = int(input())
arrN = list(map(int, input().split()))
m = int(input())

cut = False
res = 2147000000
arrN.sort(reverse=True) # 내림차순 정렬해서 가장 큰 수의 동전부터 적용하기
DFS(0, 0)
print(res)