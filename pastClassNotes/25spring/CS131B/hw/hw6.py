# setup
import sys
uniqueArgs = []

# find unique items and put the unique item into list of uniqueArgs
for check in sys.argv[1:]:
    if check not in uniqueArgs:
        uniqueArgs.append(check)

# sort the unique items 
for i in range(len(uniqueArgs)): 
    for j in range(len(uniqueArgs) - 1):
        if uniqueArgs[i] < uniqueArgs[j]:
            temp = uniqueArgs[j]
            uniqueArgs[j] = uniqueArgs[i]
            uniqueArgs[i] = temp

print(*uniqueArgs)
