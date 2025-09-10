//********************************************************************
//  AnimalResidents.java       Author: Constance Conner & Ziky Zhang
//
//  Represents the personnel AnimalResidents of a particular business.
//********************************************************************

public class AnimalResidents
{
    private Animal[] animalList;

    //-----------------------------------------------------------------
    //  Constructor: Sets up the list of AnimalResidents members.
    //-----------------------------------------------------------------
    public AnimalResidents()
    {
        animalList = new Animal[6];

        animalList[0] = new Tiger(385937, "Bengal Tiger", "Kitten", 12.5, 1);
        animalList[1] = new Mammal(563875, "Bawean Deer", "Bambi", 6.8);
        animalList[2] = new Mammal(783620, "Plains Zebra", "Clark", 9.7);
        animalList[3] = new Panda(982398, "Giant Panda", "Yuan-yuan", 78.4);
        animalList[4] = new Tarantula(243859, "Greenbottle Blue Tarantula");
        animalList[5] = new Tarantula(243843, "Pink Zebra Beauty");

        ((Tiger)animalList[0]).awardTreat(5.8);
        ((Panda)animalList[3]).addBamboo(10);
    }

    //-----------------------------------------------------------------
    //  Pays all AnimalResidents members.
    //-----------------------------------------------------------------
    public void feedReport()
    {
        double amount;
        int activity;

        for (int count = 0; count < animalList.length; count++)
        {
            System.out.println(animalList[count]);
            amount = animalList[count].feed();
            activity = animalList[count].activityHours();

            if (amount == 0.0)
                System.out.println("It's a Tarantula!");
            else
                System.out.println("Feed: " + amount);
            System.out.println("Activity hours: " + activity);
            System.out.println("-----------------------------------");
        }
    }

    public void sort() {
        Sorting<Animal> sorts = new Sorting<Animal>();
        sorts.selectionSort(animalList);
    }

}