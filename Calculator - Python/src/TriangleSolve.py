'''
Created on 2014-06-05

@author: Alisa & Saahiti
'''

class TriSolver:
    def __init__(self, a = None , b = None, c = None, A = None, B = None, C = None):
        self.a = a
        self.b = b
        self.c = c
        import math 
        if (A is not None):
            self.A = math.radians(A)
        else:
            self.A = A
        if (B is not None):
            self.B = math.radians(B)
        else:
            self.B = B
        if (C is not None):
            self.C = math.radians(C)
        else:
            self.C = C    
    
    def solve(self):
        import math
        if (self.a is not None and self.b is not None and self.c is not None):
            if ((self.a + self.b > self.c) and (self.b+ self.c > self.a) and (self.c + self.a > self.b)):
                self.A = math.acos((self.a**2 - (self.b**2 + self.c**2))/(-2*self.b*self.c))
                self.B = math.acos((self.b**2 - self.a**2 - self.c**2)/(-2*self.a*self.c))
                self.C = math.acos((self.c**2 - self.b**2 - self.a**2)/(-2*self.a*self.b))
            else:
                print("This is not a solvable triangle; The sum of two of the sides is smaller than or equal to the other side")
        elif(self.a is not None and self.b is not None and self.C is not None):    
            self.c = math.sqrt(self.a**2 + self.b**2 - 2 * self.a * self.b * math.cos(self.C))
            self.A = math.asin((self.a*math.sin(self.C))/self.c)
            self.B = math.asin((self.b*math.sin(self.C))/self.c)
        elif(self.c is not None and self.b is not None and self.A is not None):
            self.a = math.sqrt(self.c**2 + self.b**2 - 2 * self.c * self.b * math.cos(self.A))
            self.C = math.asin((self.c*math.sin(self.A))/self.a)
            self.B = math.asin((self.b*math.sin(self.A))/self.a)
        elif(self.a is not None and self.c is not None and self.B is not None):
            self.b = math.sqrt(self.a**2 + self.c**2 - 2 * self.a * self.c * math.cos(self.B))
            self.A = math.asin((self.a*math.sin(self.B))/self.b)
            self.C = math.asin((self.c*math.sin(self.B))/self.b)
        elif((self.a is not None and self.b is not None) and (self.A is not None or self.B is not None)):
            if(self.A is not None):
                self.B = math.asin((self.b*math.sin(self.A))/self.a)
            elif(self.B is not None):
                self.A = math.asin((self.a*math.sin(self.B))/self.b)    
            self.C = math.pi - self.A - self.B
            self.c = (self.a * math.sin(self.C))/math.sin(self.A)
        elif((self.b is not None and self.c is not None) and (self.B is not None or self.C is not None)):
            if(self.C is not None):
                self.B = math.asin((self.b*math.sin(self.C))/self.c)
            elif(self.B is not None):
                self.C = math.asin((self.c*math.sin(self.B))/self.b)    
            self.A = math.pi - self.C - self.B
            self.a = (self.c * math.sin(self.A))/math.sin(self.C)
        elif((self.a is not None and self.c is not None) and (self.A is not None or self.C is not None)):
            if(self.A is not None):
                self.C = math.asin((self.c*math.sin(self.A))/self.a)
            elif(self.C is not None):
                self.A = math.asin((self.a*math.sin(self.C))/self.c)    
            self.B = math.pi - self.A - self.C
            self.b = (self.a * math.sin(self.B))/math.sin(self.A)
        elif((self.a is not None or self.b is not None) and (self.A is not None and self.B is not None)):
            if(self.a is not None):
                self.b = (self.a*math.sin(self.B))/math.sin(self.A)
            elif(self.b is not None):
                self.a = (self.b*math.sin(self.A))/math.sin(self.B)    
            self.C = math.pi - self.A - self.B
            self.c = (self.a * math.sin(self.C))/math.sin(self.A)
        elif((self.b is not None or self.c is not None) and (self.B is not None and self.C is not None)):
            if(self.c is not None):
                self.b = (self.c*math.sin(self.B))/math.sin(self.C)
            elif(self.b is not None):
                self.c = (self.b*math.sin(self.C))/math.sin(self.B)    
            self.A = math.pi - self.C - self.B
            self.a = (self.c * math.sin(self.A))/math.sin(self.C)
        elif((self.a is not None or self.c is not None) and (self.A is not None and self.C is not None)):
            if(self.a is not None):
                self.c = (self.a*math.sin(self.C))/math.sin(self.A)
            elif(self.c is not None):
                self.a = (self.c*math.sin(self.A))/math.sin(self.C)    
            self.B = math.pi - self.A - self.C
            self.b = (self.a * math.sin(self.B))/math.sin(self.A)
        else:
            print("This triangle cannot be solved.")
        
    def printValues(self):
        import math
        try:
            if (self.a is not None and self.b is not None and self.c is not None):
                print("a =", "{0:.5f}".format(self.a), "   b =", "{0:.5f}".format(self.b), "   c =", "{0:.5f}".format(self.c))
            else:
                print("a = not applicable", "   b = not applicable", "   c = not applicable")
            if (self.A is not None and self.B is not None and self.C is not None):
                print("A =", "{0:.5f}".format(math.degrees(self.A)), "   B =", "{0:.5f}".format(math.degrees(self.B)), "   C =", "{0:.5f}".format(math.degrees(self.C)))
            else:
                print("A = not aplicable", "   B = not applicable", "   C = not applicable")
        except ValueError:
            print("The triangle can't be solved - an error occured")
        