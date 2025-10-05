def is_armstrong_number(number):
    length = len(str(number))
    result = 0
    for i in str(number):
        result += int(i)**length
    return result==number