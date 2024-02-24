// Author: Xirong (Ziky) Zhang
// Date of Last Modification: 01/23/2024
// Course: CS-111B
// Instructor: C. Conner
// Assignment #1
// File Name: AnimalYears.java
//
// What does this program do:
// This program ask user for basic input for age, name and two animal names.
// Calculates the equivalence animal age and make an output stating the results.

import java.util.Scanner;

public class AnimalYears
{
    public static void main(String[] args) {
        String name;
        String dogName;
        String rabName;
        int age;
        int dogAge;
        int rabAge;
        Scanner scnr = new Scanner(System.in);


        // Get User Input for Basic variables
        System.out.println("Please enter your name: ");
        name = scnr.nextLine();

        System.out.println("Please enter your dog's name: ");
        dogName = scnr.nextLine();

        System.out.println("Please enter your rabbit's name");
        rabName = scnr.nextLine();

        System.out.println("Please enter your age: ");
        age = scnr.nextInt();

        // Get value for Level 2 variables
        dogAge = age * 7;
        rabAge = age * 10;

        // Print Final
        System.out.println(
            "Hello my name is " + name +  " and I am " + age + " years old.\n"
            + "That is " + dogAge + " in dog years and " + rabAge + " in rabbit years!!!\n"
            + "Neither " +  dogName + " nor " + rabName + " can count that high :)"
        );
    }
}
