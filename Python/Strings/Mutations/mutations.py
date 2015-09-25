inp = raw_input()
k = raw_input()
i = k.split(" ")
inp = inp[:int(i[0])] + i[1] + inp[int(i[0])+1:]
print inp
