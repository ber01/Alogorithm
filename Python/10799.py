import sys

def cntBar(line):
    result = 0

    stack = list()
    for i, t in enumerate(line):
        if t == '(':
            stack.append(i)
        elif t == ')':
            if stack[-1] == i-1:
                stack.pop()
                result += len(stack)
            else:
                stack.pop()
                result += 1

    return result;

f = lambda : sys.stdin.readline().rstrip()

line = f()

print(cntBar(line))