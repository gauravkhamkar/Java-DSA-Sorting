public class IntersectionofSortedArrays {
    static void intersection(int a[], int b[])
    {
        for(int i=0; i<a.length; i++)
        {
            if(i>0 && a[i]==a[i-1])
            {
                continue;
            }
            for(int j=0; j<b.length; j++)
            {
                if(a[i]==b[i])
                {
                    System.out.println(a[i]);
                    break;
                }
            }
        }
    }
}
