import sys

f = lambda : sys.stdin.readline().rstrip()

print(sum(map(int, f().split())))