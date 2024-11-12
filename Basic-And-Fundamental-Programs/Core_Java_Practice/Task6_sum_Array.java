package Core_Java_Practice;

public class Task6_sum_Array
{
    public static void main(String[] args) {
        int arr[]={20,22,11,33,29,80,20};
        int sum =0;
        for (int i=0;i<=arr.length-1;i++)
        {
            sum+=arr[i];
        }
        System.out.println("Sum of array is :"+sum);
    }
}
