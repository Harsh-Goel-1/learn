package kunal_recursion;

import java.util.Arrays;

public class quicksort_classic
{

    public static void main(String[] args)
    {
        int[] arr = {10, 4, 1, 3, 6, 5, 2, 8};
        QS(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void QS(int[] arr, int low, int high)
    {
        if(low>=high)
            return;
        int key=arr[low];
        int s=low, e=high;
//here we take key as separate element and sort the remaining right half with key as reference then put key in the sorted array
//kunal was fiddling the key until it was in the right place
        while(s<e)
        {
            while(arr[s]<=key && s<high)
                s++;
            while(arr[e]>=key && e>low)
                e--;
            if(s<e)
                swap(arr, s, e);
        }
//e aur uske pehele waale<=key, s aur uske baad waale>=key, put low on e (s and e are not necessarily=key)
        swap(arr, e, low);
        QS(arr, low, e-1);
        QS(arr, e+1, high);
    }

    private static void swap(int[] arr, int i, int j)
    {
        int temp= arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}