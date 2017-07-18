import java.lang.*;

public class SpecialPythagoreanTriplet {

  public int product() {
    int product = 1;
    int[] numbers = findTriplet();
    for ( int number : numbers ) { product *= number; }
    return product;
  }

  public int[] findTriplet() {
    int specialValue = 1000;
    int a = 0;
    int b = 0;
    int c = 0;
    while ( a + b + c != specialValue || c == 0 ) {
      a++;
      b = a;
      c = 0;
      while ( a + b + c < specialValue || c == 0 ) {
        b++;
        Double d = Math.sqrt( ( a * a ) + ( b * b ) );
        if ( d / d.intValue() == 1) { c = d.intValue(); }
        else { c = 0; }
      }
    }
    int[] triplet = {a, b, c};
    return triplet;
  }

  public static void main( String[] args ) {
    SpecialPythagoreanTriplet test = new SpecialPythagoreanTriplet();
    System.out.println( test.product() );
  }
  
}