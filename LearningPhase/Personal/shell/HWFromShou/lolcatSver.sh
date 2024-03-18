#!/bin/bash

Black='\033[0;30m'        # Black
Red='\033[0;31m'          # Red
Green='\033[0;32m'        # Green
Yellow='\033[0;33m'       # Yellow
Blue='\033[0;34m'         # Blue
Purple='\033[0;35m'       # Purple
Cyan='\033[0;36m'         # Cyan
White='\033[0;37m'        # White

# black removed
colors=($Red $Green $Yellow $Blue $Purple $Cyan $White)

while IFS= read -r line; do
    for (( i=0; i<${#line}; i++ )); do
        char="${line:$i:1}"
        index=$(($RANDOM % ${#colors[@]}))
        echo -ne "${colors[$index]}$char\033[0m"
    done
    echo
done