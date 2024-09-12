package cse;

public class Square extends Shape {
	public Square (Color color)
	{
		super(color);
	}
	void draw()
	{
        System.out.print("Square filled with color ");
        color.applyColor();
		
	}

}
