import sys, math

f = lambda : sys.stdin.readline().rstrip()

N, W, H = map(int, f().split())

D = math.sqrt(pow(W, 2) + pow(H, 2))

for _ in range(N):
    if int(f()) > D:
        print("NE")
    else:
        print("DA")