# cook your dish here
import itertools
def f(x, y):
    # Convert integers to string
    x, y = str(x), str(y)

    # Pad inputs
    # x, y = x.zfill(max(len(x), len(y))), y.zfill(max(len(x), len(y)))


    rv = set()
    for x_comb in set(''.join(perm_x) for perm_x in itertools.permutations(x)):
        for y_comb in set(''.join(perm_y) for perm_y in itertools.permutations(y)):
            rv.add(f"{int(x_comb,2) ^ int(y_comb,2):b}")


    if(len(rv)<1000000007):
        print(len(rv))
    else:
        #print (list(rv))
        print (len(rv)%1000000007)

t = int(input())
while t>0:
    n = input()
    a = input()
    b = input()
    f(a,b)
    t = t - 1
