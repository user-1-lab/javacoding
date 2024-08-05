package day7;

public abstract class Shape {
	protected float area,area2;
	
	abstract void calback();
	
	void show()
	{
		System.out.println("Area of the Square is \n" + area);
	}
	void RS()
	{
		System.out.println("Area of the Rectangle is \n" + area2);
	}
	

}
