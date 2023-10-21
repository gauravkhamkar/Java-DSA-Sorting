import java.util.Arrays;

public class MergetwoSortedArraysEffic {
    static void merge(int a[], int b[])
    {
      int i=0;
      int j=0;
      int k=0;
      int c[];
      c=new int[a.length+b.length];
      while(i<a.length && j<b.length)
      {
        if(a[i]<=b[j])
        {
            c[k]=a[i];
            i++;
            k++;
        }
        else{
            c[k]=b[j];
            j++;
            k++;
        }
      }
      while (i < a.length) {
        c[k] = a[i];
        i++;
        k++;
    }

    // Copy the remaining elements of b, if any
    while (j < b.length) {
        c[k] = b[j];
        j++;
        k++;
    }
      System.out.println(Arrays.toString(c));
    }
    public static void main(String args[])
    {
        int [] a = {1,3,6,7};
        int [] b = {4,5};
        merge(a,b);
    }
}

/*However, it's essential to note that the two loops (for copying the remaining elements) 
will not run for 
their worst-case scenarios together in a single execution. 
If one runs x times, the other will run 0 times because as soon as one array
 is exhausted, the other takes over completely.

Given these observations,
the overall time complexity of the merge function is linear, or O(m + n). */
