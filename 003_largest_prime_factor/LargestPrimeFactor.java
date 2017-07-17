import java.util.ArrayList;

public class LargestPrimeFactor {
	public int largestPrime(long num) {
		ArrayList<Integer> primesList = findAllPrimes(num);
		int largestPrime = primesList.get(primesList.size() - 1);
		return largestPrime;
	}

	public ArrayList<Integer> findAllPrimes(long max) {
		ArrayList<Integer> primes = new ArrayList<Integer>();
		for (int i = 2; i <= max; i++) {
			if (isPrime(i, primes) == true) {
				primes.add(i);
				max = reduceNum(i, max);
			}
		}
		return primes;
	}

	public boolean isPrime(int num, ArrayList<Integer> primes) {
		for (int prime : primes){
			if (num % prime == 0) { return false; }
    }
    return true;
	}

	public long reduceNum(int divisor, long num) {
		long newNum = num;
		while (newNum % divisor == 0) {
			newNum = newNum / divisor;
		}
		return newNum;
	}

	public static void main(String[] args) {
		LargestPrimeFactor test = new LargestPrimeFactor();
		System.out.println(test.largestPrime(600851475143L));
  }
}