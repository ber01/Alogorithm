import sys

num = int(sys.stdin.readline().rstrip())

for i in range(num):
    test = sys.stdin.readline().rstrip().split()
    result = ""
    for i in range(len(test[1])):
        result = result + test[1][i] * int(test[0])

    print(result)