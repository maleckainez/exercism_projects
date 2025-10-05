def steps(n):
    if n < 1:
        raise ValueError("Only positive integers are allowed")
    if n == 1:
        return 0
    next_num = n//2 if n&1==0 else 3*n+1
    return 1 + steps(next_num)