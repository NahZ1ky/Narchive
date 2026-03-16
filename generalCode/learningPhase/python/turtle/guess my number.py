import random

start_saying = ("lez play a guessing game! ", "wanna play a game?", "lez do something fun", "bet  you can't guess my number")
high_saying = ("choose something higher than ", "go higher than ", "my number is higher than ", "nah, mine is higher than ")
low_saying = ("choose something lower than ", "go lower than ", "my number is lower than ", "nah, mine is lower than ")
win_saying = ("well done! ", "you are correct!", "damn you're smart.", "yeaaaah, you got it!")
print(random.choice(start_saying))
rannum = random.randint(1,100)
max_allow = int(input("How many times do you want to try to guess? "))
guesstime = 0
guessnum = int(input("now guess! "))



while guessnum != rannum and guesstime < max_allow:
    if guessnum > rannum:
        guesstime = guesstime + 1
        print(random.choice(high_saying) + str(guessnum))
        guessnum = int(input("Guess the number again "))

    elif guessnum < rannum:
        guesstime = guesstime + 1
        print(random.choice(low_saying) + str(guessnum))
        guessnum = int(input("Guess the number again "))

if guesstime > max_allow:
    print("Guess too many times")



if guessnum == rannum:
    print(random.choice(win_saying))

    if guesstime > 8:
        print("You are so dumb, but you finish, whateves")
        print(str(guesstime) + " times, not bad")

    elif guesstime <= 8:
        print("Job well done.")
        print(str(guesstime) + " times, not bad")