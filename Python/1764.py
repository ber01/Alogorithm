import sys

f = lambda : sys.stdin.readline().rstrip()

line = list(map(int, f().split()))

N = line[0]
M = line[1]

dic = dict()
for i in range(N):
    name = f()
    dic[name] = "듣"

result = list()
for i in range(M):
    name = f()
    if name in dic.keys():
        result.append(name)

print(len(result))
for i in sorted(result):
    print(i)