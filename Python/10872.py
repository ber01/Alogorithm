import sys

def factorial(num):
    result = 1
    for i in range(1, num+1):
        result *= i
    return result

f = lambda : sys.stdin.readline().rstrip()

n = int(f())

print(factorial(n))