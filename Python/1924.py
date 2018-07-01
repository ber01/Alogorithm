import sys

f = lambda : sys.stdin.readline().rstrip()

M, D = map(int, f().split())

month = [31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]
result = ["SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"]

for i in range(M-1):
    D += month[i]

print(result[D%7])