import sys

f = lambda : sys.stdin.readline().rstrip()

left = [i for i in f()]
right = list()

for _ in range(int(f())):
    line = f().split()
    c = line[0]
    if len(line) > 1:
        v = line[1]

    if c == "L":
        if len(left) == 0:
            continue
        else:
            right.append(left.pop())
    elif c == "D":
        if len(right) == 0:
            continue
        else:
            left.append(right.pop())
    elif c == "B":
        if len(left) == 0:
            continue
        else:
            left.pop()
    elif c == "P":
        left.append(v)

while len(left) != 0:
    right.append(left.pop())

while len(right) != 0:
    print(right.pop(), end="")