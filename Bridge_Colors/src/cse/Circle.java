package cse;

public class Circle extends Shape{
	public Circle(RedColor redColor)
	{
		super(redColor);
		
	}
void draw ()
{
	System.out.print("Circle Filled with Color");
	color.applyColor();
	
}
}
