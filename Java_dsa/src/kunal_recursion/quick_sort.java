package kunal_recursion;

import java.util.Arrays;

public class quick_sort {

    public static void main(String[] args)
    {
        int[] arr = {3, 1, 4, 6, 5, 2};
        QS(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void QS(int[] arr, int low, int high)
    {
        if(low>=high)
            return;
        int key=arr[low];
        int s=low, e=high;
        while(s<e)
        {
            while(arr[s]<key) //key pe aake rukenge hi rukenge s and e so range se to bahar nahi jane wale
                s++;
            while(arr[e]>key)
                e--;
            if(s<e)
                swap(arr, s, e);
        }
        QS(arr, low, s-1); //s and e equal honge end mai, index of the sorted key
        QS(arr, s+1, high);
    }

    private static void swap(int[] arr, int i, int j)
    {
        int temp= arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}

//not stable --> if two elements are equal, their order in the sorted output may differ from their order in the input
//in-place, does not take extra space so preferred over merge sort
//merge sort is preferred when sorting linkedlists cuz it is random memory allocation unlike array

// **** HYBRID SORTING ALGORITHMS **** (in-built sorting algorithms, much more efficient)
// Eg- Tim Sort --> merge sort + (insertion sort works well with partially sorted data)