/**
 * NauticalMiles[Brint Kyle P. De Leon].java
 */
class NauticalMiles 
{
    
    public static void main(String[] args) 
    {
        double KiloMetersInNauticalMile = 1.852;
        double MilesInNauticalMile = 1.150779;
        
        double nauticalMiles = 10.0;
        
        double kilometers = nauticalMiles * KiloMetersInNauticalMile;
        double miles = nauticalMiles * MilesInNauticalMile;
        
        System.out.println("Nautical miles: " + kilometers + " kilometers.\n");
        System.out.println("Nautical miles: " + miles + " miles.");
    }
}
