package kunal_recursion;

import java.util.*;

public class permutations {

    public static void main(String[] args) {
        String str = "abc";
        ArrayList<String> list = new ArrayList<>();
        permutations(str, "", list);
        System.out.println(list);
    }

    public static void permutations(String str, String item, ArrayList<String> list)
    {
        if(str.isEmpty())
        {
            list.add(item);
            return;
        }
        for(int i = 0; i < item.length(); i++)
        {
            permutations(str.substring(1), item.substring(0,i) + str.charAt(0) + item.substring(i), list);
        }
        permutations(str.substring(1), item + str.charAt(0), list);
    }
}
