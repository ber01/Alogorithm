import sys

f = lambda : sys.stdin.readline().rstrip()

W, K = list(), list()

for i in range(20):
    score = int(f())
    if score >= 0 and score <= 100 :
        if i <= 9:
            W.insert(i, score)
        else:
            K.insert(i-10, score)

print(sum(sorted(W)[7:10]), sum(sorted(K)[7:10]))