public class MultiplesThreeFive {
  public int sum(int belowNumber) {
    int sum = 0;
    for (int i = 1; i < belowNumber; i++) {
      if (i % 3 == 0 || i % 5 == 0) {sum += i;}
    }
    return sum;
  }

  public static void main(String[] args) {
    MultiplesThreeFive test = new MultiplesThreeFive();
    int results = test.sum(1000);
    System.out.println("results");
    System.out.println(results);
  }
}