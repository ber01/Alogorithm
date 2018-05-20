import sys

# VPS 확인
def VPS(string):
    cnt = 0
    for i in string:
        if i == '(':
            cnt += 1
        elif i == ')':
            cnt -= 1
        if cnt < 0:
            return("NO")

    if cnt == 0:
        return("YES")
    else:
        return("NO")

# 반복 횟수 입력
n = int(sys.stdin.readline().rstrip())

# n번 반복
for i in range(n):
    # 괄호 입력받기
    string = sys.stdin.readline().rstrip()
    print(VPS(string))