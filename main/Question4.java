package in.ineuron.main;

class Circle implements IDrawable{
	public void draw() {
		System.out.println("Circle Drawn");

	}
	
}
class Rectangle implements IDrawable{
	public void draw() {
		System.out.println("Rectangle Drawn");

	}
	
}

public class Question4{
	public static void main(String args[]) {
		Circle c=new Circle();
		Rectangle r=new Rectangle();
		
		c.draw();
		r.draw();
		
	}

}
