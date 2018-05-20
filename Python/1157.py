import sys

word = sys.stdin.readline().rstrip().upper()

alphabet = list("ABCDEFGHIJKLMNOPQRSTUVWXYZ")
check = []

for i in range(len(alphabet)):
    check.insert(i, word.count(alphabet[i]))

if check.count(max(check)) != 1: print("?")

else : print(alphabet[check.index(max(check))])