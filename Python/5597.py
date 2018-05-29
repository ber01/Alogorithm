import sys

f = lambda : sys.stdin.readline().strip()

result = [i for i in range(1, 31)]

for _ in range(28):
    del result[result.index(int(f()))]

result.sort()
for i in result:
    print(i)