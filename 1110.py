import sys

num = sys.stdin.readline()

num_i = int(num)
if num_i < 0: num = "0"
elif num_i > 99: num = "99"

if num_i >= 0 and num_i < 10: num = "0" + num

count = 0
while(True):
    test = str(int(num[0]) + int(num[1]))
    num = num[1] + test[len(test)-1]
    count = count+1
    if int(num) == num_i:
        print(count); break
