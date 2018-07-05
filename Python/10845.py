import sys

f = lambda : sys.stdin.readline().rstrip()

n = int(f())

queue = list()
for _ in range(n):

    line = f().split()
    cmd = line[0]

    if cmd == "push":
        value = int(line[1])
        queue.append(value)

    elif cmd == "pop":
        if len(queue) == 0:
            print(-1)
        else:
            print(queue[0])
            del queue[0]

    elif cmd == "size":
        print(len(queue))

    elif cmd == "empty":
        if len(queue) == 0:
            print(1)
        else:
            print(0)

    elif cmd == "front":
        if len(queue) == 0:
            print(-1)
        else:
            print(queue[0])

    elif cmd == "back":
        if len(queue) == 0:
            print(-1)
        else:
            print(queue[-1])