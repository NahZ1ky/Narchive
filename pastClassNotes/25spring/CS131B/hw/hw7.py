import random

nineSided = random.randint(1, 9)
nineThouSided = random.randint(1, 9000)

sum = nineSided + nineThouSided

if (sum % 9 == 0):
    print("the sum of the value of two dices is both multiple of 3 and 9")
elif (sum % 3 == 0):
    print("the sum of the value of two dices is only the multiple of 3 but not 9")
else:
    print("the sum of the value of two dices is neither multiple of 3 or 9")
