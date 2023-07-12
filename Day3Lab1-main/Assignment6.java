package assignment;

import java.util.Scanner;

public class UserInput {
	public static void main(String[] args) {
		int number, iterations;
		number = Integer.parseInt(args[0]);
		iterations = Integer.parseInt(args[1]);
		int[] data = new int[iterations];
		for (int i = 0; i < iterations; i++) {
			data[i] = (i+1) * number;
			System.out.print(data[i] + " ");
		}
		
		
	}
}
