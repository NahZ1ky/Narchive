//********************************************************************
//  Panda.java       Author: Constance Conner & Ziky Zhang
//
//  Represents a panda that consumes bamboo in addition to regular feed.
//********************************************************************

public class Panda extends Mammal
{
    private int bamboo;

    //-----------------------------------------------------------------
    //  Constructor: Sets up this panda using the specified information.
    //-----------------------------------------------------------------
    public Panda(int eTagID, String eSpecies, String eName, double feedLB)
    {
        super(eTagID, eSpecies, eName, feedLB);
        bamboo = 0;
    }

    //-----------------------------------------------------------------
    //  Adds bamboo to the panda's consumption.
    //-----------------------------------------------------------------
    public void addBamboo(int moreBamboo)
    {
        bamboo += moreBamboo;
    }

    //-----------------------------------------------------------------
    //  Computes and returns the feed for this hourly employee.
    //-----------------------------------------------------------------
    @Override
    public double feed()
    {
        double totalFeed = feedAmount + bamboo;
        bamboo = 0;
        return totalFeed;
    }

    //-----------------------------------------------------------------
    //  Returns information about this hourly employee as a string.
    //-----------------------------------------------------------------
    @Override
    public String toString()
    {
        String result = super.toString();
        result += "\nBamboo fed: " + bamboo;

        return result;
    }

    @Override
    public int activityHours() {
        return STANDARD_ACTIVITY_HOURS - 2;
    }
}