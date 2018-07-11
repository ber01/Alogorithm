import sys

f = lambda : sys.stdin.readline().rstrip()

while True:

    line = f()

    if line == "END":
        break

    print(line[::-1])