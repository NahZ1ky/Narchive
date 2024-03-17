#! /bin/zsh

# Goal: colorize its input text with random colors.

# Initialize the colors
Black='\033[0;30m'        # Black
Red='\033[0;31m'          # Red
Green='\033[0;32m'        # Green
Yellow='\033[0;33m'       # Yellow
Blue='\033[0;34m'         # Blue
Purple='\033[0;35m'       # Purple
Cyan='\033[0;36m'         # Cyan
White='\033[0;37m'        # White

colors=($Black $Red $Green $Yellow $Blue $Purple $Cyan $White)
numColors=${#colors[@]}
# echo $numColors
echo "How many times do you want this program to run?"
read $runCount

for i in "$runCount"; do
    echo "Type something and I'll echo it"
    read lolInput
    index=$(($RANDOM % $numColors))
    echo -e ${colors[$index]}$lolInput
fi