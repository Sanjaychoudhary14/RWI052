import java.util.*;  
class MyVectorExample
{  
public static void main(String args[])
{  
Vector<String> v=new Vector<String>();  
v.add("Sanjay");  
v.add("Anusha");  
v.add("Deepak");  
v.add("Rohit");  
Iterator<String> itr=v.iterator();  
while(itr.hasNext())
{  
System.out.println(itr.next());  
}  
}  
}  