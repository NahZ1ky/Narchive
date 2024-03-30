import turtle
t = turtle.Turtle
t.getscreen
t.speed(0)

t.setpos(0,0)
def snow():
    t.pendown()
    t.color("lightblue")
    for i in range(6):
        t.forward(75)
        t.right(60)
        t.forward(25)
        t.backward(25)
        t.left(120)
        t.forward(25)
        t.backward(25)
        t.right(60)
        t.backward(15)
        t.right(60)
        t.forward(15)
        t.backward(15)
        t.left(120)
        t.forward(15)
        t.backward(15)
        t.right(60)
        t.backward(60)
        t.right(60)

snow()
