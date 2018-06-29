import sys

f = lambda : sys.stdin.readline().rstrip()

N = int(f())

N_list = list()
for i in range(N):
    N_list.append(int(f()))

for i in sorted(N_list):
    print(i)