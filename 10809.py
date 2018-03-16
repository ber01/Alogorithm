import sys

alphabet = list("abcdefghijklmnopqrstuvwxyz")

input_a = sys.stdin.readline().rstrip()

result = ""

for i in alphabet:
    if i in input_a:
        result = result + str(input_a.index(i)) + " "

    else: result = result + "-1 "

print(result.rstrip())