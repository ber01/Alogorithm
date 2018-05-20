import sys

A = int(sys.stdin.readline())
B = int(sys.stdin.readline())
C = int(sys.stdin.readline())

# A, B, C = map(int, sys.stdin.readline().split())을 이용하여 한줄로 받울경우 그 다음 입력을 받을때 까지 기다리는 시간이 발생, 런타임 에러

result = A*B*C
result_s = str(result)

for i in range(10):
    index = str(i)
    print(result_s.count(str(index)))