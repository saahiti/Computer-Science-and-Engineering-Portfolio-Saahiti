'''
Created on May 29, 2014
@author: Saahiti & Alisa
'''
from PolynomialFunction import PolynomialFunction
import sys

class Intersection(object):
    
    def __init__(self, first, second):
        p = PolynomialFunction(str(first), 0)
        q = PolynomialFunction(str(second), 0)
        self.p = p
        self.q = q
        pDegree = self.p.getDegree()
        qDegree = self.q.getDegree()
        #self.xIntersections = []
        #self.printy = False
        
        if not (pDegree <= 2 and qDegree <= 2):
            sys.exit("INAVLID INPUT")

            
        firstChar = second[0:1]
        if (firstChar is '+' or firstChar is '-'):
            string = first + second
        else:
            string = first + '+' + second

        self.poly = PolynomialFunction(string, 2)
        self.poly.intersection = True
        
    """
    def printPoints(self):
        
        if (len (self.xIntersections) == 1):
            print("Intersection point\t\t\t: ", end = "")
        elif (len(self.xIntersections == 2)):
            print("Intersection points\t\t\t: ", end = "")
                         
        for x in self.xIntersections:
            y = self.p.f(x) + self.q.f(x)
            print("(", x, ", ", sep = "", end = "")
            print(y, ")")
    """
    def printFunction(self):
        print()
        
        degree = self.poly.getDegree()
        if(degree == 2):
            print("Function type\t\t\t\t: Quadratic")
            self.poly.solveQuadratic()
            
        elif(degree == 1):
            print("Function type\t\t\t\t: Linear")
            self.poly.solveLinear()
        
        """
        print("x Intersections : ", end = "")
        print(self.xIntersections)
        
        if (len(self.xIntersections) == 1 or len(self.xIntersections) == 2):
            self.printPoints()
        """