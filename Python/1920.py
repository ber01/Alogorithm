import sys

f = lambda : sys.stdin.readline().rstrip()

def binarySearch(arr, n):

    left = 0; right = len(arr)-1; middle = int((left+right)/2)

    while right-left >= 0:
        if arr[middle] == n:
            return 1
        elif arr[middle] > n:
            right = middle-1
        else:
            left = middle+1
        middle = int((left+right)/2)

    return 0

n = int(f())
arrN = list(map(int, f().split()))

arrN.sort()

m = int(f())
arrM = list(map(int, f().split()))

result = list()
for i in arrM:
    result.append(binarySearch(arrN, i))

for i in result:
    print(i)