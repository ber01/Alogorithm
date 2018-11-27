import sys

f = lambda : sys.stdin.readline().rstrip()

arr = sorted([int(f()) for _ in range(int(f()))])[::-1]

for i in arr:
    print(i)