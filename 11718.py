import sys

for i in range(100): # 100회 반복
    string = sys.stdin.readline() # 문자열 입력받기
    if string == '\n': break # 입력값이 없을 경우 종료
    print(string.strip()) # 공백제거 출력