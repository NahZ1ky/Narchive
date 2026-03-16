def operation(current, line):
    direction = line[0]
    step = int(line[1:])
    if direction == 'L':
        current -= step
    else:
        current += step
    return current % 100

current = 50
count = 0
input = input("Which file to run? ")
with open(input, "r") as file:
    for line in file:
        current = operation(current, line)
        if current == 0:
            count += 1
print("the code is " + str(count))
