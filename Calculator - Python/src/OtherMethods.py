'''
Created on May 29, 2014

@author: Saahiti and Alisa
'''

from math import sqrt

"""
Quadratic / cubic equations
Find the roots
"""

def quadratic(a=0, b=0, c=0):
    inside = b**2 - 4*a*c
    
    if (inside >=0):
        x1 = ((-b)+ sqrt(inside))/(2*a)
        x2 = ((-b)- sqrt(inside))/(2*a)      
        
        if not(x1 == x2):
            print("The solutions of the equation are", x1, "and", x2)
        else:
            print("The solution of the equation is", x1)
      
    else:
        print("The equation does not have any real solutions.")



print("Enter the values for your equation: ")
a = float(input("a = "))
b = float(input("b = "))
c = float(input("c = "))

quadratic(a, b, c)

