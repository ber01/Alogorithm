import sys, heapq

f = lambda : sys.stdin.readline().rstrip()

N = int(f())
queue = list()

for _ in range(N):

    x = int(f())
    if x == 0:
        if len(queue) == 0:
            print("0")
        else:
            print(heapq.heappop(queue))
    else:
        heapq.heappush(queue, x)