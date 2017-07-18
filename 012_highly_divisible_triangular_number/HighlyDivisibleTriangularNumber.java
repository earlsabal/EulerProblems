import java.util.ArrayList;
import java.lang.*;

public class HighlyDivisibleTriangularNumber {
	public int triangleNumber( int limit ) {
		int currentNumber = 0;
		boolean foundNumber = false;
		int triangleNumber = 0;
		while ( foundNumber != true ) {
			currentNumber++;
			triangleNumber += currentNumber;
			if ( numberOfDivisors( triangleNumber ) > limit ) { foundNumber = true; }
		}
		return triangleNumber;
	}

	public int numberOfDivisors( int number ) {
		ArrayList<Integer> divisors = new ArrayList<Integer>();
		for ( int i = 1; i <= Math.sqrt(number); i++ ) {
			if ( number % i == 0 ) {
				divisors.add( i );
				if ( number / i != i ) { divisors.add( number / i ); }
			}
		}
		return divisors.size();
	}

  public static void main( String[] args ) {
    HighlyDivisibleTriangularNumber test = new HighlyDivisibleTriangularNumber();
    System.out.println( test.triangleNumber(500) );
  }
  
}