# 윷놀이 배(0), 등(1)
import sys, collections

def isResult(num):
    dic = {1 : 'A', 2 : 'B', 3 : 'C', 4 : 'D', 0 : 'E'}
    return dic[num]

f = lambda : sys.stdin.readline().rstrip()

for i in range(3):
    play = f().split()
    cnt = collections.Counter(play)
    print(isResult(cnt['0']))