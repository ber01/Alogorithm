import sys

def fibo(n):

    f_prev, f_next = 0, 1

    for _ in range(n):

        f_prev, f_next = f_next, f_prev + f_next;

    return f_prev

f = lambda : sys.stdin.readline().rstrip()

n = int(f())

print(fibo(n))
