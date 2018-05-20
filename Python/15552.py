import sys

num = sys.stdin.readline().rstrip()

for i in range(int(num)):
    n1, n2 = map(int, sys.stdin.readline().split())
    print(n1+n2)