package assignment;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter user name");
		String userName = s.nextLine();
		System.out.println("Length: " + userName.length());
		System.out.println("Hi " + userName);
		System.out.println("lower case: " + userName.toLowerCase());
		s.close();
	}
}
