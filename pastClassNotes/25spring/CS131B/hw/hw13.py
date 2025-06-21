import sys

class Book:
    def __init__(self, file_path):
        self.file_path = file_path
        self.text = self.read_book()

    def read_book(self):
        try:
            book_file = open(self.file_path, 'r')
            content = book_file.read()
            book_file.close()
            return content
        except:
            print("could not read the file!")
            return ""

    def count_words(self):
        words = self.text.split()
        return len(words)

    def find_word(self, word):
        lines = self.text.split('\n')
        found_lines = []
        line_number = 1
        for line in lines:
            if word.lower() in line.lower():
                found_lines.append(line_number)
            line_number += 1
        return found_lines

if __name__ == "__main__":
    book = Book(sys.argv[1])
    word_count = book.count_words()
    print("Number of words:", word_count)
    
    search_word = "universe"
    lines_with_word = book.find_word(search_word)
    print("Lines with '" + search_word + "':", lines_with_word)
    
