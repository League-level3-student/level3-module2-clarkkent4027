package _03_More_Algorithms;

import java.util.List;

/*
 * Write your methods in this class
 */
public class Algorithms {

	public static String multiply(int num1, int num2) {
int answer = num1*num2;
		return num1 + " x " + num2 + " = " + answer;
	}

	
	
	
	public static boolean isPrime(int num) {
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	
	
	
	public static boolean isSquare(int num) {
		for (int i = 0; i <= num; i++) {
			if (num == i * i) {
				return true;
			}
		}
		return false;
	}

	
	
	
	public static boolean isCube(int num) {
		for (int i = 0; i <= num; i++) {
			if (num == i * i * i) {
				return true;
			}
		}
		return false;
	}
	
	
	
	
	public static int findBrokenEgg(List<String> eggs) {
		return 0;
	}

}
