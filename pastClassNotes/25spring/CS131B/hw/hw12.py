import sys
import re

def findGreatestInteger(filePath):
    try:
        with open(filePath, 'r') as file:
            text = file.read()
            numbers = list(map(int, re.findall(r'-?\d+', text)))
            
            if not numbers:
                return 1

            maxNumber = max(numbers)
            print(f"the greatest integer in the file is: {maxNumber}")

    except FileNotFoundError:
        print("file not found")
        return 2
    except Exception as e:
        print(f"an error occurred: {e}")
        return 3

findGreatestInteger(sys.argv[1])
