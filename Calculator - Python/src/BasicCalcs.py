'''
Created on 2014-06-03

@author: Alisa & Saahiti
'''

class BasicCalculation:
    def __init__(self, inp):
        self.i = inp
        
    def mult(self, arr):
        return (float(arr[0]) * float(arr[2]))

    def add(self, arr):
        return (float(arr[0]) + float(arr[2]))

    def subtr(self, arr):
        return (float(arr[0]) - float(arr[2]))

    def div(self, arr):
        if (arr[2] == 0):
            print("Error, division by 0")
        else:
            return (float(arr[0]) / float(arr[2]))

    def pow(self, arr):
        return (float(arr[0]) ** float(arr[2]))

    def bracket(self, arr):
        while (arr.__contains__("^")):
            p = arr.index("^")
            num = self.pow(arr[p-1:p+2])    
            for q in range(3):
                arr.__delitem__(p-1)
            arr.insert(p-1, num) 
        while (arr.__contains__("/")):
            p = arr.index("/")
            num = self.div(arr[p-1:p+2])    
            for q in range(3):
                arr.__delitem__(p-1)
            arr.insert(p-1, num) 
        while (arr.__contains__("*")):
            p = arr.index("*")
            num = self.mult(arr[p-1:p+2])    
            for q in range(3):
                arr.__delitem__(p-1)
            arr.insert(p-1, num) 
        while (arr.__contains__("-")):
            p = arr.index("-")
            num = self.subtr(arr[p-1:p+2])    
            for q in range(3):
                arr.__delitem__(p-1)
            arr.insert(p-1, num) 
        while (arr.__contains__("+")):
            p = arr.index("+")
            num = self.add(arr[p-1:p+2])    
            for q in range(3):
                arr.__delitem__(p-1)
            arr.insert(p-1, num) 
        return arr[1]

    def splitToList(self, s):
        arr = []
        indStart = 0
        for x in range(s.__len__()):
            if (s.__getitem__(x) is '^' or s.__getitem__(x) is '+' or s.__getitem__(x) is '-' or s.__getitem__(x) is '*' or s.__getitem__(x) is '/' or s.__getitem__(x) is '(' or s.__getitem__(x) is ')'):
                if (not indStart == x):
                    arr.insert(arr.__len__(), s[indStart:x])
                arr.insert(arr.__len__(), s.__getitem__(x))
                indStart = x+1
        arr.insert(arr.__len__(), s[indStart:s.__len__()])
        return arr 
          
    def basicCalc(self):
        self.i = self.i.replace(" ", "")
        arr = self.splitToList(self.i)
        num = None
        x = 0
        while (x<arr.__len__() and arr.__contains__("-")):
            if (arr.__getitem__(x) is '-' and (x==0 or arr[x-1].__eq__("(") or arr[x-1].__eq__("^") or arr[x-1].__eq__("*") or arr[x-1].__eq__("/") or arr[x-1].__eq__("-") or arr[x-1].__eq__("+")) and not x==1):
                num = -float(arr[x+1])    
                for q in range(2):
                    arr.__delitem__(x)
                arr.insert(x, num) 
            else:
                x = x + 1 
        
        x = arr.__len__()-1
        while (x>=0 and arr.__contains__("(")):
            if(arr.__getitem__(x).__eq__("(")):
                y = arr.__len__() - 1
                lastBrackAt = - 1
                while(y > x):
                    if(arr.__getitem__(y).__eq__(")") and not arr.__getitem__(y).__eq__("1")):
                        lastBrackAt = y
                    y = y - 1
                num = self.bracket(arr[x:lastBrackAt + 1])
                i = x
                while (i<=lastBrackAt):
                    arr.__delitem__(i)
                    lastBrackAt = lastBrackAt - 1
                arr.insert(x, num)
            x = x - 1

        x = 0   
        while (x< arr.__len__() and arr.__contains__("^")):
            if (arr.__getitem__(x) is "^"):
                num = self.pow(arr[x-1:x+2])  
                for q in range(3):
                    arr.__delitem__(x-1)
                arr.insert(x-1, num) 
            else:
                x = x + 1
        
        x = 0   
        while (x< arr.__len__() and arr.__contains__("/")):
            if (arr.__getitem__(x).__eq__("/") and not arr.__getitem__(x).__eq__("*")):
                num = self.div(arr[x-1:x+2])    
                for q in range(3):
                    arr.__delitem__(x-1)
                arr.insert(x-1, num) 
            else:
                x = x + 1

        x = 0   
        while (x<arr.__len__() and arr.__contains__("*")):
            if (arr.__getitem__(x) is '*'):
                num = self.mult(arr[x-1:x+2])    
                for q in range(3):
                    arr.__delitem__(x-1)
                arr.insert(x-1, num) 
            else:
                x = x + 1
                
        x = 0
        while (x<arr.__len__() and arr.__contains__("-")):
            if (arr.__getitem__(x) is '-'):
                num = self.subtr(arr[x-1:x+2])    
                for q in range(3):
                    arr.__delitem__(x-1)
                arr.insert(x-1, num) 
            else:
                x = x + 1 
        x = 0   
        while (x<arr.__len__() and arr.__contains__("+")):
            if (arr.__getitem__(x) is '+'):
                num = self.add(arr[x-1:x+2])    
                for q in range(3):
                    arr.__delitem__(x-1)
                arr.insert(x-1, num) 
            else:
                x = x + 1  
        print("{0:.5f}".format(arr.__getitem__(0)))
        return "{0:.5f}".format(arr.__getitem__(0))