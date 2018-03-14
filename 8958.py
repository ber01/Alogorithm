import sys

num = int(sys.stdin.readline().rstrip())

for i in range(num):
    quiz = list(sys.stdin.readline().rstrip())
    result = []
    for i in range(len(quiz)):

        if i == 0:
            if quiz[0] == "O":
                result.insert(0, 1)
            elif quiz[0] == "X":
                result.insert(0, 0)

        else:
            if quiz[i] == "X":
                result.insert(i, 0)
            elif quiz[i] == "O":
                if quiz[i-1] == "O":
                    result.insert(i, result[i-1]+1)
                else:
                    result.insert(i, 1)

    sum = 0
    for i in result:
        sum = sum + i

    print(sum)
