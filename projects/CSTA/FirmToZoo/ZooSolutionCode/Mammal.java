//********************************************************************
//  Mammal.java       Author: Constance Conner & Ziky Zhang
//
//  Represents a general mammal.
//********************************************************************

public class Mammal extends Animal
{
    protected String name;
    protected double feedAmount;

    //-----------------------------------------------------------------
    //  Constructor: Sets up this mammal with the specified information.
    //-----------------------------------------------------------------
    public Mammal(int eTagID, String eSpecies, String eName, double feedLB)
    {
        super(eTagID, eSpecies);
        name = eName;
        feedAmount = feedLB;
    }

    //-----------------------------------------------------------------
    //  Returns information about this mammal as a string.
    //-----------------------------------------------------------------
    public String toString()
    {
        String result = super.toString();
        result += "\nName: " + name;

        return result;
    }

    //-----------------------------------------------------------------
    //  Returns the feed rate for this employee.
    //-----------------------------------------------------------------
    @Override
    public double feed()
    {
        return feedAmount;
    }

    @Override
    public int activityHours() {
        return STANDARD_ACTIVITY_HOURS;
    }
}