import sys

f = lambda : sys.stdin.readline().rstrip()

line = f().split()

print(int("".join(line[0:2])) + int("".join(line[2:])));