'''
Created on Jun 11, 2014
@author: Saahiti & Alisa
'''

from Point import Point

class Distance(object):
    
    def __init__(self):
        self.main()
        
    def main(self):
        run = True;   
        while (run):
            string1 = input("Enter the first point, in the format 'x, y': ")
            i = string1.find(",")
            if (i == -1):
                print("Invalid input. Enter the first point, in the format 'x, y'")          
            else:
                run = False    
        run = True
        x1 = self.removeExtras(string1[:i])
        y1 = self.removeExtras(string1[i + 1:])
        if(len(x1) is 0 or len(y1) is 0):
            print("INVALID INPUT. x and y should be numbers.\n")
            self.main()
        self.point1 = Point(x1, y1)    
        print()
        while (run):
            string2 = input("Enter the second point, in the format 'x, y': ")
            i = string2.find(",")
            if (i == -1):
                print("Invalid input. Enter the second point, in the format 'x, y'")
            
            else:
                run = False
        x2 = self.removeExtras(string2[:i])
        y2 = self.removeExtras(string2[i + 1:])
        
        if(len(x2) is 0 or len(y2) is 0):
            print("INVALID INPUT. x and y should be numbers.\n")
            self.main()
        
        x2 = float(x2)
        y2 = float(y2)
        self.point2 = Point(x2, y2)
        self.distance = ((self.point2.y - self.point1.y)**2 + (self.point2.x - self.point1.x)**2 )**0.5
        
    def printFunction(self):
        
        print()
        print("First Point \t\t\t\t: ", end = "")
        self.point1.printPoint()
        print()
        print("Second Point \t\t\t\t: ", end = "")
        self.point2.printPoint()
        print()
        print("Distance between points\t\t\t:", self.distance)
       
    def removeExtras(self, string):
        newString = str()
        for char in string:
            if (char.isdecimal() or char is '.'):
                newString = newString + char
        
        return newString