import java.util.ArrayList;

public class NthPrime {
  public int findPrime( int number ) {
    ArrayList<Integer> primes = new ArrayList<Integer>();
    int targetIndex = number - 1;
    int currentNumber = 2;
    while ( primes.size() < number ) {
      if ( isPrime( currentNumber, primes ) == true ) { primes.add( currentNumber ); }
      currentNumber++;
    }
    int nthPrime = primes.get( targetIndex );
    return nthPrime;
  }

  public boolean isPrime( int num, ArrayList<Integer> primes ) {
    for ( int prime : primes ) {
      if ( num % prime == 0 ) { return false; }
      if ( prime > ( num / 2 ) ) { return true; }
    }
    return true;
  }

  public static void main( String[] args ) {
    NthPrime test = new NthPrime();
    System.out.println( test.findPrime( 10001 ) );
  }
}