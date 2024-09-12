package cse;

public class BridgePatternSimpleDemo {

	public static void main(String[] args) {
		Shape redCircle = new Circle(new RedColor());
		Shape greenSquare = new Square(new GreenColor());
		redCircle.draw();
		greenSquare.draw();
	}

}
