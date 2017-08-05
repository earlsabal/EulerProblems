public class MultiplesThreeFive {
  public int sum(int belowNumber) {

    int sum = 0;
    for (int i = 1; i < belowNumber; i++) {
      if (i % 3 == 0 || i % 5 == 0) {sum += i;}
    }
    return sum;

  }

  public static void main(String[] args) {

    long startTime = System.nanoTime();

    MultiplesThreeFive test = new MultiplesThreeFive();
    int results = test.sum(1000);
    System.out.println("results");
    System.out.println(results);
    // Answer: 233168
    
    long elapsedTime = System.nanoTime() - startTime;
    double seconds = (double)elapsedTime / 1000000000.0;
    System.out.println(seconds);
    // Time Elasped: 0.001910248

  }
}