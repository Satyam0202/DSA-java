import java.util.Scanner;
public class Rotate_Array 
{
    public static void rotateArray(int[] arr ,int num)
    {
        num=num%arr.length;
        int[] temp=new int[num];

        // last num elements......
        for(int i=0;i<num;i++)
            temp[i]=arr[arr.length-num+i];

        // remaining element.......
        for(int i=arr.length-num-1;i>=0;i--)
            arr[i+num]=arr[i];

        // temp is going to front
        for(int i=0;i<num;i++)
            arr[i]=temp[i];
    }
    public static void main(String[] args)
    {
        int[] arr={1,2,3,4,5,6};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number\t");
        int num=sc.nextInt();

        rotateArray(arr,num);

        for(int x:arr)
            System.out.print(x+" ");
    }
}
