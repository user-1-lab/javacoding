package day8;

public class OverloadingDemo {

	public static void main(String[] args) {
	System.out.println("--------------constructor overloading-----------");
	Point p = new Point();
	System.out.println(p);
	Point p1 = new Point();
	System.out.println(p1);
	Point p2 = new Point();
	System.out.println(p2);
	System.out.println("------------------Method overloading---------------");
	System.out.println("Addition of two integers : " + MethodOverloading.addition(50,20));
	System.out.println("Addition of two integers : " + MethodOverloading.addition(60.0f,80.0f));
	System.out.println("Addition of two integers : " + MethodOverloading.addition(60.0f,50));
	System.out.println("Addition of two integers : " + MethodOverloading.addition("Hello", "World"));


	}

}
