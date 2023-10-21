import java.util.Arrays;

public class MergeSortAlgorithm {
    static void merge(int arr[], int low, int mid, int high) {
        int left[] = new int[mid - low + 1];
        int right[] = new int[high - mid];

        // Filling the left subarray
        for (int i = 0; i < left.length; i++) {
            left[i] = arr[low + i];
        }

        // Filling the right subarray
        for (int j = 0; j < right.length; j++) {
            right[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0;
        int k = low; // Start merging from the 'low' index.
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        // Copy the remaining elements of left[]
        while (i < left.length) {
            arr[k] = left[i];
            i++;
            k++;
        }

        // Copy the remaining elements of right[]
        while (j < right.length) {
            arr[k] = right[j];
            j++;
            k++;
        }
        // System.out.println(Arrays.toString(arr));
}
    static void mergesort(int arr[], int l, int r)
    {
        if(r>l)
        {
            int m=(l+(r-l)/2);
            mergesort(arr,l,m);
            mergesort(arr,m+1,r);
            merge(arr, l,m,r);
        }
        System.out.println(Arrays.toString(arr));

    }
    public static void main(String args[])
    {
        int [] arr={10,5,30,15,7,25,56,12};
        mergesort(arr,0,7);
    }
    
}
