import sys

f = lambda : sys.stdin.readline().rstrip()

def choice(a, b):
    if a%b != 0:
        return a//b + 1
    else:
        return a//b

L = int(f())
A = int(f())
B = int(f())
C = int(f())
D = int(f())

temp1, temp2 = choice(A, C), choice(B, D)

print(L - max(temp1, temp2))

