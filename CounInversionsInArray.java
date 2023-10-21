/*a pair is called in array is called an inversion pair
 * (arr[i],arr[j]) when i<j and arr[i]>arr[j]
 * 
 * below given is the naive solution which contains 
 * two for loops nested together. which gives time complexity
 * as O(n^2)
 */


public class CounInversionsInArray {
    static int inversion(int arr[])
    {
        int count=0;
        for(int i=0; i<arr.length; i++)
        {
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[i]>arr[j])
                {
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String args[])
    {
        int [] arr={2,4,1,3,5};
        System.out.println(inversion(arr));
    }
}
