import math

person_testing = 23
day_of_year_left = 365
list_out = []
list_raw = []

while person_testing > 1:
    upper = day_of_year_left - 1
    a = upper / day_of_year_left
    b = (person_testing * (person_testing - 1) / 2)
    fin_raw = 1 - (a ** b)
    fin_out = math.ceil((1 - (a ** b)) * 100)
    #print("When the amount of person is " + str(person_testing) + ", there is " + str(fin_out) + "%" + " of chance that at lease two of these people share the same birthday. The date left in a calendar of 365 days is " + str(upper))
    person_testing = person_testing - 2
    day_of_year_left = day_of_year_left - 1
    list_out.append(fin_out)
    list_raw.append(fin_raw)

print(list_out)
print(math.prod(list_raw))