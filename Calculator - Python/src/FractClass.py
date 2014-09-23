'''
Created on 2014-05-29

@author: Alisa
'''

class Fraction:
    def __init__(self, num = 0, denom = 1):
        self.num = num
        self.denom = denom
    
    def getFraction(self):
        return self.num/self.denom
    
    def printFunction(self):
        print(self.num, "/", self.denom) 
       
    def getNum(self):
        return self.num
    
    def getDenom(self):
        return self.denom
    
    def printMixedFract(self):
        print(int(self.num/self.denom), self.num%self.denom, "/", self.denom)
    
    def reduceFract(self):
        gcf = 1
        n = 1
        if (self.num >= self.denom):
            while (n<=self.denom):
                if(self.denom%n==0 and self.num%n == 0):
                    gcf = n
                n= n+1
        else:
            while (n<=self.num):
                if(self.denom%n==0 and self.num%n == 0):
                    gcf = n
                n= n+1
        self.num = self.num/gcf
        self.denom = self.denom/gcf
        
    def addFract(self, num2, denom2):
        totNum = self.num * denom2 + num2 * self.denom
        totDenom = self.denom * denom2
        print(totNum, "/", totDenom)
        return(Fraction(totNum,totDenom))
    
    def subtrFract(self, num2, denom2):
        totNum = self.num * denom2 - num2 * self.denom
        totDenom = self.denom * denom2
        print(totNum, "/", totDenom)
        return(Fraction(totNum,totDenom))
    
    def multFract(self, num2, denom2):
        totNum = num2 * self.num
        totDenom = denom2 * self.denom
        print(totNum, "/", totDenom)
        return (Fraction(totNum,totDenom))
    
    def divFract(self, num2, denom2):
        totNum = denom2 * self.num
        totDenom = num2 * self.denom
        print(totNum, "/", totDenom)
        return (Fraction(totNum,totDenom))
