public class secondLargest
{
    public static int secondLargest(int[] arr)
    {
        if(arr.length<2)
            return -1;
        int large=Integer.MIN_VALUE;
        int second_large=Integer.MIN_VALUE;

        for(int num:arr)
        {
            if(num>large)
            {
                second_large=large;
                large=num;
            }
            else if(num>second_large && num<large)
                second_large=num;
        }
        return second_large;
    }

    public static void main(String[] args)
    {
        int[] arr={4,2,8,3,9};
        int result=secondLargest(arr);

        System.err.println(result);
    }
}
