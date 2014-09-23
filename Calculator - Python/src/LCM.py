'''
Created on Jun 12, 2014
@author: Saahiti & Alisa
'''
from GCF import GCF

class LCM(object):
    
    def __init__(self, first, second):
        
        first = self.removeExtras(first)
        second = self.removeExtras(second)
        
        self.first = abs(int(first))
        self.second = abs(int(second))
        self.main()
    
    def main(self):
        g = GCF(str(self.first), str(self.second))
        gcf = g.gcf
        firstFactor = self.first/gcf
        secondFactor = self.second/gcf
        self.lcm = int (firstFactor * secondFactor * gcf)
                
    def removeExtras(self, string):        
        newString = str()
        
        for char in string:
            if (char.isdecimal()):
                newString = newString + char
            
        return newString
    
    def printFunction(self):
        print("Lowest Common Multiple\t:", self.lcm)
        print()


        