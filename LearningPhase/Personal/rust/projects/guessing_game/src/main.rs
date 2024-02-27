use std::io;
use rand::Rng;

fn main() {
    println!("Guess the number!");
    println!("Please input your guess.");

// creating a mutable variable:
    let mut guess = String::new();

    io::stdin()                    // use 'stdin()' function in the 'io' library
	.read_line(&mut guess)     // read input from 'mut guess', '&' indicates that this argument is a reference
	.expect("Failed to read line");

    println!("You guessed: {guess}");
}
