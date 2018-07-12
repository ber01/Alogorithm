import sys

f = lambda : sys.stdin.readline().rstrip()

n = int(f())

cnt = 0
if n >= 100:

    for i in range(100, n+1):

        a_s = list(map(int, (str(i))))

        a_set = set()
        for j in range(len(a_s) -1):

            a_set.add(a_s[j] - a_s[j+1])
            if(len(a_set) > 1):
                break

        if len(a_set) == 1:
            cnt += 1

    print(99 + cnt)

else :
    print(n)