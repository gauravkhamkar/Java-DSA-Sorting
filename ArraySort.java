import java.util.Arrays;
public class ArraySort{
    public static void main(String args[])
    {
        int arr1[]={5,20,12,30};
        char arr2[]={'B','B','A','C','A'};
        int arr3[]={5,30,50,20,10};
        Arrays.sort(arr3, 1, 4);
        System.out.println(Arrays.toString(arr3));
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));
    }
}