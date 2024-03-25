# math.operator

## addition
meowTime = 0
addMeowTime = meowTime + 2            # -> 0 + 2
addMeowTime += 1                      # -> 2 + 1

for i in range (addMeowTime):
    print("meow")

## subtraction
meowTime = 10
minusMeowTime = meowTime - 3          # -> 10 - 3
minusMeowTime -= 4                    # -> 7 - 4

for i in range (minusMeowTime):
    print("meow")

## multiplication
meowTime = 1
multiMeowTime = meowTime * 3          # -> 1 * 3
multiMeowTime *= 1                    # -> 3 * 1

for i in range (multiMeowTime):
    print("meow")

## division
meowTime = 14
divMeowTime = meowTime / 2            # -> 14 / 2
divMeowTime /= 2                      # -> 7 / 2
for i in range(int(divMeowTime)):
    print("meow")

## modulus
meowTime = 48
modMeowTime = meowTime % 10          # -> 48 % 10
modMeowTime %= 5                     # -> 8 % 5

for i in range(modMeowTime):
    print("meow")

## exponentiation
meowTime = 2
expMeowTime = meowTime ** 1          # -> 2 ** 1
expMeowTime **= 2                    # -> 2 ** 2

for i in range(expMeowTime):
    print("meow")

## floor division | round to the nearest whole number
meowTime = 31
floorMeowTime = meowTime // 3        # -> 31 // 3
floorMeowTime //= 3                   # -> 10 // 3

for i in range(floorMeowTime):
    print("meow")
