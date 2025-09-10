//********************************************************************
//  AnimalResidents.java   Author: Constance Conner & Ziky Zhang
//
//  Represents the animal residents of a zoo.
//********************************************************************
public class AnimalResidents
{
    private Animal[] animalList;

    //-----------------------------------------------------------------
    //  Constructor: Sets up the list of animals.
    //-----------------------------------------------------------------
    public AnimalResidents()
    {
        animalList = new Animal[6];

        animalList[0] = new Tiger(385937, "Bengal Tiger", "Kitten", 12.5);
        animalList[1] = new Mammal(563875, "Bawean Deer", "Bambi", 6.8);
        animalList[2] = new Mammal(783620, "Plains Zebra", "Clark", 9.7);
        animalList[3] = new Panda(982398, "Giant Panda", "Yuan-yuan", 78.4);
        animalList[4] = new Tarantula(243859, "Greenbottle Blue Tarantula");
        animalList[5] = new Tarantula(243843, "Pink Zebra Beauty");

        ((Tiger)animalList[0]).awardTreat(5.8);
        ((Panda)animalList[3]).addBamboo(10);
    }

    //-----------------------------------------------------------------
    //  Generates a feeding report for all animals.
    //-----------------------------------------------------------------
    public void feedReport()
    {
        double amount;

        for (int count = 0; count < animalList.length; count++)
        {
            System.out.println(animalList[count]);
            amount = animalList[count].feed();  // polymorphic call

            if (amount == 0.0)
                System.out.println("It's a Tarantula!");
            else
                System.out.println("Feed: " + amount);

            System.out.println("-----------------------------------");
        }
    }
}