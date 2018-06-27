import sys

f = lambda : sys.stdin.readline().rstrip()

time = 0
for i in range(4):
    time += int(f())

print(time//60)
print(time%60)