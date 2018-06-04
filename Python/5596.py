import sys

f = lambda : sys.stdin.readline().rstrip()

S = sum(list(map(int, f().split())));
T = sum(list(map(int, f().split())));

print(S if S >= T else T)
