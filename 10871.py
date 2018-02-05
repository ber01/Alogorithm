seq, num = map(int, input().split())

seq_list = list(map(int, input().split()))

for i in range(seq):
    if num > seq_list[i]:
        print(seq_list[i], end = ' ')