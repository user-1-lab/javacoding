package day7;

public class AbstractDemo {

	public static void main(String[] args)
	{
		Square sq = new Square();
		Rectangle rl = new Rectangle();
		sq.calback();
		sq.show();
		rl.calback();
		rl.show();
		
		System.out.println("------------------------------------------------------------");
		Shape shape;
		
		shape = new Square(12.5f);
		shape.calback();
		shape.show();
		
		shape = new Rectangle(10,20);
		shape.calback();
		shape.RS();
	}
}
