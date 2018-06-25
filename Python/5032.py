import sys

f = lambda : sys.stdin.readline().rstrip()

e, f, c = map(int, f().split())

quo = int((e+f)//c)
rem = int((e+f)%c)

result = quo
total = quo+rem

while(total >= c):
    result += total//c
    quo = int(total//c)
    rem = int(total%c)
    total = quo+rem

print(result)