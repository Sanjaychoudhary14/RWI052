class ArrayCopyAllElements
{
       //Initialize array
    public static void main(String[] args) 
    {
        
      //Create another array arr2 with size of arr1

    int arr1[]={1,2,3,4,5,6,7,8,9};

     //Copying all elements of one array into another  

    int arr2[]=new int[arr1.length];

    for(int i=0;i<arr1.length;i++)
    {
        arr2[i]=arr1[i];
    }
    System.out.println("Elements of original array: ");  

    for(int i=0;i<arr1.length;i++)
    {  
        System.out.print(arr1[i]+" ") ;
    }

    System.out.println();   

     //Displaying elements of array arr2     
     System.out.println("Elements of new array: "); 

     for (int i = 0; i < arr2.length; i++) 
     {     
        System.out.print(arr2[i] + " ");    
     }     



    }
}