def average(num1, num2):
    temp = num1 + num2
    avg = temp / 2
    return avg

# https://lacounty.gov/government/board-of-supervisors/
lacs = 5
# https://sfbos.org/
sfcs = 11

print('the number of county supervisers in Los Angeles is %d' % lacs)
print('the number of county supervisers in San Francisco is %d' % sfcs)
print('the average of the two county\'s supervisor is %d' % average(lacs, sfcs))
