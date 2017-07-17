public class LargestPalindromeProduct {

	public int largestPalindrome() {
		int min = 100;
		int max = 999;
		int largestPalindrome = 0;
		for (int first = min; first <= max; first++) {
			for (int second = min; second <= max; second++) {
				int product = first * second;
				if (isPalindrome(product) == true && product > largestPalindrome) {
					largestPalindrome = product;
				}
			}
		}
		return largestPalindrome;
	}

	public boolean isPalindrome(int num) {
		String number = Integer.toString(num);
		String reversed = new StringBuilder(number).reverse().toString();
		if (number.equals(reversed)) { return true; }
		return false;
	}

	public static void main(String[] args) {
		LargestPalindromeProduct test = new LargestPalindromeProduct();
		System.out.println(test.largestPalindrome());
  }
}