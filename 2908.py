import sys

num1, num2 = sys.stdin.readline().rstrip().split()
num1_r, num2_r = int(num1[::-1]), int(num2[::-1])

print(num1_r if num1_r > num2_r else num2_r)