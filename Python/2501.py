import sys

f = lambda : sys.stdin.readline().rstrip()

n, k = map(int, f().split())

divisor = [i for i in range(1, n+1) if n%i == 0]

if k > len(divisor):
    print(0)
else:
    print(divisor[k-1])
