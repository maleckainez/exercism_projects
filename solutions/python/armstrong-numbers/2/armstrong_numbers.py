def is_armstrong_number(number):
    n = number
    length = len(str(number))
    result = 0
    while n > 0:
        n, digit = divmod(n, 10)
        result += digit**length
    return result==number