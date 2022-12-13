package HomeworksChapter5;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PrimeNumber primeNumber = new PrimeNumber();
		System.out.println("Please enter a integer number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
//		System.out.println(primeNumber.isPrime(n));
//		primeNumber.isPrimeVoid(n);		
		primeNumber.countNumberOfPrimesUpTo(n);
		
	}
	
	boolean isPrime(int n) {
		boolean prime = true;
		int i = 2;
		int upperBound = (int) (Math.sqrt(n) + 1);
		for(; i < upperBound ; i++) {
			if(n % i == 0) {
				prime = false;
				break;
			}
			
		}
//		if(!prime)
//			System.out.println("First break: " + i);
//		else
//			System.out.println(n + " is prime");
			
		
		return prime;
	}
	
//	void isPrimeVoid(int n) {
//		boolean prime = true;
//		int i = 2;
//		int upperBound = (int) (Math.sqrt(n) + 1);
//		for(; i < upperBound - 1; i++) {
//			if(n % i == 0) {
//				prime = false;
//				break;
//			}
//			
//		}
//		if(prime)
//			System.out.println(n + " is prime");
//		else
//			System.out.println("First break: " + i);
//	}
	
	void countNumberOfPrimesUpTo(int n) {
		int numberOfPrimes = 0;
		for(int i = 2; i < n; i++) {
			boolean prime = isPrime(i);
			if(prime)
				numberOfPrimes++;
		}
		System.out.println("There are " + numberOfPrimes + " prime number until " + n);
	}

}
