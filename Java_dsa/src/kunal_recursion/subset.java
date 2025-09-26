package kunal_recursion;

import java.util.*;

public class subset {
    public static void main(String[] args) {
        System.out.println(string_subset("abc",""));
        System.out.println(array_subset(new int[]{1, 2, 3}));
        System.out.println(array_subset_duplicated(new int[]{1, 2, 3, 4, 4}));
        System.out.println(array_subset_duplicated_kunal(new int[]{1, 2, 3, 4, 4}));
    }

    // took a challenge to do like this, this is not optimal at all
    public static ArrayList<String> string_subset(String str, String choice)
    {
        if(str.isEmpty())
        {
            return new ArrayList<String>(Collections.singletonList(choice));
        }
        ArrayList<String> list1 = string_subset(str.substring(1), choice);
        ArrayList<String> list2 = string_subset(str.substring(1), choice+str.charAt(0));
        list1.addAll(list2);
        return list1;
    }

    // iteratively this time
    // space and time both are - N*2^N
    // time shown below, space cuz 2^N subsets of length N
    public static List<List<Integer>> array_subset(int[] arr)
    {
        List<List<Integer>> list = new ArrayList<>();
        list.add(new ArrayList<>());
        for(int num : arr) // O(N)
        {
            int n = list.size();
            for(int i = 0; i < n; i++) // O((2^N)/2) for the last iteration
            {
                List<Integer> subset = new ArrayList<>(list.get(i));
                subset.add(num);
                list.add(subset);
            }
        }
        return list;
    }

    public static List<List<Integer>> array_subset_duplicated(int[] arr){
        Arrays.sort(arr);
        return array_subset_duplicated_code(arr);
    }
    public static List<List<Integer>> array_subset_duplicated_code(int[] arr)
    {
        Arrays.sort(arr);
        List<List<Integer>> list = new ArrayList<>();
        list.add(new ArrayList<>());
        int prev = 0, repeated = 0, base = 0;
        for(int num : arr) // O(N)
        {
            int n = list.size();
            if(prev == num)
                repeated++;
            if(repeated == 1)
                base = n/2;
            for(int i = (prev == num)? base*repeated:0 ; i < n; i++) // 2 is already added to first half if repeated
            {
                List<Integer> subset = new ArrayList<>(list.get(i));
                subset.add(num);
                list.add(subset);
            }
            prev = num;
        }
        return list;
    }

    public static List<List<Integer>> array_subset_duplicated_kunal(int[] arr){
        Arrays.sort(arr);
        return array_subset_duplicated_kunal_code(arr);
    }

    public static List<List<Integer>> array_subset_duplicated_kunal_code(int[] arr)
    {
        List<List<Integer>> list = new ArrayList<>();
        list.add(new ArrayList<>());
        int start = 0, end = 0;
        for(int a = 0; a < arr.length; a++) // O(N)
        {
            start = 0;
            int n = list.size();
            if( a!=0 && arr[a] == arr[a-1])
            {
                start = end + 1;
            }
            end = n - 1;
            for(int i = start; i < n; i++) // O((2^N)/2) for the last iteration
            {
                List<Integer> subset = new ArrayList<>(list.get(i));
                subset.add(arr[a]);
                list.add(subset);
            }
        }
        return list;
    }
}
