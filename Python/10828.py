import sys

f = lambda : sys.stdin.readline().rstrip()

N = int(f())

stack = list()
for _ in range(N):
    line = f().split()
    if line[0] == "push":
        stack.append(int(line[1]))
    elif line[0] == "pop":
        if len(stack) == 0:
            print("-1")
        else:
            print(stack.pop())
    elif line[0] == "size":
        print(len(stack))
    elif line[0] == "empty":
        if len(stack) == 0:
            print("1")
        else:
            print("0")
    elif line[0] == "top":
        if len(stack) == 0:
            print("-1")
        else:
            print(stack[-1])

