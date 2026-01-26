public class Move_Zero 
{
    public static void moveZero(int[] arr)
    {
        int index=0;

        // move non-zero element forward
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0)
                arr[index++]=arr[i];
        }
        // fill remaining position with zeros
        while(index<arr.length)
            arr[index++]=0;

    }
    public static void main(String[] args)    
    {
        int[] arr={0,2,0,3,4};
        moveZero(arr);

        for(int x:arr) 
        {
            System.out.print(x+" ");
        }
    }
}
