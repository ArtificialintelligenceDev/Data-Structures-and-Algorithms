
public class PalindromicPrime {
	private static boolean isPrime(int num) {
		for (int i = 2; i <= (int)(Math.sqrt(num)); i++)
			if (num % i == 0)
				return false;
		return true;
	}
	
	private static int reverseInt(int num) {
		int revInt = 0;
		int sign = 1;
		if (num < 0) {
			sign = -1;
			num = -num;
		}
		while (num > 0) {
			int lastDigit = num % 10;
			revInt = 10 * revInt + lastDigit;
			num /= 10;
		}
		return sign * revInt;
	}
	
	private static boolean isPalindromic(int num) {
		return num == reverseInt(num);
	}

	public static void main(String[] args) {
		int count = 0;
		int num = 2;
		while (count < 100) {
			if (isPrime(num) && isPalindromic(num)) {
				System.out.printf("%7d ", num);
				count++;
				if (count % 10 == 0)
					System.out.println();
			}
			num++;
		}
	}
}
