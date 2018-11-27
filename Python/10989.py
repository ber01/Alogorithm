import sys

f = lambda : sys.stdin.readline().rstrip()

cnt = [0 for _ in range(10001)]

for i in range(int(f())):
    cnt[int(f())] += 1

for i in range(len(cnt)):
    for j in range(cnt[i]):
        print(i);