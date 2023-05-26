def is_armstrong_number(number):
    number_as_string = str(number)
    number_length = len(number_as_string)
    total = sum(int(number_as_string[index]) ** number_length for index in range(0, number_length))

    return total == number
