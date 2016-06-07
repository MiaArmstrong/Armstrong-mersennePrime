import java.util.ArrayList;


/**
 * Prime numbers have long fascinated amateur and professional mathematicians. 
 * An integer greater than one is called a prime number if its only divisors are one and itself. 
 * The first prime numbers are 2, 3, 5, 7, 11, etc. For example, the number 10 is not prime because
 * it is divisible by 2 and 5. A Mersenne prime is a prime of the form 2^P-1. The first Mersenne 
 * primes are 3, 7, 31, 127 (corresponding to P = 2, 3, 5, 7). There are only 49 known Mersenne 
 * primes.
 * 
 * This program finds the first 9 Mersenne prime numbers.
 * 
 * @author Mia Armstrong 
 * @version 2016.05.30
 */
public class MersennePrime
{
    private ArrayList<Long> numMersennePrime;
    private ArrayList<Long> numPrime;

    /**
     * Create and populate MersennePrime
     */
    public MersennePrime()
    {
        numMersennePrime = new ArrayList<>();
        numPrime = new ArrayList<>();
        populateList();
    }
    
    /**
     * @return array list of Mersenne prime numbers
     */
    public ArrayList<Long> getMersennePrime()
    {
        return numMersennePrime;
    }
    
    /**
     * @return array list of prime numbers
     */
    public ArrayList<Long> getPrime()
    {
        return numPrime;
    }
    
    /**
     * Calculate each Mersenne prime number and add it to the array list
     * Mersenne prime numbers are added to the Mersenne prime numbers list and their
     * associated prime numbers are added to the prime numbers list.
     */
    private void populateList()
    {
     
        for (long n = 2; n <= 62; ++n)
        {
            if (isPrime(n) == true)
            {
                long mp = (long)Math.pow(2, n) -1;
                if (isPrime(mp) == true)
                {
                    numMersennePrime.add(mp);
                    numPrime.add(n);
                }
            }
        }
    }
    
    /**
     * Checks weather a long is prime or not
     * @param long
     * @return boolean
     */
    private boolean isPrime(long num)
    {
        //If the number is one or two it is prime and there is no need to check further
        if ((num == 1) || (num == 2))
        {
            return true;
        }
        //check if num is a multiple of 2, if so the number is not prime
        if (num % 2 == 0)
            return false;
        //if not just check the odd numbers(we only need to check up to the sqrt of the number)
        for (long i = 3; i*i <= num; i+=2)
        {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}