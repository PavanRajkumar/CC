#https://www.codechef.com/DEC19B/problems/BINADD

t = int(input())
while t > 0:
    A = str(input())
    B = str(input())
    if len(A)<100000:
        a = int(A,2)
        b = int(B,2)
        count = 0
        while b > 0:
            u = a^b
            v = a&b
            a = u
            b = v << 1
            count = count + 1
        print(count)

    else:
        flag  = 0
        max_count = 0
        try:
            for i in range(len(A) - 1, -1, -1):
                if flag == 1:
                    if A[i] != B[i]:
                        count = count + 1
                        continue
                    else:
                        flag = 0
                        if count > max_count:
                            max_count = count
                            continue

                if A[i] == '1' and B[i] == '1':
                    flag = 1
                    count = 0
        except:
            pass
        if A == "0":
            print(1)
        elif B == "0":
            print(0)
        else:
            print(max_count + 2)
    t = t - 1
