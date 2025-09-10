//********************************************************************
//  Tiger.java   Author: Constance Conner & Ziky Zhang
//
//  Represents a tiger that can receive a bonus treat.
//********************************************************************

public class Tiger extends Mammal
{
    private double bonusTreat;

    //-----------------------------------------------------------------
    //  Constructor: Sets up this tiger with the specified information.
    //-----------------------------------------------------------------
    public Tiger(int eTagID, String eSpecies, String eName, double feedLB)
    {
        super(eTagID, eSpecies, eName, feedLB);
        bonusTreat = 0;
    }

    //-----------------------------------------------------------------
    //  Awards a bonus treat to this tiger.
    //-----------------------------------------------------------------
    public void awardTreat(double tigerTreat)
    {
        bonusTreat = tigerTreat;
    }

    //-----------------------------------------------------------------
    //  Computes and returns the total feed amount for this tiger.
    //-----------------------------------------------------------------
    public double feed()
    {
        double totalFeed = super.feed() + bonusTreat;
        bonusTreat = 0;
        return totalFeed;
    }
}