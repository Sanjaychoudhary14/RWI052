interface A
{
	void A();
	void B();
	void C();
}
class B implements A
{
	public void A()
	{
		System.out.println("I am A Method");
	}
	
	public void B()
	{
		System.out.println("I am B Method");
	}
	
	public void C()
	{
		System.out.println("I am C Method");
	}	
}
class Interfa 
{
	public static void main(String args[])
	{
		A a=new B();
		a.A();
		a.B();
		a.C();
	}
}