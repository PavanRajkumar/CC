#https://www.hackerrank.com/challenges/py-if-else/problem

#!/bin/python3
import math
import os
import random
import re
import sys

if __name__ == '__main__':
    
    def func(n):
        if n%2!=0:
            print("Weird")
        elif n>=2 and n<=5:
            print("Not Weird")
        elif n>=6 and n<=20:
            print("Weird")
        elif n>20:
            print("Not Weird")

    n = int(input().strip())
    func(n)
        

