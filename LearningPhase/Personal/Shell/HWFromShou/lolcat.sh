#! /bin/zsh

# Goal: colorize its input text with random colors.
echo "How many times do you want this program to run?"
read runCount

for i in "runCount"; do
    echo "Type something and I'll echo it"
    read lolInput
    