import sys

f = lambda : sys.stdin.readline().rstrip()

R1, S = map(int, f().split())

print(2*S-R1)