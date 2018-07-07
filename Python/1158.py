import sys
from collections import deque

f = lambda : sys.stdin.readline().rstrip()

n, m = map(int, f().split())

queue = deque()

for i in range(1, n+1):
    queue.append(i)

result = list()
for i in range(n):

    for j in range(m-1):
        queue.append(queue.popleft())

    result.append(queue.popleft())

print("<" + ", ".join(list(map(str, result))) + ">")

