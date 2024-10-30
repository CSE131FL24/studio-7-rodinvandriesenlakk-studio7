package studio7;

public class Rectangle {
	private double width;
	private double length;

	public Rectangle(double width, double length) {
		this.width = width;
		this.length = length;

	}
	public double Area() {
		return this.width*this.length;

	}
	public double Perimeter() {
		return 2*this.width + 2*this.length;
	}
	public boolean Square() {
		return this.width == this.length;
	}

	public boolean isSmaller(Rectangle r2) {
		return this.Area() < r2.Area();
	}

	public static void main(String[] args) {
		double width1 = 4.0;
		double length1 = 7.5;
		Rectangle r1 = new Rectangle(width1, length1);
		System.out.println(r1.Area());
		System.out.println(r1.Perimeter());
		System.out.println("is this a square? " + r1.Square());
		
		double width2 = 5.0;
		double length2 = 5.0;
		Rectangle r2 = new Rectangle(width2, length2);
		System.out.println(r2.Area());
		System.out.println(r2.Perimeter());
		System.out.println("is this a square? " + r2.Square());
		
		
		System.out.println("is this rectangle smaller that this first? " + r1.isSmaller(r2));
		
	}

}

