import sys, math

f = lambda : sys.stdin.readline().rstrip()

radius = float(f())

print("%.6f" % (radius * radius * math.pi))

radius = math.sqrt(math.pow(radius, 2) + math.pow(radius, 2))
print("%.6f" % (radius * radius))