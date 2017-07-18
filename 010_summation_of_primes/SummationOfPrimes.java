import java.util.ArrayList;
import java.lang.*;

public class SummationOfPrimes {

  public long sum( long maxNumber ) {
    long sum = 0;
    ArrayList<Integer> allPrimes = findAllPrimes(maxNumber);
    for ( int prime : allPrimes ) { sum += prime; }
    return sum;
  }

  public ArrayList<Integer> findAllPrimes(long maxNumber) {
    ArrayList<Integer> primes = new ArrayList<Integer>();
    for ( int i = 2; i < maxNumber; i++ ) {
      if ( isPrime( i, primes ) == true ) { primes.add( i ); }
    }
    return primes;
  }

  public boolean isPrime( int num, ArrayList<Integer> primes ) {
    for ( int prime : primes ) {
      if ( num % prime == 0 ) { return false; }
      if ( prime > Math.sqrt( num ) ) { return true; }
    }
    return true;
  }

  public static void main( String[] args ) {
    SummationOfPrimes test = new SummationOfPrimes();
    System.out.println( test.sum(2000000L) );
  }
  
}