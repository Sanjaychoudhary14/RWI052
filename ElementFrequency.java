class ElementFrequency
{
    public static void main(String args[])
    {
        int arr[]={1,2,3,4,5,2,3,4,2,1,5,3,2};
        
        // Iterate through the array
        for (int i = 0; i < arr.length; i++) 
        {
            if(arr[i]==-1)
            continue;

            int c=1;
             // Count frequency of array[i]
             for (int j = i+1; j < arr.length; j++)
             {
                if(arr[i]==arr[j])
                {
                    c++;

                    // Mark the element as counted

                    arr[j] =-1;
                }
             } 
              // Print the frequency of the element
            System.out.println(arr[i] + " : " + c);

        }


    }

}