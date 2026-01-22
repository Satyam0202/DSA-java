public class reverseArray
{
    public static void reverseArray(int[] arr)
    {
        int left=0;
        int right=arr.length-1;
        
        while(left<right)
        {
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;

            left++;
            right--;
        }
    }
    public static void main(String[] arg)
    {
        int[] arr={1,2,3,4,5,6};
        reverseArray(arr);
        for(int x:arr)
            System.err.println(x+" ");
    }
}