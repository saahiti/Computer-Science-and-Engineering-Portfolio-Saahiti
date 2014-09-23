'''
Created on 2014-05-27

@author: Alisa and Saahiti
'''

import sys
try:
    print("Input the code for the feature you want to use out of the ones below:")
    print("Basic Calculation (bc), Root (rt), Logarithmics (log), Natural Logarithmics (ln), Trigonometry (t), Fraction(f), Factorials (fa),")
    print("Lowest Common Multiple (lcm), Greatest Common Factor (gcf), Random Integer Generator (r), Matrices (m), Polynomial Function (pf),")
    print("Distance Between Two Points (di), Triangle Solver (ts), Intersection Between Linear/Quadratic Functions (i), ")
    print("Store a Variable (s), Restore a Stored Variable (rst),")
    i1 = input("or 'exit' to Exit the Program:   ")
    print("")
    import math
    
    if (i1.lower().__eq__("exit")):
        sys.exit("Thank you for using Cali!")
    
    a = None 
    b = None 
    c = None 
    d = None 
    e = None  
    f = None
    g = None
    
    def bc():
        print("Input what needs to be calculated (no equals sign, can include: '+', '-', '*', '/', '^', '(', ')', 'e' ")
        i = input("and can restore a value if written as rst(variable) - eg. rst(c)):  ")
        import FractClass
        import math
        if(i.__contains__("rst(a)")):
            if (a is not None and (a.__class__ is int or a.__class__ is float or a.__class__ is FractClass.Fraction)):
                if (a.__class__ is FractClass.Fraction):
                    i = i.replace("rst(a)", str(a.getFraction()))
                else:
                    i = i.replace("rst(a)", str(a))
            else: 
                print("Cannot use that restore, a, in an equation")
                return None
        if(i.__contains__("rst(b)")):
            if(b is not None and (b.__class__ is int or b.__class__ is float or b.__class__ is FractClass.Fraction)):
                if (b.__class__ is FractClass.Fraction):
                    i = i.replace("rst(b)", str(b.getFraction()))
                else:
                    i = i.replace("rst(b)", str(b))
            else:
                print("Cannot use that restore, b, in an equation")
                return None
        if(i.find("rst(c)") > -1):
            if(c is not None and (c.__class__ is int or c.__class__ is float or c.__class__ is FractClass.Fraction)):
                if (c.__class__ is FractClass.Fraction):
                    i = i.replace("rst(c)", str(c.getFraction()))
                else:
                    i = i.replace("rst(c)", str(c))
            else:
                print("Cannot use that restore, c, in an equation")
                return None
        if(i.find("rst(d)") > -1):
            if(d is not None and (d.__class__ is int or d.__class__ is float or d.__class__ is FractClass.Fraction)):
                if (d.__class__ is FractClass.Fraction):
                    i = i.replace("rst(d)", str(d.getFraction()))
                else:
                    i = i.replace("rst(d)", str(d)) 
            else:
                print("Cannot use that restore, d, in an equation")
                return None
        if(i.find("rst(e)") > -1):   
            if(e is not None and (e.__class__ is int or e.__class__ is float or e.__class__ is FractClass.Fraction)):         
                if (e.__class__ is FractClass.Fraction):
                    i = i.replace("rst(e)", str(e.getFraction()))
                else:
                    i = i.replace("rst(e)", str(e))
            else:
                print("Cannot use that restore, e, in an equation")
                return None
        if(i.find("rst(f)") > -1):
            if(f is not None and (f.__class__ is int or f.__class__ is float or f.__class__ is FractClass.Fraction)):
                if (f.__class__ is FractClass.Fraction):
                    i = i.replace("rst(f)", str(f.getFraction()))
                else:
                    i = i.replace("rst(f)", str(f))
            else:
                print("Cannot use that restore, f, in an equation")
                return None
        if(i.find("rst(g)") > -1): 
            if(g is not None and (g.__class__ is int or g.__class__ is float or g.__class__ is FractClass.Fraction)):
                if (g.__class__ is FractClass.Fraction):
                    i = i.replace("rst(g)", str(g.getFraction()))
                else:
                    i = i.replace("rst(g)", str(g)) 
            else:
                print("Cannot use that restore, g, in an equation")
                return None  
        if (i.__contains__("e")):
            i = i.replace("e", str(math.e))
        import BasicCalcs
        BC = BasicCalcs.BasicCalculation(i)
        if (i.replace("-", "").replace("+", "").replace("*", "").replace("/", "").replace("^", "").replace("(", "").replace(")", "").isnumeric()):
            if(i.count("(") == i.count(")")):
                calc = BC.basicCalc()
                return calc
            else:
                print("The brackets are not in equal amounts - either not all were oppened or not all were closed")
        else:
            print("Invalid input")
            return None
    
    def log():
        i = input("Input value to log (can include 'e' and '^'): ")
        b = input("Input the base:  ")
        if(b.isnumeric()): 
            b = int(b) 
            if (i[0].__eq__("e")):
                if (i.__contains__("^")):
                    i = math.e ** int(i[2:])
                else:
                    i = math.e
                print(math.log(i, b))
                return(math.log(i, b))
            elif(i.isnumeric()):
                i = int(i)
                print(math.log(i, b))
                return math.log(i, b)      
            elif(i.__contains__("^")and (i.replace("^", "")).isdecimal()):
                i = float(i[:i.index("^")]) ** float(i[i.index("^") + 1:])
                print("{0:.5f}".format(math.log(i, b)))
                return ("{0:.5f}".format(math.log(i, b)))
            else: 
                print("Cannot log that value")
        else:
            print("Cannot use this base")
        return None
    
    def ln():
        i = input("Input value to ln (can include 'e' and '^'): ")
        if (i[0].__eq__("e")):
            if (i.__contains__("^")):
                print(int(i[2:]))
                return int(i[2:])
            else:
                print(1)
                return 1
        elif(i.isnumeric()):
            i = int(i) 
            print(math.log(i, math.e))
            return math.log(i, math.e)
        else:
            print("Cannot ln that value")
        return None
    
    def di():
        from Distance import Distance
        d = Distance()
        d.printFunction()
        print()
        return d
        #d.printFunction()
    
    def f():
        n = input("Input a numerator:  ")
        while (not n.isnumeric()):
            n = input("Invalid numerator, input a valid numerator:  ")
        d = input("Input a denominator:  ")
        while (not d.isnumeric()):
            d = input("Invalid denominator, input a valid denominator:  ")
        n = int(n)
        d = int(d)
        import FractClass
        fract = FractClass.Fraction(n, d)
        print("What would you like to do with the fraction: ")
        print("Print Fraction (pf), Print the Mixed Fraction (mf), Reduce the Fraction (r), Add a Fraction (a), ")
        inf = input("Subtract a Fraction (s), Multiply a Fraction (m), Divide the Fraction (d):  ")
        if (inf.__eq__("pf")):
            fract.printFunction()
            return fract
        elif(inf.__eq__("mf")):
            fract.printMixedFract()
            return fract
        elif(inf.__eq__("r")):
            fract.reduceFract()
            fract.printFunction()
            return fract
        elif(inf.__eq__("a") or inf.__eq__("s") or inf.__eq__("m") or inf.__eq__("d")):
            num2 = input("Input the numerator of the second fraction:  ")
            while (not num2.isnumeric()):
                num2 = input("Invalid numerator, input a valid numerator:  ")
            num2 = int(num2)
            den2 = int(input("Input the denominator of the second fraction:  "))
            while (not den2.isnumeric()):
                den2 = input("Invalid denominator, input a valid denominator:  ")
            den2 = int(den2)
            if(inf.__eq__("a")):
                return fract.addFract(num2, den2)
            elif(inf.__eq__("s")):
                return fract.subtrFract(num2, den2)
            elif(inf.__eq__("m")):
                return fract.multFract(num2, den2)
            elif(inf.__eq__("d")):
                return fract.divFract(num2, den2)
        else:
            print("That is not a valid option")
            
    def pf():
            string1 = input("Enter a polynomial function. Use 'x' to denote the dependent variable:  ")
            x = float(input("Enter the x-value:  "))
            import PolynomialFunction
            poly = PolynomialFunction.PolynomialFunction(string1, x)
            poly.printFunction()
            return poly
        
    def i():
        first = input("Enter an equation for the first function: ")
        second = input("Enter an equation for the second function: ")
        from Intersection import Intersection
        f = Intersection(first, second)
        f.printFunction()
        return f
    
    def ts():
        import TriangleSolve
        print("Input the side lengths/angles available on the same line (separated by spaces), where each side length is called a, b or c,")
        i = input("and the corresponding angle is called A, B or C (example input: 'a = 5, b = 10, C = 45'):  ")
        i = i.replace(" ", "")
        try:
            if (i.find("a") >= 0):
                n = i.index("a")+2
                s = ""
                while(n<i.__len__() and i.__getitem__(n).isnumeric()):
                    s = s + i.__getitem__(n)
                    n = n+1
                o = float(s)
            else:
                o = None
            if (i.find("b") >= 0):
                n = i.index("b")+2
                s = ""
                while(n<i.__len__() and i.__getitem__(n).isnumeric()):
                    s = s + i.__getitem__(n)
                    n = n+1
                p = float(s)
            else:
                p = None
            if (i.find("c") >= 0):
                n = i.index("c")+2
                s = ""
                while(n<i.__len__() and i.__getitem__(n).isnumeric()):
                    s = s + i.__getitem__(n)
                    n = n+1
                q = float(s)
            else:
                q = None
            if (i.find("A") >= 0):
                n = i.index("A")+2
                s = ""
                while(n<i.__len__() and i.__getitem__(n).isnumeric()):
                    s = s + i.__getitem__(n)
                    n = n+1
                O = float(s)
            else:
                O = None
            if (i.find("B") >= 0):
                n = i.index("B")+2
                s = ""
                while(n< i.__len__() and i.__getitem__(n).isnumeric()):
                    s = s + i.__getitem__(n)
                    n = n+1
                P = float(s)
            else:
                P = None
            if (i.find("C") >= 0):
                n = i.index("C")+2
                s = ""
                while(n< i.__len__() and i.__getitem__(n).isnumeric()):
                    s = s + i.__getitem__(n)
                    n = n+1
                Q = float(s)
            else:
                Q = None
        except ValueError:
            print("There was an error with the input")
            return None
        triSolve = TriangleSolve.TriSolver(o, p, q, O, P, Q)
        triSolve.solve()
        triSolve.printValues()
    
    def fa():
        invalid = True
        try:
            while (invalid):
                numStr = input("Enter a whole number between 1 and 1000: ")
                if(numStr.__contains__("-") or numStr.__contains__(".")):
                    invalid = True
                    print("Invalid input")
                    continue
                elif (len(numStr) is 0):
                    invalid = True     
                    print("Enter an input")
                elif (numStr.isdecimal()):
                    num = int(numStr)
                    if (num >= 1 and num <= 1000):
                        invalid = False
                    else:
                        print("Invalid input")
            
            fact = (math.factorial(num))
        except ValueError:
            print("Invalid input")
            return None
        print(fact)
        return fact
    
    def rt():
        import math
        i = input("Input value to root: ")
        b = input("Input the root exponent (2 in a square root, 3 in a cube root, so on): ")
        if(b.isnumeric()): 
            b = int(b) 
            if (i.isnumeric()):
                i = int(i)
                if(i>=0):
                    print(i**(1/b))
                    return(i**(1/b))
                else:
                    print("Cannot root a negative value - no real solutions")
            else:
                print("cannot root that value")
        else:
            print("Cannot use this root exponent")
        return None 
    
    def r():
        import random
        l = input("Input the bottom of the random range (or none if no range):  ")
        h = input("Input the top of the random range (or none if no range):  ")
        if(l.isnumeric() and h.isnumeric()): 
            if(l>h):
                print("The lower value is larger that the higher value - cannort generate number")
                rand = None
            else:
                l = int(l)
                h = int(h)
                rand = random.randint(l, h)
                print(rand)
        else:
            if (h.lower().__eq__("none") and l.lower().__eq__("none")):
                rand = random.randint(-1000000, 10000000)
                print(rand)
            elif(l.lower().__eq__("none")):
                rand = random.randint(-1000000, h)
                print(rand)
            elif(h.lower().__eq__("none")):
                rand = random.randint(l, 1000000)
                print(rand)
            else:
                print("Cannot generate a random value with those ranges")
                rand = None
        return rand
    
    def t():
        import math
        i = input("Input the trigonometric function (sin, cos, tan, asin, acos, atan):  ")
        v = input("Input the value to put into the function (in degrees):  ")
        if (v.isnumeric()):
            try:
                v = int(v)
                if (i.lower().__eq__("sin") or i.lower().__eq__("sinusoidal")):
                    v = math.radians(v)
                    print("{0:.5f}".format(math.sin(v)))
                    return "{0:.5f}".format(math.sin(v))
                if (i.lower().__eq__("cos") or i.lower().__eq__("cosine")):
                    v = math.radians(v)
                    print("{0:.5f}".format(math.cos(v)))
                    return "{0:.5f}".format(math.cos(v))
                if (i.lower().__eq__("tan")):
                    v = math.radians(v)
                    print("{0:.5f}".format(math.tan(v)))
                    return "{0:.5f}".format(math.tan(v))
                if (i.lower().__eq__("asin") or i.lower().__eq__("arc sin") or i.lower().__eq__("inverse sin")):
                    print("{0:.5f}".format(math.degrees(math.asin(v))))
                    return ("{0:.5f}".format(math.degrees(math.asin(v))))
                if (i.lower().__eq__("acos") or i.lower().__eq__("arc cos") or i.lower().__eq__("inverse cos")):
                    print("{0:.5f}".format(math.degrees(math.acos(v))))
                    return ("{0:.5f}".format(math.degrees(math.acos(v))))
                if (i.lower().__eq__("atan") or i.lower().__eq__("arc tan") or i.lower().__eq__("inverse tan")):
                    print("{0:.5f}".format(math.degrees(math.atan(v))))
                    return ("{0:.5f}".format(math.degrees(math.atan(v))))
                else:
                    print("Not a valid trigonometric function")
                    return None
            except ValueError:
                print("There was an error with the input")
        else:
            print("Cannot use that value")
            return None
        
    def makeRandMat(r, c):
        import random
        mat = [[0 for x in range(c)] for y in range(r)]
        rang = input("Do you wish the random numbers to be in a specific range? (Y/N)  ")
        low = None
        high = None
        if(rang.lower().__eq__("y")):
            low = input("Input the lower value in the range:  ")
            while(not low.replace("-", "").isdecimal() or low.count("-")>1):
                low = input("Input a valid lower range:  ")
            if(low.count("-")==1):
                low = low.replace("-", "")
                low = - int(low)
            else:    
                low = int(low)
            high = input("Input the high value in the range:  ")
            while(not high.replace("-", "").isdecimal() or high.count("-")>1):
                high = input("Input a valid lower range:  ")
            if(high.count("-")==1):
                high = high.replace("-", "")
                high = - int(high)
            else:    
                high = int(high)
            high = int(high)
            if(high<low):
                temp = low
                low = high
                high = temp
        for x in range(r):
            for y in range(c):
                if(low is not None):
                    mat[x][y] = random.randint(low, high)
                else:
                    mat[x][y] = random.randint(-100000, 1000000)
        return mat            
                    
    def m(): 
        import MatManip
        print("What would you like to do: ")
        print("Matrix Addition (a), Matrix Multiplication (m), Matrix Multiplication by a Constant (mc), ")    
        print("Matrix Subtraction (s), Divide by Another Matrix (d), Matrix Inversion (i),")
        m = input("Simplify the Rows (sr), Find the Descriminant (fd), Transpose the Matrix (t), Make an Identity Matrix (im):  ") 
        if (m.__eq__("a") or m.__eq__("m") or m.__eq__("s") or m.__eq__("d")):
            r1 = input("Input the number of rows in the first matrix:  ")
            while (not r1.isnumeric()):
                r1 = input("Input a valid number of rows:  ")
            r1 = int(r1)
            c1 = input("Input the number of columns in the first matrix:  ")
            while (not c1.isnumeric()):
                c1 = input("Input a valid number of columns:  ")
            c1 = int(c1)
            r2 = input("Input the number of rows in the second matrix:  ")
            while (not r2.isnumeric()):
                r2 = input("Input a valid number of rows:  ")
            r2 = int(r2)         
            c2 = input("Input the number of columns in the second matrix:  ")
            while (not c2.isnumeric()):
                c2 = input("Input a valid number of columns:  ")
            c2 = int(c2)
            mat = [[0 for x in range(c1)] for y in range(r1)]
            mat2 = [[0 for x in range(c2)] for y in range(r2)]
            if ((m.__eq__("a") or m.__eq__("s")) and (not r1 == r2 or not c1 == c2)):
                print("The matrices must be the same size to perform this operation")
                return None
            elif(m.__eq__("m") and (not r1==c2 or not c1==r2)):
                print("The matrices must be opposite sizes to perform this operation (eg. if one is 3x4 then the other must be 4x3)")
                return None
            elif(m.__eq__("d")):
                if ((not r1 == r2 or not r1 ==c1 or not r2 == c2)):
                    print("Both matrices must be square for this function to work")
                return None 
            rand = input("Do you wish to generate a random matrix 1 (Y/N) (other option is filling the matrix)   ")
            if (rand.lower().__eq__("y")):
                mat = makeRandMat(r1, c1)
            else:       
                for i in range(r1):
                    for j in range(c1):
                        if (i == 0  and j == 0):
                            print("The numbers inputed will be put into the array, filling the first row first then continuing to the next, and so on.")
                            inp1 = int(input("Input the first value in the first matrix:  "))
                        else:
                            inp1 = int(input("Input the next value in the first matrix:  "))
                        mat[i][j] = inp1       
            rand2 = input("Do you wish to generate a random matrix 2 (Y/N) (other option is filling the matrix)   ")
            if(rand2.lower().__eq__("y")):
                mat2 = makeRandMat(r2, c2)
            else:    
                for i in range(r2):
                    for j in range(c2):
                        if (i == 0  and j == 0):
                            print("The numbers inputed will be put into the array, filling the first row first then continuing to the next, and so on.")
                            inp2 = int(input("Input the first value in the second matrix:  "))
                        else:
                            inp2 = int(input("Input the next value in the second matrix:  "))
                        mat2[i][j] = inp2
            matObj = MatManip.MatrixManipulation(mat) 
            print ("Matrix 1:")
            matObj.printMat()
            print ("Matrix 2:")
            matObj.printMat(mat2) 
            print("Answer:")      
            if (m.__eq__("a")):
                return matObj.matAdd(mat2)
            elif (m.__eq__("s")):
                return matObj.matSubtr(mat2)
            elif(m.__eq__("m")):
                return matObj.matMult(mat2)
            elif(m.__eq__("d")):
                return matObj.divideSelfByMat(mat2)
        elif(m.__eq__("mc") or m.__eq__("i") or m.__eq__("sr") or m.__eq__("fd") or m.__eq__("t")):
            r1 = input("Input the number of rows in the matrix:  ")
            while (not r1.isnumeric()):
                r1 = input("Input a valid number of rows:  ")
            r1 = int(r1)
            c1 = input("Input the number of columns in the matrix:  ")
            while (not c1.isnumeric()):
                c1 = input("Input a valid number of columns:  ")
            c1 = int(c1)
            mat = [[0 for x in range(c1)] for y in range(r1)]
            if (m.__eq__("fd") or m.__eq__("d") or m.__eq__("i")):
                if(not r1 == c1):
                    print("The matrices must be square to perform this operation")
                    return None
            rand = input("Do you wish to generate a random matrix (Y/N) (other option is filling the matrix)   ")
            if (rand.lower().__eq__("y")):
                mat = makeRandMat(r1, c1)
            else:
                for i in range(r1):
                    for j in range(c1):
                        if (i == 0  and j == 0):
                            print("The numbers inputed will be put into the array, filling the first row first then continuing to the next, and so on.")
                            inp1 = float(input("Input the first value in the matrix:  "))
                        else:
                            inp1 = float(input("Input the next value in the matrix:  "))
                    mat[i][j] = inp1
            matObj = MatManip.MatrixManipulation(mat)  
            print ("Matrix 1:")
            matObj.printMat()  
            print("Answer:")    
            if (m.__eq__("mc")):
                c = int(input ("Input the constant: "))
                return matObj.matMultByConst(c)
            elif (m.__eq__("i")):
                matObj.printMat(matObj.invMat())
                return matObj.invMat()
            elif(m.__eq__("m")):
                return matObj.simplifyMat()
            elif(m.__eq__("fd")):
                print(matObj.determinant())
                return matObj.determinant()
            elif(m.__eq__("t")):
                return matObj.transpose()
        elif(m.__eq__("im")):
            s = int(input("Input the size of the matrix you wish to make:  "))
            m = [[0 for x in range(2)] for x in range(2)]
            matObj = MatManip.MatrixManipulation(m)
            return(matObj.identMat(s))
        else:
            print("That is not an option")
            return None
        
    def restore():
        import FractClass
        import Intersection
        import GCF
        import LCM
        import Distance
        import MatManip
        
        where = input("What variable do you wish to restore (a to g):  ")
        if (where.lower().__eq__("a")):             
            if (a.__class__ is FractClass.Fraction or a.__class__ is Intersection.Intersection or a.__class__ is GCF.GCF 
            or a.__class__ is Distance.Distance or a.__class__ is LCM.LCM or a.__class__ is MatManip.MatrixManipulation):
                a.printFunction()       
            else:
                print(a)
        elif (where.lower().__eq__("b")):
            if (b.__class__ is FractClass.Fraction or b.__class__ is Intersection.Intersection or b.__class__ is GCF.GCF 
            or b.__class__ is Distance.Distance or b.__class__ is LCM.LCM or b.__class__ is MatManip.MatrixManipulation):
                b.printFunction()
            else:
                print(b)
        elif (where.lower().__eq__("c")):
            if (c.__class__ is FractClass.Fraction or c.__class__ is Intersection.Intersection or c.__class__ is GCF.GCF 
            or c.__class__ is Distance.Distance or c.__class__ is LCM.LCM or c.__class__ is MatManip.MatrixManipulation):
                c.printFunction()        
            else:
                print(c)
        elif (where.lower().__eq__("d")):
            if (d.__class__ is FractClass.Fraction  or d.__class__ is Intersection.Intersection or d.__class__ is GCF.GCF 
            or d.__class__ is Distance.Distance or d.__class__ is LCM.LCM or d.__class__ is MatManip.MatrixManipulation):
                d.printFunction()         
            else:
                print(d)
        elif (where.lower().__eq__("e")):
            if (e.__class__ is FractClass.Fraction  or e.__class__ is Intersection.Intersection or e.__class__ is GCF.GCF 
            or e.__class__ is Distance.Distance or e.__class__ is LCM.LCM or e.__class__ is MatManip.MatrixManipulation):
                e.printFunction()        
            else:
                print(e)
        elif (where.lower().__eq__("f")):
            if (f.__class__ is FractClass.Fraction  or f.__class__ is Intersection.Intersection or f.__class__ is GCF.GCF 
            or f.__class__ is Distance.Distance or f.__class__ is LCM.LCM or f.__class__ is MatManip.MatrixManipulation):
                f.printFunction()        
            else:
                print(f)
        elif (where.lower().__eq__("g")):
            if (g.__class__ is FractClass.Fraction  or g.__class__ is Intersection.Intersection or g.__class__ is GCF.GCF 
            or g.__class__ is Distance.Distance or g.__class__ is LCM.LCM or g.__class__ is MatManip.MatrixManipulation):
                g.printFunction()        
            else:
                print(g)
        else:
            print("Cannot restore there")
                   
    while (not i1.lower().__eq__("exit")):
        if (i1.__eq__('bc')):
            calc = bc()   
            if (calc is not None):
                s = input("Do you wish to store this value? (Y/N)  ")
                if (s.lower().__eq__("y")):
                    where = input("Where do you wish to store it (letter a to g):  ")
                    if (where.lower().__eq__("a")):
                        a = calc
                        print(a)
                    elif (where.lower().__eq__("b")):
                        b = calc
                        print(b)
                    elif (where.lower().__eq__("c")):
                        c = calc
                    elif (where.lower().__eq__("d")):
                        d = calc
                    elif (where.lower().__eq__("e")):
                        e = calc
                    elif (where.lower().__eq__("f")):
                        f = calc
                    elif (where.lower().__eq__("g")):
                        g = calc
                    else:
                        print("Cannot store there")
                    
        elif (i1.__eq__('log')):
            l = log()  
            if (l is not None): 
                s = input("Do you wish to store this value? (Y/N)  ")
                if (s.lower().__eq__("y")):
                    where = input("Where do you wish to store it (letter a to g):  ")
                    if (where.lower().__eq__("a")):
                        a = l
                        print(a)
                    elif (where.lower().__eq__("b")):
                        b = l
                        print(b)
                    elif (where.lower().__eq__("c")):
                        c = l
                    elif (where.lower().__eq__("d")):
                        d = l
                    elif (where.lower().__eq__("e")):
                        e = l
                    elif (where.lower().__eq__("f")):
                        f = l
                    elif (where.lower().__eq__("g")):
                        g = l
                    else:
                        print("Cannot store there")    
                        
        elif (i1.__eq__('ln')):
            l = ln()   
            if (l is not None): 
                s = input("Do you wish to store this value? (Y/N)  ")
                if (s.lower().__eq__("y")):
                    where = input("Where do you wish to store it (letter a to g):  ")
                    if (where.lower().__eq__("a")):
                        a = l
                        print(a)
                    elif (where.lower().__eq__("b")):
                        b = l
                        print(b)
                    elif (where.lower().__eq__("c")):
                        c = l
                    elif (where.lower().__eq__("d")):
                        d = l
                    elif (where.lower().__eq__("e")):
                        e = l
                    elif (where.lower().__eq__("f")):
                        f = l
                    elif (where.lower().__eq__("g")):
                        g = l
                    else:
                        print("Cannot store there")    
                            
        elif (i1.__eq__('f')):   
            fact = f()
            if (fact is not None):
                s = input("Do you wish to store this value? (Y/N)  ")
                if (s.lower().__eq__("y")):
                    where = input("Where do you wish to store it (letter a to g):  ")
                    if (where.lower().__eq__("a")):
                        a = fact
                    elif (where.lower().__eq__("b")):
                        b = fact
                    elif (where.lower().__eq__("c")):
                        c = fact
                    elif (where.lower().__eq__("d")):
                        d = fact
                    elif (where.lower().__eq__("e")):
                        e = fact
                    elif (where.lower().__eq__("f")):
                        f = fact
                    elif (where.lower().__eq__("g")):
                        g = fact
                    else:
                        print("Cannot store there")
                    
        elif (i1.__eq__('pf')):   
            poly = pf()
            
        elif (i1.__eq__('rst')):   
            restore()
        
        elif (i1.__eq__('ts')):   
            ts()    
         
        elif (i1.__eq__('fa')):
            fact = fa()   
            if (fact is not None): 
                s = input("Do you wish to store this value? (Y/N)  ")
                if (s.lower().__eq__("y")):
                    where = input("Where do you wish to store it (letter a to g):  ")
                    if (where.lower().__eq__("a")):
                        a = fact
                    elif (where.lower().__eq__("b")):
                        b = fact
                    elif (where.lower().__eq__("c")):
                        c = fact
                    elif (where.lower().__eq__("d")):
                        d = fact
                    elif (where.lower().__eq__("e")):
                        e = fact
                    elif (where.lower().__eq__("f")):
                        f = fact
                    elif (where.lower().__eq__("g")):
                        g = fact
                    else:
                        print("Cannot store there") 
                 
        elif (i1.__eq__('rt')):
            root = rt()
            if (root is not None):
                s = input("Do you wish to store this value? (Y/N)  ")
                if (s.lower().__eq__("y")):
                    where = input("Where do you wish to store it (letter a to g):  ")
                    if (where.lower().__eq__("a")):
                        a = root
                    elif (where.lower().__eq__("b")):
                        b = root
                    elif (where.lower().__eq__("c")):
                        c = root
                    elif (where.lower().__eq__("d")):
                        d = root
                    elif (where.lower().__eq__("e")):
                        e = root
                    elif (where.lower().__eq__("f")):
                        f = root
                    elif (where.lower().__eq__("g")):
                        g = root
                    else:
                        print("Cannot store there")
            
        elif (i1.__eq__('r')):
            rand = r()
            if(rand is not None):
                s = input("Do you wish to store this value? (Y/N)  ")
                if (s.lower().__eq__("y")):
                    where = input("Where do you wish to store it (letter a to g):  ")
                    if (where.lower().__eq__("a")):
                        a = rand
                    elif (where.lower().__eq__("b")):
                        b = rand
                    elif (where.lower().__eq__("c")):
                        c = rand
                    elif (where.lower().__eq__("d")):
                        d = rand
                    elif (where.lower().__eq__("e")):
                        e = rand
                    elif (where.lower().__eq__("f")):
                        f = rand
                    elif (where.lower().__eq__("g")):
                        g = rand
                    else:
                        print("Cannot store there")               
        
        elif (i1.__eq__('t')):
            trig = t()
            if(trig is not None):
                s = input("Do you wish to store this value? (Y/N)  ")
                if (s.lower().__eq__("y")):
                    where = input("Where do you wish to store it (letter a to g):  ")
                    if (where.lower().__eq__("a")):
                        a = trig
                    elif (where.lower().__eq__("b")):
                        b = trig
                    elif (where.lower().__eq__("c")):
                        c = trig
                    elif (where.lower().__eq__("d")):
                        d = trig
                    elif (where.lower().__eq__("e")):
                        e = trig
                    elif (where.lower().__eq__("f")):
                        f = trig
                    elif (where.lower().__eq__("g")):
                        g = trig
                    else:
                        print("Cannot store there")     
        elif (i1.__eq__('i')):
            inter = i()
            if(inter is not None):
                s = input("Do you wish to store this value? (Y/N)  ")
                if (s.lower().__eq__("y")):
                    where = input("Where do you wish to store it (letter a to g):  ")
                    if (where.lower().__eq__("a")):
                        a = inter
                    elif (where.lower().__eq__("b")):
                        b = inter
                    elif (where.lower().__eq__("c")):
                        c = inter
                    elif (where.lower().__eq__("d")):
                        d = inter
                    elif (where.lower().__eq__("e")):
                        e = inter
                    elif (where.lower().__eq__("f")):
                        f = inter
                    elif (where.lower().__eq__("g")):
                        g = inter
                    else:
                        print("Cannot store there")  
                           
        elif (i1.__eq__('gcf')):
            
            run = True
            
            while(run):
                first = input("Enter the first number: ")
                second = input("Enter the second number: ")
                newString = str()
                
                for char in first:
                    if (char.isdecimal()):
                        newString = newString + char
                
                first = newString
                newString = ""        
                
                for char in second:
                    if (char.isdecimal()):
                        newString = newString + char
                second = newString
                           
                if(len(first) is 0 or len(second) is 0):
                    print("INVALID INPUT. You must integer values only.\n")
                else:
                    #first = int(first)
                    #second = int(second)
                    run = False
            
            from GCF import GCF
            factor = GCF(first, second)
            factor.printFunction()
            if(factor is not None):
                s = input("Do you wish to store this value? (Y/N)  ")
                if (s.lower().__eq__("y")):
                    where = input("Where do you wish to store it (letter a to g):  ")
                    if (where.lower().__eq__("a")):
                        a = factor
                    elif (where.lower().__eq__("b")):
                        b = factor
                    elif (where.lower().__eq__("c")):
                        c = factor
                    elif (where.lower().__eq__("d")):
                        d = factor
                    elif (where.lower().__eq__("e")):
                        e = factor
                    elif (where.lower().__eq__("f")):
                        f = factor
                    elif (where.lower().__eq__("g")):
                        g = factor
                    else:
                        print("Cannot store there")
        
        elif (i1.__eq__('di')):
            dist = di()
            
            if(dist is not None):
                s = input("Do you wish to store this value? (Y/N)  ")
                if (s.lower().__eq__("y")):
                    where = input("Where do you wish to store it (letter a to g):  ")
                    if (where.lower().__eq__("a")):
                        a = dist
                    elif (where.lower().__eq__("b")):
                        b = dist
                    elif (where.lower().__eq__("c")):
                        c = dist
                    elif (where.lower().__eq__("d")):
                        d = dist
                    elif (where.lower().__eq__("e")):
                        e = dist
                    elif (where.lower().__eq__("f")):
                        f = dist
                    elif (where.lower().__eq__("g")):
                        g = dist
                    else:
                        print("Cannot store there")
                        
        elif (i1.__eq__('lcm')):
            
            run = True
            
            while(run):
                first = input("Enter the first number: ")
                second = input("Enter the second number: ")
                newString = str()
                
                for char in first:
                    if (char.isdecimal()):
                        newString = newString + char
                
                first = newString
                newString = ""        
                
                for char in second:
                    if (char.isdecimal()):
                        newString = newString + char
                second = newString
                           
                if(len(first) is 0 or len(second) is 0):
                    print("INVALID INPUT. You must integer values only.\n")
                else:
                    run = False
            
            from LCM import LCM
            lcm1 = LCM(first, second)
            lcm1.printFunction()
                    
            if(lcm1 is not None):
                s = input("Do you wish to store this value? (Y/N)  ")
                if (s.lower().__eq__("y")):
                    where = input("Where do you wish to store it (letter a to g):  ")
                    if (where.lower().__eq__("a")):
                        a = lcm1
                        
                    elif (where.lower().__eq__("b")):
                        b = lcm1
                    elif (where.lower().__eq__("c")):
                        c = lcm1
                    elif (where.lower().__eq__("d")):
                        d = lcm1
                    elif (where.lower().__eq__("e")):
                        e = lcm1
                    elif (where.lower().__eq__("f")):
                        f = lcm1
                    elif (where.lower().__eq__("g")):
                        g = lcm1
                    else:
                        print("Cannot store there")
                        
        elif(i1.__eq__("m")):
            mat = m()
            import MatManip
            if(mat is not None):
                if(mat.__class__ is not int):
                    mat = MatManip.MatrixManipulation(mat)
                s = input("Do you wish to store this matrix? (Y/N)  ")
                if (s.lower().__eq__("y")):
                    where = input("Where do you wish to store it (letter a to g):  ")
                    if (where.lower().__eq__("a")):
                        a = mat
                    elif (where.lower().__eq__("b")):
                        b = mat
                    elif (where.lower().__eq__("c")):
                        c = mat
                    elif (where.lower().__eq__("d")):
                        d = mat
                    elif (where.lower().__eq__("e")):
                        e = mat
                    elif (where.lower().__eq__("f")):
                        f = mat
                    elif (where.lower().__eq__("g")):
                        g = mat
                    else:
                        print("Cannot store there") 
                        
        elif(i1.__eq__("s")):
            s = input("What do you wish to store?  ")
            if (s.isnumeric()):
                s = int(s)
                where = input("Where do you wish to store it (letter a to g):  ")
                if (where.lower().__eq__("a")):
                    a = s
                elif (where.lower().__eq__("b")):
                    b = s
                elif (where.lower().__eq__("c")):
                    c = s
                elif (where.lower().__eq__("d")):
                    d = s
                elif (where.lower().__eq__("e")):
                    e = s
                elif (where.lower().__eq__("f")):
                    f = s
                elif (where.lower().__eq__("g")):
                    g = s
                else:
                    print("Cannot store there")   
            else:
                print("The value stored must be a number")
        else:
            print("That is not a valid option")            
        print("")
        command  = input("Do you wish to proceed? (Y/N): ")
        
        if (command is 'y' or command is 'Y'):
            print()
            print("Input the code for the feature you want to use out of the ones below:")
            print("Basic Calculation (bc), Root (rt), Logarithmics (log), Natural Logarithmics (ln), Trigonometry (t), Fraction(f), Factorials (fa),")
            print("Lowest Common Multiple (lcm), Greatest Common Factor (gcf), Random Integer Generator (r), Matrices (m), Polynomial Function (pf),")
            print("Distance Between Two Points (di), Triangle Solver (ts), Intersection Between Linear/Quadratic Functions (i), ")
            print("Store a Variable (s), Restore a Stored Variable (rst),")
            i1 = input("or 'exit' to Exit the Program:   ")
            print("")
        else:
            sys.exit("Thank you for using Cali!")
    sys.exit("Thank you for using Cali!")              
except EOFError:
    print("")
    sys.exit("Thank you for using Cali!")  