import sys
#sys.stdin = open("input.txt", "r")
input = sys.stdin.readline

# 6. 알파코드

def DFS(L, p):
    global cnt

    if L == n:
        cnt += 1
        for j in range(p):
            print(chr(res[j]+64), end='')
        print()
    else:
        for i in range(1, 27):
            if code[L] == i:
                res[p] = i
                DFS(L+1, p+1)
            elif (i>=10) and (code[L] == (i//10)) and (code[L+1] == (i%10)):
                res[p] = i
                DFS(L+2, p+1)


# code = list(map(int, input()))
# sys.stdin.readline 사용시 아래와 같이 수정
code = list(map(int, input().rstrip()))
n = len(code)
code.insert(n, -1)
res = [0]*n
cnt = 0
DFS(0, 0)
print(cnt)