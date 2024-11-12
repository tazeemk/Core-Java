package Array_Task;

public class Sum_Of_Allelements
{
    public static void main(String[] args) {

        int arr[]={34,33,42,56,76,78};
        int sum =0;
        for(int i=0;i<=arr.length-1;i++)
        {
            sum +=arr[i];

        }
        System.out.println("Sum of array :"+sum);
    }
}
