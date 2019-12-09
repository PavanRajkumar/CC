# cook your dish here
from itertools import permutations
def f(x, y):
    rv = set()
    for x_comb in set(''.join(perm_x) for perm_x in permutations(x)):
        for y_comb in set(''.join(perm_y) for perm_y in permutations(y)):
            rv.add(f"{int(x_comb,2) ^ int(y_comb,2)}")


    if(len(rv)<1000000007):
        print(len(rv))
    else:
        #print (list(rv))
        print (len(rv)%1000000007)

t = int(input())
while t>0:
    n = input()
    a = str(input())
    b = str(input())
    f(a,b)
    t = t - 1
