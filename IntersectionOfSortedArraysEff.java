public class IntersectionOfSortedArraysEff {
    static void intersection(int a[], int b[])
    {
        int i=0;
        int j=0;
        while(i<a.length && j<b.length)
        {
           if(i>0 && a[i]==a[i-1])
           {
            i++;
            continue;
           }
           if(a[i]<b[j])
           {
            i++;
           }
           else if(a[i]>b[j])
           {
            j++;
           }
           else
           {
            System.out.println(a[i]);
            i++;
            j++;
           }
        }
    }
        public static void main(String args[])
        {
            int [] a={10,20,20,20,40,60,70};
            int [] b={2,20,20,20,70};
            intersection(a,b);

        }
    
}
