package demojava;
import java.util.Scanner;

abstract class Shape{
	float area;
	
	abstract void acceptInput();
	abstract void calcArea();
	
	void dispArea() {
		System.out.println(area);
	}
}

class Square extends Shape{
	private float side;
	
	@Override
	void acceptInput() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the side: ");
		side=scan.nextFloat();
	}
	
	@Override
	void calcArea() {
		area=side*side;
	}
	
}

class Rectangle extends Shape{
	private float length;
	private float breadth;
	
	@Override
	void acceptInput() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length: ");
		length=scan.nextFloat();
		System.out.println("Enter the breadth: ");
		breadth=scan.nextFloat();
	}
	
	@Override
	void calcArea() {
		area=length*breadth;
	}
	
}

class Circle extends Shape{
	private float radius;
	
	@Override
	void acceptInput() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the radius: ");
		radius=scan.nextFloat();
	}
	
	@Override
	void calcArea() {
		area=(float)(3.142*radius*radius);
	}
	
}

class Geometry{
	void maths(Shape ref) {
		ref.acceptInput();
		ref.calcArea();
		ref.dispArea();
	}
}

public class OopsConcept {

	public static void main(String[] args) {
		
		Square s=new Square();
		
		Rectangle r=new Rectangle();
		
		Circle c=new Circle();
		
		Geometry g=new Geometry();
		g.maths(s);
		g.maths(r);
		g.maths(c);
		
		
		

	}

}
