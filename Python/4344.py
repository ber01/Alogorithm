num = int(input())

for i in range(num):

    sum = 0
    score = list(map(int, input().split()))

    for i in range(1, score[0]+1):
        sum = sum + score[i]

    avrg = sum/score[0]

    cnt = 0
    for i in range(1, score[0]+1):
        if score[i] > avrg: cnt = cnt+1

    length = len(score)-1
    avrg = (cnt/length) * 100

    print("%0.3f%%" % avrg)