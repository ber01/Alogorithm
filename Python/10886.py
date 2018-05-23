import sys

f = lambda : sys.stdin.readline().rstrip()

n = int(f())
one = list()
zero = list()
for i in range(n):
    value = int(f())
    if value == 1:
        one.append(1)
    else:
        zero.append(0)
if len(zero) > len(one):
    print("Junhee is not cute!")
else:
    print("Junhee is cute!")
