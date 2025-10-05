def equilateral(sides):
    a, b, c = sorted(sides)
    if a*b*c<=0:
        return False
        #raise ValueError("Only positive integers are allowed")
    return a==b==c
    
def isosceles(sides):
    a, b, c = sorted(sides)
    if a*b*c<=0:
        return False
        #raise ValueError("Only positive integers are allowed")
    if a+b<=c:
        return False
    return a==b or a==c or b==c

def scalene(sides):
    a, b, c = sorted(sides)
    if a*b*c<=0:
        return False
        #raise ValueError("Only positive integers are allowed")
    if a+b<=c:
        return False
    return a!=b!=c
