import random

print("this program will roll a D-9 and a D-9000a and get the sum of both; calculate if that number is divisible by 6 to complete a run")
print("and you dictate how many time you want it to run, so shoot your number(input any integer): ")
assignment = int(input())

sixDivisibleCount = 0
# print("assignment: " + str(assignment))    #debugger
for i in range(assignment):
    nineSided = random.randint(1, 9)
    nineThouSided = random.randint(1, 9000)
    sum = nineSided + nineThouSided

    if (sum % 6 == 0):
        sixDivisibleCount+=1
# print("sixDivisibleCount: " + str(sixDivisibleCount)    # debugger
sixDivisiblePercentage = sixDivisibleCount / assignment
SDString = "%3.2f" %(sixDivisiblePercentage)


print("the percentage of the sum of D-9 and D-9000 is divisible by 6 is " + str(SDString) + " after " + str(assignment) + " runs")


