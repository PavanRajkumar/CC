def lol():
    A = input()
    B = input()
    a = int(A,2)
    b = int(B,2)
    count = 0
    while b > 0:
        u = a^b
        v = a&b
        a = u
        b = v*2
        count = count + 1
    print(count)

t = int(input())
while t > 0:
    lol()
    t = t - 1
