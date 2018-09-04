import sys

f = lambda : sys.stdin.readline().rstrip()

while True:

    n = int(f())
    if n == -1: break

    divisor = [i for i in range(1, n) if n%i == 0]

    if n == sum(divisor):
        print(n, "=", " + ".join(map(str, divisor)))
    else:
        print(n, "is NOT perfect.")
