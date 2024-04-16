import java.util.*;
class ArrayaList
{
    public static void main(String[] args) 
    {
        ArrayList<String> li=new ArrayList<String>();
        li.add("sanjay");
        li.add("Anusha");
        li.add("Deepak");
        li.add("Rohit");

        Iterator itr=li.iterator();  
        while(itr.hasNext())
        {  
          System.out.println(itr.next());  
          
        }

    }
}