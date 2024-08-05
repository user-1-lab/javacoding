package day7;

public class Square extends Shape{
	private float side;
	
	public Square()
	{
		side = 2.0f;
	}
	public Square(float side)
	{
		this.side = side;
	}
	
	void calback()
	{
	 area = side * side;
	}

}
