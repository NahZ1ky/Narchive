import sys

reversedCLA = sys.argv[1:]    # copy all elements from the comment line argument into a new list, exclude filename
reversedCLA.reverse()         # reverse new list order

print(*reversedCLA)           # print list
