import sys
#sys.stdin = open("input.txt", "r")
input = sys.stdin.readline

# 7. 송아지 찾기 (BFS : 상태트리 탐색)

from collections import deque

S, E = map(int, input().split())
max = 10000
ch = [0]*(max+1)
dis = [0]*(max+1)
ch[S] = 1
dis[S] = 0
dQ = deque()
dQ.append(S)

while dQ:
    now = dQ.popleft()
    if now == E:
        break
    for next in (now-1, now+1, now+5):
        if 0 < next <= max:
            if ch[next] == 0:
                dQ.append(next)
                ch[next] = 1
                dis[next] = dis[now] + 1

print(dis[E])