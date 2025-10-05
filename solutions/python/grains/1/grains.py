def square(n):
    if n<=0 or n>64:
        raise ValueError("square must be between 1 and 64")
    return 2**(n-1)


def total():
    result = 0;
    for x in range(1,65):
        result += square(x)
    return result
