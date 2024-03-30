'''
print(int("0xa", 0))



color_input = "#" + (str(input("input the hex of your color. #")[:6]))
print(color_input)












'''
color_num_lim = 5
color_num_wanted = int(input("How many color are there in the palette? "))

if color_num_wanted > color_num_lim:
    print("For the sake of computing power, only " + color_num_lim + " colors is allowed. ")
elif color_num_wanted <= color_num_lim:
    while color_num_wanted > 0:
        color_num_wanted = color_num_wanted - 1
        color_input = "#" + (str(input("input the hex of your color. #")[:6]))
        print(color_input)