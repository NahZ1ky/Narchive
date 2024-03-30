# general.variable.style and validity

## naming styles
lovelyKittyCat = "Camel case"
LovelyKittyCat = "Pascal case"
lovely_kitty_cat = "Snake case"


## validity
### valid
kittycat = True
kittyCat = True
kitty_cat = True
_kitty_cat = True
KITTYCAT = True
K1TTYC4T = True

### invalid
'''
kitty cat = False
2kittycat = False
kitty-cat = False
lovely-kitty-cat = "Kebab style"
'''
