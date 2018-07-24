import sys

f = lambda : sys.stdin.readline().rstrip()

n = int(f())
prime = list(map(int, f().split()))

cnt = 0
for i in prime:

    j = 2
    for k in range(2, i):

        if i%k == 0: break
        j += 1

    if(i == j):

        cnt += 1;

print(cnt)
