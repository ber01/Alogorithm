import sys

f = lambda : sys.stdin.readline().rstrip()

int(f())
for i in sorted(set(map(int, f().split()))):
    print(i, end = " ")