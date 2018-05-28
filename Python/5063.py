import sys

f = lambda : sys.stdin.readline().rstrip()

num = int(f())

for i in range(num):
    adv = list(map(int, f().split()))
    benefit = adv[1] - adv[2]
    if benefit > adv[0]:
        print("advertise")
    elif benefit == adv[0]:
        print("does not matter")
    else:
        print("do not advertise")