import java.util.Scanner;
/**
 * NauticalMilesInteractive[Brint Kyle P. De Leon].java
 */
class NauticalMilesInteractive
{
    public static void main(String[] args) 
    {
        double KiloMetersInNauticalMile = 1.852;
        double MilesInNauticalMile = 1.150779;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of nautical miles: ");
        double nauticalMiles = scanner.nextDouble();
        
        double kilometers = nauticalMiles * KiloMetersInNauticalMile;
        double miles = nauticalMiles * MilesInNauticalMile;
        
        System.out.println("Nautical miles: " + kilometers + " kilometers.");
        System.out.println("Nautical miles: " + miles + " miles.");
    }
}
