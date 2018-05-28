import sys

f = lambda : sys.stdin.readline().rstrip()

dic = {}
score_list = list()
for i in range(8):
    score = int(f())
    score_list.append(score)
    dic[score] = i+1

score_list = sorted(score_list)

total = 0
num_list = list()
for i in score_list[3:]:
    total += i
    num_list.append(dic[i])

print(total)

num_str = ''
for i in sorted(num_list):
    num_str += str(i) + " "

print(num_str)