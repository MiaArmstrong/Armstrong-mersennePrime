import java.util.ArrayList;


/**
 * Display calculated data on Mersenne prime and prime numbers.** The process of creating the 
 * MersennePrimeDisplay object takes about 20 seconds. **
 * 
 * @author Mia Armstrong 
 * @version 2016.05.30
 */
public class MersennePrimeDisplay
{
    private ArrayList<Long> mersennePrime;
    private ArrayList<Long> prime;

    /**
     * Create an object to display data on Mersenne primes
     */
    public MersennePrimeDisplay()
    {
        mersennePrime = new MersennePrime().getMersennePrime();
        prime = new MersennePrime().getPrime();
    }

    /**
     * Display data on Mersenne prime and prime numbers
     */
    public void displayData()
    {
        System.out.println("-----------------Mersenne Prime Numbers---------------");
        System.out.println("Shows prime numbers and corresponding Mersenne Prime numbers");
        System.out.println("Prime  |  Mersenne Prime");
        for (int i = 0; i < prime.size(); ++i)
        {
                if ( i < 4)
                    System.out.println("    " + prime.get(i) + "  |  " + mersennePrime.get(i));
                else
                    System.out.println("   " + prime.get(i) + "  |  " + mersennePrime.get(i));
        }
        System.out.println("------------------------------------------------------");
    }
}
