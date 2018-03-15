import sys

music = list(map(int, sys.stdin.readline().rstrip().split()))

result = [i for i in range(1, 9)]
result_r = [i for i in range(8, 0, -1)]

if music == result: print("ascending")

elif music == result_r: print("descending")

else: print("mixed")