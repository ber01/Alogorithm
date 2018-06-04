import sys

f = lambda : sys.stdin.readline().rstrip()

N = int(f())

player = list()
for _ in range(N):
    player.append(f()[0])

setP = sorted(set(player))
result = ""
for i in setP:
    if player.count(i) >= 5:
        result += i

if result != "":
    print(result)

else:
    print("PREDAJA")