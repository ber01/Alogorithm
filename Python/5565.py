import sys

f = lambda : sys.stdin.readline().rstrip()

book = list()
for i in range(10):
    book.append(int(f()))

print(book[0] - sum(book[1:]))