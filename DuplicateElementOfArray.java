class  DuplicateElementOfArray
{
    public static void main(String[] args) 
    {
        int arr[]={1,2,3,4,8,6,2,4,8,9,4};

        System.out.println("Duplicate elements in given array: ");  
        //Searches for duplicate element  

        for(int i=0; i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])

                System.out.println(arr[j]);
            }
        }
        
    }

}