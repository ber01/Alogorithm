import sys

f = lambda : sys.stdin.readline().rstrip()

burger = list()
drink = list()

for i in range(5):
    if i < 3:
        burger.append(int(f()))
    else:
        drink.append(int(f()))

print(min(burger) + min(drink) - 50)