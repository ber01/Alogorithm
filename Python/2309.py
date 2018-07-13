import sys

f = lambda : sys.stdin.readline().rstrip()

dwarf = list()
height = 0

for i in range(9):

    temp = int(f())
    dwarf.append(temp)
    height += temp;

dwarf = sorted(dwarf)
tf = False
for i in range(9):

    for j in range(i+1, 9):

        value = dwarf[i] + dwarf[j]
        if (height - value) == 100:

            dwarf[i] = 0
            dwarf[j] = 0
            tf = True
            break

    if tf: break

for i in dwarf:

    if i == 0: continue
    print(i)