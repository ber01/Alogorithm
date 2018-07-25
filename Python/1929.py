import sys, math

f = lambda : sys.stdin.readline().rstrip()

m, n = map(int, f().split())

for i in range(m, n+1):

    if i == 1: continue;
    tf = True;

    for j in range(2, int(math.sqrt(i)+1)):

        if i%j == 0:

            tf = False;
            break;

    if tf:
        print(i)