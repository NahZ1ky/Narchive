//********************************************************************
//  Zoo.java   Author: Constance Conner & Ziky Zhang
//
//  Demonstrates polymorphism via inheritance.
//********************************************************************

public class Zoo
{
    //-----------------------------------------------------------------
    //  Creates animals and generates a feeding report.
    //-----------------------------------------------------------------
    public static void main(String[] args)
    {
        AnimalResidents animals = new AnimalResidents();
        animals.feedReport();
    }
}