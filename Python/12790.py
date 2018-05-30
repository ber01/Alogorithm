import sys

f = lambda : sys.stdin.readline().rstrip()

num = int(f())

for i in range(num):
    ability = list(map(int, f().split()))
    hp, mp, power, armor = ability[0], ability[1], ability[2], ability[3]
    hp += ability[4]
    mp += ability[5]
    power += ability[6]
    armor += ability[7]
    if hp < 1:
        hp = 1
    if mp < 1:
        mp = 1
    if power < 0:
        power = 0
    print(hp + 5 * mp + 2 * power + 2 * armor)
