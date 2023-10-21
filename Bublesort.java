import java.util.Arrays;

public class Bublesort {
    static  void bubblesort(int arr[])
    {
        int n=arr.length;
        for(int i=0; i<n-1; i++)
        {
            for(int  j=0; j<n-1-i; j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        } 
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String args[])
    {
        int [] arr = {20,10,40,30};
        bubblesort(arr);
    }
}
