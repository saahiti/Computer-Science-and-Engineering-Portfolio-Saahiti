'''
Created on May 29, 2014
@author: Saahiti & Alisa
'''
from math import sqrt
import sys

class PolynomialFunction(object):
    """PolynomialFunction class has the properties y-int, x-ints, , f(x), and first derivative"""   
    def __init__(self, inputString, xValue):
        self.terms = []
        self.exponents = []
        self.coefficients = []
        self.x = xValue
        self.main(inputString, xValue)
        self.intersection = False
       
    def isOperator(self, string):
        if (string is '+' or string is '-'): # or string is '*' or string is '/'
            return True
    
    def isValid(self, string):
        if(string.isdecimal() or self.isOperator(string) or string is '.' or string is 'x' or string is '^'):
            return True
        else:
            return False
    
    def removeExtras(self, string):    
        
        newString = str()
        
        for char in string:
            if (self.isValid(char)):
                newString = newString + char
            
        return newString
    
    def containsOperator(self, string):
        if ('+' in string or '-' in string or '*' in string or '/' in string):
            return True
        else:
            return False
    
    def f(self, x):
        result = float(0)
        for index in range(len(self.terms)):
            result = result + float((self.coefficients[index]) * (x**float(self.exponents[index])))
        return result
    
    def yint(self, x):
        return self.f(0)
    
    def getDegree(self):
        degrees = self.exponents
        degrees.sort()
        degree = degrees[len(degrees) - 1]
        
        return degree
        
    def solveQuadratic(self):  
        
        a = float(0)
        b = float(0)
        c = float(0)

        for index in range(len(self.terms)):
            if (self.exponents[index] == 0):
                a = a + self.coefficients[index]
            
            elif(self.exponents[index] == 1):
                b = b + self.coefficients[index]
            
            elif(self.exponents[index] == 2):
                c = c + self.coefficients[index]
        
        inside = b**2 - 4*a*c
        
        if (inside >=0 and not(a == 0)):
            x1 = ((-b)+ sqrt(inside))/(2*a)
            x2 = ((-b)- sqrt(inside))/(2*a)      
        
            
            
            if not(x1 == x2):
                if (self.intersection):
                    self.printy = True
                    self.xIntersections = [x1, x2]
                    
                    print("X-Values at Intersection \t\t: ", x1, ", ", x2, sep = "")
                else:
                    print("Solutions\t\t\t\t: ", x1, " and ", x2, sep = "")
                
            else:
                if (self.intersection):
                    self.xIntersections = [x1] 
                    self.printy = True
                    print("X-Value at Intersection \t\t: ", x1, sep = "")
                    #print("Intersection point\t\t\t: (", x1, ", ",  self.f(x1), ")", sep = "")
                else:    
                    print("Solution\t\t\t\t: ", x1, sep = "")
            
                """
                xVertex = (x1 + x2)/2
                yVertex = (self.f(xVertex)) 
                print("Vertex\t\t\t\t\t: (",xVertex, ", ", yVertex, ")", sep = "", end = "")
                """
        else:
            if (self.intersection):
                print("Intersection points\t\t\t: None")
            else: 
                print("Solutions\t\t\t\t: No real solutions.")
    
    def solveLinear(self):
        a = 0
        b = 0
        
        for index in range(len(self.terms)):
            if (self.exponents[index] == 0):
                a = a + self.coefficients[index]
            
            elif(self.exponents[index] == 1):
                b = b + self.coefficients[index]
        
        if not (a == float(0)):
            x = (-b)/a
        else:
            x = 0
        
        if (abs(x) == 0):
                x = float(0)
            
        if (self.intersection):
            #self.printy = True
            #self.xIntersections = [x]
            #print("Intersection point\t\t\t: (", x, ", ", end = "")
            print("X-Value at Intersection \t\t\t: ", x, sep = "")
       
        else:
            print("Solution\t\t\t\t: ", x, sep = "")
                  
    def fprime(self, x):
        gCoefficients = [0]*len(self.coefficients)
        gExponents = [0]*len(self.coefficients)
        
        for i in range(len(self.coefficients)):
            gCoefficients[i] = self.coefficients[i] * self.exponents[i]
            gExponents[i] = self.exponents[i] - 1
        
            if (self.exponents[i] <= 0.00):
                gExponents[i] = 1
                gCoefficients[i] = 0
                
        result = 0
        for index in range(len(self.terms)):
            result = result + (gCoefficients[index] * (x**gExponents[index]))
        
        return result
    
    def printFunction(self):
        
        if (not(self.intersection)):
            x = self.x
        
            print()
            print("f(", x, ")", sep = "", end = "")         
            print("\t\t\t\t\t: ", sep = "", end = "")
            print(self.f(x))
            print("y-int \t\t\t\t\t: ", sep = "", end = "")
            print(self.yint(x))
            print("f'(", x, ")\t\t\t\t\t: ", sep = "", end = "")
            print(self.fprime(x))

        degree = self.getDegree()
        if(degree == 2):
            if (not(self.intersection)):
                print("Function type\t\t\t\t: Quadratic")
            self.solveQuadratic()
        elif(degree == 1):
            if (not(self.intersection)):
                print("Function type\t\t\t\t: Linear")
            self.solveLinear()
        else:
            if (not(self.intersection)):
                print("Function type\t\t\t\t: Neither linear nor quadratic") 
    
    def main(self, inputString, xValue):
        
        string1 = inputString
        x = float(xValue)
        
        string1 = string1.replace(" ", "")
        string1 = string1.lower()
        string1 = self.removeExtras(string1)
        
        
        if(len(string1) == 0):
            sys.exit("INAVLID INPUT")
        
        terms = []
        term = ""
        index = 0
        xCount = 0
        beginning = True
        
        for char in string1:
             
            temp = string1[index:]
            if (self.isOperator(char) and not(index == 0)):
                beginning = not(beginning)
            
            if (self.isOperator(char) and not(beginning)):
                terms.append(term)
                term = ""
                term = term + char
                beginning = not(beginning)
                
            elif(not (self.containsOperator(temp))):
                term = term + char
                
                if (index == len(string1) - 1):
                    terms.append(term)
                    term = ""
           
            else:
                term = term + char 
            
            if (char is 'x'):
                xCount = xCount + 1
                    
            index = index + 1
        
        coefficients = []
        exponents = []
        count = 0
        
        for term in terms:
            parts = term.split(sep='x', maxsplit=len(term))
            #print(parts)
            coefficients.append(parts[0])
            
            if(len(parts) == 2 and ('^' in parts[1])):
                parts[1] = parts[1].replace('^', '')
                exponents.append(parts[1])
            
            elif(len(parts) == 2 and (parts[1]) is ''):
                exponents.append(1)
                
            else:
                exponents.append(0)
                
            if(parts[0] is ''):
                coefficients[count] = 1
            elif(parts[0] is '-'):
                coefficients[count] = -1
            count = count + 1
        
        self.terms = terms
        self.coefficients = coefficients
        self.exponents = exponents 
        
        """
        print("Terms:", self.terms)
        print("Coefficients:", self.coefficients)
        print("Exponents:", self.exponents)
        """
        
        for index in range(len(coefficients)):
            if (coefficients[index] is '' or coefficients[index] is '+'):
                coefficients[index] = 1
            
            coefficients[index] = float(coefficients[index]) 
        
        for index in range(len(exponents)):
            exponents[index] = float(exponents[index]) 


