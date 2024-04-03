// Abstract class
abstract class Shape
 {
    // Abstract method (does not have a body)
    public abstract void draw();
}

// Rectangle class extending Shape
class Rectangle extends Shape
 {
    // Implementation of the abstract method
    public void draw()
	{
        System.out.println("Drawing a Rectangle");
    }
}

// Circle class extending Shape
class Circle extends Shape
 {
    // Implementation of the abstract method
    public void draw()
	{
        System.out.println("Drawing a Circle");
    }
}

public class Abstraction
 {
    public static void main(String[] args)
	{
        // Creating objects of concrete classes
        
		Shape shape1 = new Rectangle();
        Shape shape2 = new Circle();

        // Calling the draw method on both objects
        
		shape1.draw();
        shape2.draw();
    }
}
