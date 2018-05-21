import sys

def cntViolate(num, car):
    cnt = 0
    for i in car:
        if num == i: cnt += 1
    return cnt

f = lambda : sys.stdin.readline().rstrip()

num = f()

car = f().split()

print(cntViolate(num, car))