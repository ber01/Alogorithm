import sys

f = lambda : sys.stdin.readline().rstrip()

for _ in range(int(f())):

    credit, gpa = 0, 0.0
    for _ in range(int(f())):
        score = f().split()
        credit += int(score[0])
        gpa += int(score[0]) * float(score[1])
    print("%d %.1f" % (credit, gpa/credit))
 