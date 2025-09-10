//********************************************************************
//  Animal.java       Author: Constance Conner & Ziky Zhang
//
//  Represents a generic AnimalResidents member.
//********************************************************************

abstract public class Animal implements Feedable, ActivityTime, Comparable<Animal>
{
    protected int tagID;
    protected String species;

    //-----------------------------------------------------------------
    //  Constructor: Sets up this animal using the specified information.
    //-----------------------------------------------------------------
    public Animal(int eTagID, String eSpecies)
    {
        tagID = eTagID;
        species = eSpecies;
    }

    //-----------------------------------------------------------------
    //  Returns a string including the basic animal information.
    //-----------------------------------------------------------------
    public String toString()
    {
        String result = "TagID: " + tagID + "\n";
        result += "Species: " + species;

        return result;
    }

    //-----------------------------------------------------------------
    //  Derived classes must define the feed method for each type of animal.
    //-----------------------------------------------------------------

    public abstract double feed();

    public String getSpecies() {
        return species;
    }

    //-----------------------------------------------------------------
    //  Derived classes must define the feed method for each type of
    //  employee.
    //-----------------------------------------------------------------
    @Override
    public int compareTo(Animal other) {
        return this.getSpecies().compareTo(other.getSpecies());
    }
}