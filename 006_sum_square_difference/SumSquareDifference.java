public class SumSquareDifference {

	public int difference(int highNumber) {
		int difference = squareOfSum(highNumber) - sumOfSquares(highNumber);
		return difference;
	}

	public int sumOfSquares(int highNumber) {
		int sum = 0;
		for (int i = 1; i <= highNumber; i++) { sum += i * i; }
		return sum;
	}

	public int squareOfSum(int highNumber) {
		int sum = 0;
		for (int i = 1; i <= highNumber; i++) {	sum += i; }
		int square = sum * sum;
		return square;
	}

	public static void main(String[] args) {
		SumSquareDifference test = new SumSquareDifference();
		System.out.println(test.difference(100));
  }
}