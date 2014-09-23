class Point(object):
    """Point class represents and manipulates x, y coords"""
    
    def __init__(self, x=0, y=0):
        """Initialize a point"""
 
        self.x = float(x)
        self.y = float(y)
    
    def eq(self, other):
        return (self.x is other.x and self.y is other.y)
    
    
    def distanceFromOrigin(self): 
        """compute distance from origin"""
        return ((self.x**2 + self.y**2)**0.5)
    
    def printPoint(self):
        print ("(", self.x, ", ", self.y, ") ", sep = "", end = "")
    