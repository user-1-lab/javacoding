package day1;

import java.util.Scanner;

public class AdditionDemo {

	public static void main(String[] args) {
		int a,b,c;
		Scanner s = new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();
		s.nextLine();
		System.out.println("what is your traineer name ?");
		String name;
		name = s.nextLine();
		c = a+b;
		System.out.println("Addition of A + B is " +c);
		System.out.println("TNS traineer name is "+ name);

	}

}
