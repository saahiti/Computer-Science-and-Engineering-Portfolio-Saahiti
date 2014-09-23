'''
Created on Jun 10, 2014
@author: Saahiti & Alisa
'''
class GCF(object):
    
    def __init__(self, first, second):
        
        first = self.removeExtras(first)
        second = self.removeExtras(second)
        
        self.first = abs(int(first))
        self.second = abs(int(second))
        self.main()
    
    def main(self):
        a = self.first
        b = self.second
        
        if (a < b):
            minimum = a
        else:
            minimum = b
        
        self.gcf = 1
        for x in range(1, minimum + 1):
            if (a % x == 0  and b % x == 0):
                self.gcf = x
        
        print("First Number\t\t:", self.first)
        print("Second Number\t\t:", self.second)
                
    def removeExtras(self, string):        
        newString = str()
        
        for char in string:
            if (char.isdecimal()):
                newString = newString + char
            
        return newString
    
    def printFunction(self):
        print("Greatest Common Factor\t:", self.gcf)
        print()
        
        
        