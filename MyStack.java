import java.util.*;
class MyStack
{
    public static void main(String[] args) 
    {
        Stack <String> st=new Stack <String> ();
        st.push("Sanjay");
        st.push("Anusha");
        st.push("Deepak");
        st.push("Rohit");
        
        Iterator <String> itr=st.iterator();
        while (itr.hasNext()) 
        {
            System.out.println(itr.next());
            
        }
    }
}