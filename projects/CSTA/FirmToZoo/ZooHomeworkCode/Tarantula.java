//********************************************************************
//  Tarantula.java   Author: Constance Conner & Ziky Zhang
//
//  Represents a tarantula that does not require feeding.
//********************************************************************

public class Tarantula extends Animal
{
    //-----------------------------------------------------------------
    //  Constructor: Sets up this tarantula using the specified information.
    //-----------------------------------------------------------------
    public Tarantula(int eTagID, String eSpecies)
    {
        super(eTagID, eSpecies);
    }

    //-----------------------------------------------------------------
    //  Returns a zero feed value for this tarantula.
    //-----------------------------------------------------------------
    public double feed()
    {
        return 0.0;
    }
}