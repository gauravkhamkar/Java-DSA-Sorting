
import java.util.Arrays;
public class SelectionSort {
    static void sort(int arr[]){
      int n = arr.length;
      for(int i=0; i<n; i++)
      {
         int minindex=i;
         for(int j=i+1; j<n; j++)
         {
            if(arr[j]<arr[minindex])
            {
                int temp=arr[j];
                arr[j]=arr[minindex];
                arr[minindex]=temp;
            }
         }
      }
      System.out.println(Arrays.toString(arr));
    }
    public static void main(String args[])
    {
        int [] arr = {10,5,20,8};
        sort(arr);
    }
}
/*o(n*2) algorithm
 * it does less memory wirtes compared to Quicksort,mergesort
 * ,insertion sort. But Cycle sort is optimal in terms
 * of memory locations */
