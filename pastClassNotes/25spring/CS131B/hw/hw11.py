# 12. Write a program that shows ten unique random words, all over ten characters long, that occur in the text whose pathname is passed as argument.
# Test with /users/abrick/resources/urantia.txt

import sys
import random
import re

filePath = sys.argv[1]

def find_unique_words(file_path): 
    try:
        with open(file_path) as f:
            text = f.read().lower()

        words = re.findall(r'\b\w{11,}\b', text) # find unique words with at least length of 10 chars
        return list(set(words))
    
    except FileNotFoundError:
        print("Error: File not found. Please check the file path.")
    except Exception as e:
        print(f"An error occurred: {e}")


def get_long_words_from_file(path):
    selected_words = random.sample(find_unique_words(filePath), 10) # randomly choose 10 words from list

    print("Ten random long words:")
    for word in selected_words:
        print(word)

get_long_words_from_file(filePath)
