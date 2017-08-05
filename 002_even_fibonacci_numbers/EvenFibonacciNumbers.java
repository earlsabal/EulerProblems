public class EvenFibonacciNumbers {
	public int sumOfEvens(int max) {
		int previous = 1;
		int currentNum = 2;
		int nextNum = 2;
		
		int sum = 0;
		while (currentNum <= max) {
			if (nextNum % 2 == 0) { sum += nextNum; }
			nextNum = previous + currentNum;
			previous = currentNum;
			currentNum = nextNum;
		}
		return sum;
	}

	public static void main(String[] args) {

		long startTime = System.nanoTime();

		EvenFibonacciNumbers test = new EvenFibonacciNumbers();
		System.out.println(test.sumOfEvens(4000000));
		// Answer: 4613732

    long elapsedTime = System.nanoTime() - startTime;
    double seconds = (double)elapsedTime / 1000000000.0;
    System.out.println(seconds);
    // Time Elasped: 0.000761384
    
  }
}