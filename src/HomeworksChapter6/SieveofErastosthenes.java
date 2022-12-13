package HomeworksChapter6;

import java.util.Arrays;
import java.util.Scanner;

public class SieveofErastosthenes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SieveofErastosthenes soe = new SieveofErastosthenes();
		System.out.println("Please enter a positive integer:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		soe.countNumberOfPrimesUpTo(n);
		
	}
	
	void countNumberOfPrimesUpTo(int n) {
		boolean[] list = new boolean[n + 1];
		Arrays.fill(list, true);
		list[0] = false;
		list[1] = false;
		
		for(int i = 2; i <= n; i++) {
			if(list[i] == true)
				for(int j = 2; i * j <= n; j++)
					list[i * j] = false;
		}
		
		int numberOfPrimes = 0;
		for(boolean b : list) {
			if(b)
				numberOfPrimes++;
		}
		System.out.println("There are " + numberOfPrimes + " prime number until " + n);

			
	}

}
