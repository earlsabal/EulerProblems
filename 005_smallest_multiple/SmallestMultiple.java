public class SmallestMultiple {

	public int smallestMultiple(int highestDivisor) {
		int currentNumber = highestDivisor;
		while (isMultiple(currentNumber, highestDivisor) != true) {
			currentNumber++;
		}
		return currentNumber;
	}

	public boolean isMultiple(int number,int max) {
		for (int i = max; i > 0; i--) {
			if (number % i != 0) { return false; }
		}
		return true;
	}

	public static void main(String[] args) {
		SmallestMultiple test = new SmallestMultiple();
		System.out.println(test.smallestMultiple(20));
  }
}