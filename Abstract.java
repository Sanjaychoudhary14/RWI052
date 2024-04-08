abstract class Vehicle
{
    abstract void bike();
    abstract void car();

}
class Motor extends Vehicle
{
    public void bike()
    {
        System.out.println("Honda");
        System.out.println("TVS");
        System.out.println("Yamaha");
        System.out.println("Hero");
    }
    public void car()
    {
        System.out.println("Maruti Suzki");
        System.out.println("Hundai");
        System.out.println("Kia");
        System.out.println("Mahindra");
    }
    public static void main(String[] args) 
    {
      Vehicle v=new Motor(); 
        v.bike();
        v.car();
   
    }
}