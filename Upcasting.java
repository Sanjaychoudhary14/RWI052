
// UpCasting and DownCasting

// Superclass
class A
{
	void example1()
	{
		System.out.println("class A method");
	}
}
 // // Subclass
 
class B extends A
{
	// Overriding the example method
	void example()
	{
		System.out.println("class B method");
	}
}

class Upcasting
{
public static void main(String [] args)
{
	A a=new B(); // upcasting
	
	B b=(B)a;  // downcasting
	
	b.example1();
	b.example();
	
	
	
	
	
}
}