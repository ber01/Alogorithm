import sys

f = lambda : sys.stdin.readline().rstrip()

change = 1000 - int(f())
money = [500, 100, 50, 10, 5, 1]

cnt = 0
for i in money:
    cnt += change//i
    change %= i
print(cnt)