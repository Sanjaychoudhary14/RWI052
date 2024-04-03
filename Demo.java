class Outerclass
{
	int s=10;
	
	Outerclass()
	{
		System.out.println("Constructor ");	
	}
	
	static
	{
		System.out.println("static block");
	}
	
	public void OuterMethod()
	{
		System.out.println("OuterMethod");
	}
}

class Demo
{
	public static void main(String []args)
	{
	Outerclass oc=new Outerclass();
	oc.OuterMethod();
	
	}
}