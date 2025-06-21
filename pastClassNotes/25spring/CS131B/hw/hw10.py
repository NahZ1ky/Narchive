# 11. Write a program that estimates the number of unique words in the text whose pathname is passed as argument.
# Test with /users/abrick/resources/urantia.txt

import sys

filePath = sys.argv[1]



def count_unique_words(file_path):
    try:
        with open(file_path) as f:
            text = f.read()

        words = text.lower().split()

        unique_words = set(words)
        print(f"Estimated number of unique words: {len(unique_words)}")
    
    except FileNotFoundError:
        print("Error: File not found. Please check the file path.")
    except Exception as e:
        print(f"An error occurred: {e}")

# Example usage
file_path = sys.argv[1]
count_unique_words(file_path)

