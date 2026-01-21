// problem: Find minimum and maximum element in array
class ArrayMaxMin
{
    // leetCode style method
    public static int[] findMinMax(int[] nums)
    {
        int min=nums[0];
        int max=nums[0];

        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]<min)
                min=nums[i];
            if(nums[i]>max)
                max=nums[i];
        }
        return new int[]{min,max};
    }

    // main method
    public static void main(String[] args)
    {
        int[] arr={3,5,1,8,2};
        int[] result=findMinMax(arr);

        System.out.println("Min="+result[0]);
        System.out.println("Max="+result[1]);
    }
}