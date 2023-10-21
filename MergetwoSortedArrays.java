import java.util.Arrays;
public class MergetwoSortedArrays {
    static void merge(int a[], int b[])
    {
        int m = a.length;
        int n = b.length;
        int c[];
        c=new int[m+n];
        for(int i=0; i<m; i++)
        {
            c[i]=a[i];
        }
        for(int i=0; i<n; i++)
        {
            c[m+i]=b[i];
        }
        Arrays.sort(c);
        System.out.println(Arrays.toString(c));
    }
    public static void main(String args[])
    {
        int [] a = {1,3,2,4};
        int [] b = {5,8,6,7};
        merge(a,b);
    }
}
