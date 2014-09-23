'''
Created on 2014-06-10

@author: Alisa 
'''

class MatrixManipulation:
    def __init__(self, arr):
        self.mat = arr
    
    def GCD(self, m, n):
        if(n<=0):
            return m
        else:
            return self.GCD(n, m%n)
  
    def isSquare(self):
        if(self.mat.__len__() == self.mat[0].__len__()):
            return True
        return None

    def matMult(self, mat2, mat5 = None):
        if (mat5 is None):
            mat3 = [[0 for x in range(self.mat.__len__())] for y in range(mat2[0].__len__())]
            for r in range(mat3.__len__()):
                for c in range(mat3[0].__len__()):
                    for d in range(self.mat[0].__len__()):
                        mat3[r][c] = mat3[r][c] + (self.mat[r][d]*mat2[d][c])
            self.printMat(mat3)          
            return mat3
        else:
            mat3 = [[0 for x in range(mat2.__len__())] for y in range(mat5[0].__len__())]
            for r in range(mat3.__len__()):
                for c in range(mat3[0].__len__()):
                    for d in range(mat2[0].__len__()):
                        mat3[r][c] = mat3[r][c] + (mat2[r][d]*mat5[d][c])
            self.printMat(mat3)          
            return mat3
    
    def matMultByConst(self, const, mat2 = None):
        if (mat2 is None):
            for x in range(self.mat.__len__()):
                for y in range(len(self.mat[0])):
                    self.mat[x][y] = self.mat[x][y]*const
            self.printMat()
            return(self.mat)
        else:
            for x in range(len(mat2)):
                for y in range(len(mat2[0])):
                    mat2[x][y] = mat2[x][y]*const
            return(mat2)

    def matAdd(self, mat2):
        if (mat2.__len__()==self.mat.__len__() and mat2[0].__len__()==self.mat[0].__len__()):
            mat3 = [[0 for x in range(self.mat[0].__len__())] for y in range(self.mat.__len__())]
            for r in range(mat3.__len__()):
                for c in range(mat3[0].__len__()):
                    mat3[r][c] = self.mat[r][c]+mat2[r][c]         
            self.printMat(mat3)
            return mat3
        else:
            print("cannot add those matrices - not the same size")
            return None
        
    def printMat(self, mat2 = None):
        if (mat2 is None):
            for x in range(len(self.mat)):
                print(self.mat[x])
        else:
            for x in range(len(mat2)):
                print(mat2[x])
    
    def printFunction(self):
        for x in range(self.mat.__len__()):
                print(self.mat[x])

    def matSubtr(self, mat2):
        if (mat2.__len__()==self.mat.__len__() and mat2[0].__len__()==self.mat[0].__len__()):
            mat3 = [[0 for x in range(self.mat[0].__len__())] for y in range(self.mat.__len__())]
            for r in range(mat3.__len__()):
                for c in range(mat3[0].__len__()):
                    mat3[r][c] = self.mat[r][c]-mat2[r][c]       
            self.printMat(mat3)
            return mat3
        else:
            print("cannot subtract those matrices - not the same size")
            return None
    
    def identMat(self, size):
        arrNew = [[0 for x in range(size)]for y in range(size)]
        for i in range(size):
            arrNew[i][i] = 1
        self.printMat(arrNew)
        return arrNew
    
    def invMat(self, mat2 = None):
        if (mat2 is None):
            if (len(self.mat)== len(self.mat[0])):
                if (self.determinant(self.mat) == 0):
                    print("The determinant is zero, has no inverse")
                    return None
                else:
                    detMat = [[0 for x in range(self.mat.__len__() - 1)] for y in range(self.mat[0].__len__() - 1)]
                    matMin = [[0 for x in range(self.mat.__len__())] for y in range(self.mat[0].__len__())]
                    isPlus = True
                    for i in range(self.mat.__len__()):     
                        for j in range(self.mat[0].__len__()):
                            for x in range(self.mat.__len__() - 1):
                                for y in range(self.mat[0].__len__() - 1):
                                    if (y >= i and x>=j):
                                        detMat[x][y] = self.mat[x+1][y+1]
                                    elif (x>=j):
                                        detMat[x][y] = self.mat[x+1][y]
                                    elif (y>=i):
                                        detMat[x][y] = self.mat[x][y+1]
                                    else:
                                        detMat[x][y] = self.mat[x][y]
                            if (isPlus):
                                matMin[i][j] = self.determinant(detMat)
                                if (not j==self.mat[0].__len__()-1):
                                    isPlus = False
                            else:
                                matMin[i][j] = - self.determinant(detMat)
                                if (not j==self.mat[0].__len__()-1):
                                    isPlus = True
                    return (self.matMultByConst(1/self.determinant(self.mat), matMin))
            else:
                print("Not square, cannot detemine determinant")
                return None

        else:
            if (len(mat2)== len(mat2[0])):
                if (self.determinant(mat2) == 0):
                    print("The determinant is zero, has no inverse")
                    return None
                else:
                    detMat = [[0 for x in range(mat2.__len__() - 1)] for y in range(mat2[0].__len__() - 1)]
                    matMin = [[0 for x in range(mat2.__len__())] for y in range(mat2[0].__len__())]
                    isPlus = True
                    for i in range(mat2.__len__()):     
                        for j in range(mat2[0].__len__()):
                            for x in range(mat2.__len__() - 1):
                                for y in range(mat2[0].__len__() - 1):
                                    if (y >= i and x>=j):
                                        detMat[x][y] = mat2[x+1][y+1]
                                    elif (x>=j):
                                        detMat[x][y] = mat2[x+1][y]
                                    elif (y>=i):
                                        detMat[x][y] = mat2[x][y+1]
                                    else:
                                        detMat[x][y] = mat2[x][y]
                            if (isPlus):
                                matMin[i][j] = self.determinant(detMat)
                                if (not j==mat2[0].__len__()-1):
                                    isPlus = False
                            else:
                                matMin[i][j] = - self.determinant(detMat)
                                if (not j==mat2[0].__len__()-1):
                                    isPlus = True
                    return (self.matMultByConst(1/self.determinant(mat2), matMin))
            else:
                print("Not square, cannot detemine determinant")
                return None

    def divideSelfByMat(self, mat2):
        self.printMat(self.matMult(self.matInverse(mat2)))
        return self.matMult(self.matInverse(mat2))
        
    def determinant(self, mat2 = None):
        if (mat2 is None):        
            if (self.isSquare()):
                if (self.mat.__len__() == 1):
                    return self.mat[0][0]
                innerMat = [[0 for x in range(self.mat.__len__() - 1)] for y in range(self.mat[0].__len__() - 1)]
                det = 0
                isPlus = True
                for i in range(self.mat[0].__len__()):     
                    for x in range(self.mat.__len__()-1):
                        for y in range(self.mat[0].__len__() - 1):
                            if (y >= i):
                                innerMat[x][y] = self.mat[x+1][y+1]
                            else:
                                innerMat[x][y] = self.mat[x+1][y]
                    if (isPlus):
                        det = det + self.mat[0][i] * self.determinant(innerMat)
                        isPlus = False
                    else:
                        det = det - self.mat[0][i] * self.determinant(innerMat)
                        isPlus = True
                return det
            else:
                print("Not square, cannot determine determinant")
                return None
        else:
            if (len(mat2)== len(mat2[0])):
                if (mat2.__len__() == 1):
                    return mat2[0][0]
                innerMat = [[0 for x in range(mat2.__len__() - 1)] for y in range(mat2[0].__len__() - 1)]
                det = 0
                isPlus = True
                for i in range(mat2[0].__len__()):     
                    for x in range(mat2.__len__()-1):
                        for y in range(mat2[0].__len__() - 1):
                            if (y >= i):
                                innerMat[x][y] = mat2[x+1][y+1]
                            else:
                                innerMat[x][y] = mat2[x+1][y]
                    if (isPlus):
                        det = det + mat2[0][i] * self.determinant(innerMat)
                        isPlus = False
                    else:
                        det = det - mat2[0][i] * self.determinant(innerMat)
                        isPlus = True
                return det       
            else:
                print("Not square, cannot detemine determinant")
                return None
            
    def simplifyMat(self, mat2 = None):
        import math
        if (mat2 is None):
            gcf = [1 for x in range(len(self.mat))]
            for x in range(self.mat.__len__()):
                for y in range(self.mat[0].__len__()):
                    if (y == 0):
                        gcf[x] = self.mat[x][y]
                    else:
                        gcf[x] = self.GCD(self.GCD(math.fabs(self.mat[x][0]), math.fabs(self.mat[x][y])), gcf[x])
            for i in range(self.mat.__len__()):
                for j in range(self.mat[0].__len__()): 
                    if (not gcf[i]==0):
                        self.mat[i][j] = self.mat[i][j]/gcf[i]
            self.printMat(self.mat)
            return self.mat
        else:
            gcf = [1 for x in range(len(mat2))]
            for x in range(mat2.__len__()):
                for y in range(mat2[0].__len__()):
                    if (y == 0):
                        gcf[x] = mat2[x][y]
                    else:
                        gcf[x] = self.GCD(self.GCD(math.fabs(mat2[x][0]), math.fabs(mat2[x][y])), gcf[x])
            for i in range(mat2.__len__()):
                for j in range(mat2[0].__len__()): 
                    if (not gcf[i]==0):
                        mat2[i][j] = mat2[i][j]/gcf[i]
            self.printMat(mat2)
            return mat2
        
    def transpose(self, mat2 = None):
        if (mat2 is None):
            arrNew = [[0 for x in range(self.mat.__len__())] for y in range(self.mat[0].__len__())]
            for v in range(self.mat.__len__()):
                for w in range(self.mat[v].__len__()):
                    arrNew[w][v] = self.mat[v][w]
            self.printMat(arrNew)
            return arrNew
        else:
            arrNew = [[0 for x in range(mat2.__len__())] for y in range(mat2[0].__len__())]
            for v in range(mat2.__len__()):
                for w in range(mat2[v].__len__()):
                    arrNew[w][v] = mat2[v][w]
            return arrNew
    
    
'''    
    def matInverse(self, mat2 = None):
        if (mat2 is None):
            if (len(self.mat)==2 and self.determinant() is not None):
                if (not self.determinant() == 0 and self.determinant is not None):
                    matInv = self.matMultByConst((1/self.determinant()), [[self.mat[1][1], -self.mat[0][1]], [self.mat[0][0], -self.mat[1][0]]]) 
                    return((matInv))
                else:
                    print("No inverse, determinant is 0")
                    return None
            elif(len(self.mat)==3 and self.determinant() is not None):
                if (not self.determinant() == 0 and self.determinant is not None):
                    matInv = [[self.mat[1][1]* self.mat[2][2] - self.mat[2][1]*self.mat[1][2], self.mat[0][2]* self.mat[2][1] - self.mat[2][2]*self.mat[0][1], self.mat[0][1]* self.mat[1][2] - self.mat[0][2]*self.mat[1][1]], [self.mat[1][2]* self.mat[2][0] - self.mat[1][0]*self.mat[2][2], self.mat[0][0]* self.mat[2][2] - self.mat[0][2]*self.mat[2][0], self.mat[1][0]* self.mat[0][2] - self.mat[0][0]*self.mat[1][2]], [self.mat[1][0]* self.mat[2][1] - self.mat[2][0]*self.mat[1][1], self.mat[0][1]* self.mat[2][0] - self.mat[2][1]*self.mat[0][0], self.mat[1][1]* self.mat[0][0] - self.mat[1][0]*self.mat[0][1]]]
                    matInv = self.matMultByConst(1/self.determinant(), matInv)
                    return(matInv)
                else:
                    print("No inverse, determinant is 0")
                    return None
        else:
            if (len(mat2)==2):
                if (not self.determinant(mat2) == 0 and self.determinant(mat2) is not None):
                    matInv = self.MultByConst((1/self.determinant(mat2)), [[mat2[1][1], -mat2[0][1]], [mat2[0][0], -mat2[1][0]]], mat2) 
                    return(matInv)
                else:
                    print("No inverse, determinant is 0")
                    return None
            elif(len(self.mat)==3):
                if (not self.determinant() == 0 and self.determinant(mat2) is not None):
                    matInv = [[self.mat[1][1]* self.mat[2][2] - self.mat[2][1]*self.mat[1][2], self.mat[0][2]* self.mat[2][1] - self.mat[2][2]*self.mat[0][1], self.mat[0][1]* self.mat[1][2] - self.mat[0][2]*self.mat[1][1]], [self.mat[1][2]* self.mat[2][0] - self.mat[1][0]*self.mat[2][2], self.mat[0][0]* self.mat[2][2] - self.mat[0][2]*self.mat[2][0], self.mat[1][0]* self.mat[0][2] - self.mat[0][0]*self.mat[1][2]], [self.mat[1][0]* self.mat[2][1] - self.mat[2][0]*self.mat[1][1], self.mat[0][1]* self.mat[2][0] - self.mat[2][1]*self.mat[0][0], self.mat[1][1]* self.mat[0][0] - self.mat[1][0]*self.mat[0][1]]]
                    matInv = self.matMultByConst(1/self.determinant(), matInv)
                    return(matInv)
                else:
                    print("No inverse, determinant is 0")
                    return None
'''
