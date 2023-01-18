import sys
#sys.stdin = open("input.txt", "r")

# 2. 이진트리 순회 (깊이우선탐색)

# 전위순회
def DFS1(x):
    if x > 7:
        return
    else:
        print(x, end='')
        DFS1(x*2)
        DFS1(x*2+1)

DFS1(1)
print()

# 중위순회
def DFS2(x):
    if x > 7:
        return
    else:
        DFS2(x*2)
        print(x, end='')
        DFS2(x*2+1)

DFS2(1)
print()

# 후위순회
def DFS3(x):
    if x > 7:
        return
    else:
        DFS3(x*2)
        DFS3(x*2+1)
        print(x, end='')

DFS3(1)
print()