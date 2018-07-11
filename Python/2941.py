import sys

f = lambda : sys.stdin.readline().rstrip()

list = ["c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="]

line = f()

for i in list:

    if i in line:

        line = line.replace(i, "#")

print(len(line))