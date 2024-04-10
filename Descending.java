class Descending
{
    public static void main(String[] args) 
    {
        int arr[]={1,4,5,3,6,9,8,2,7,};
        int t;

        System.out.println("Thr Given array is ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }

        for(int i=0;i<arr.length;i++)
        {
              
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]<arr[j])
                {
                    t=arr[i];
                    arr[i]=arr[j];
                    arr[j]=t;
                }
            }
            
        }
        System.out.println();    
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
            




    }
}