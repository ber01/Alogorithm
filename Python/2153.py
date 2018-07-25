import sys, math

f = lambda : sys.stdin.readline().rstrip()

dic = dict()

value = 1;
s = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"

for i in range(len(s)):
    dic[s[i]] = value;
    value += 1

s = f()
result = 0
for i in s:
    if i in dic:
        result += dic[i]

if result <= 2:
    print("It is a prime word.")
else:
    tf = True
    for i in range(2, int(math.sqrt(result)+1)):
        if result%i == 0:
            tf = False; break
    print("It is a prime word." if tf else "It is not a prime word.")