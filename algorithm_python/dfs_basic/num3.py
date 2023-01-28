# 3. 부분집합 구하기 (DFS)

def DFS(x):
    if x > n:
        for i in range(1, n+1):
            if ch[i] == 1:
                print(i, end=' ')
        print()
    else:
        ch[x] = 1
        DFS(x+1)
        ch[x] = 0
        DFS(x+1)


n = int(input())
ch = [0] * (n+1)
DFS(1)