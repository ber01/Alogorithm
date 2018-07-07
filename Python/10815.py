import sys

f = lambda : sys.stdin.readline().rstrip()

N = int(f())

num_set = set(map(int, f().split()))

M = int(f())
result = ""

for i in f().split():

    if int(i) in num_set:
        result += "1 "
    else:
        result += "0 "

print(result)