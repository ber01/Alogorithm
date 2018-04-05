import sys

num = sys.stdin.readline().strip()

temp_list = list(map(int, sys.stdin.readline().strip().split()))

print(min(temp_list[:int(num)]), max(temp_list[:int(num)]))
