package OOPS.generics;

// cannot create static field of type parameters
// static T num is illegal since num will be diff for diff objects, it cannot be property of parameterized class

// rtti --> run time type identification functions like getClass() and instanceof
// these cant be used with type parameterized classes since type erasure at run time occurs

// similarly, we cannot create arrays of parameterized types since
// At runtime, due to type erasure, List<Integer>[] would just become List[] (losing the Integer type info)
// cuz of which ArrayStoreException will not be thrown
// *** exception not thrown at compile time since compile is about variables not values/data ***

// no overloading by the same logic, <Integer> and <String> are same at run time, giving error which block to execute

// ArrayList has multithreading (asynchronous) while vectors are single threaded (synchronous)
// vectors are slower but more data integrity

public class CustomArrayList<E> {
    private Object[] data;
    private final int DEFAULT_SIZE = 10;
    private int pos = 0;

    CustomArrayList(int size) {
        data = new Object[size];
    }

    CustomArrayList() {
        data = new Object[DEFAULT_SIZE];
    }

    private void resize(Object[] data) {
        Object[] newData = new Object[2*data.length];
        System.arraycopy(data, 0, newData, 0, data.length);
        data = newData;
    }

    public boolean isFull(Object[] data)
    {
        return (data.length == pos);
    }

    public void add(E num) {
        if(isFull(data))
            resize(data);
        data[pos++] = num;
    }

    public E delete() {
        //return data[pos--];
        return (E)data[--pos];
    }

    public E get(int index) {
        if(index < 0 || index >= pos)
        {
            System.out.println("Index out of bounds");
            return null;
        }
        else {
            return (E)data[index];
        }
    }

    public void set(int index, E value) {
        if(index < 0 || index >= pos)
        {
            System.out.println("Index out of bounds");
        }
        else {
            data[index] = value;
        }
    }

    public int size()
    {
        return pos;
    }

    public void iterate() {
        for(int i = 0; i < pos; i++)
            System.out.print(data[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        CustomArrayList<Integer> list = new CustomArrayList<>();
        list.add(2);
        //list.add("hue");
        list.add(5);
        list.set(1, 3);
        System.out.println(list.get(1));
        System.out.println(list.size());
        list.iterate();
        System.out.println(list.delete());
    }
}
