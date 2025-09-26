package DSA;

public class Dynamic_Arrays {
	
		//ArrayLists in java are dynamic arrays, vectors in c++, array in javascript, lists in python
		//static array's size can not be changed normally,
		//O(1) constant time search to insert/access a value by index O(n) linear time for searching an element in array
		
		/*
		Dynamic Array has its own inner static array with a fixed size, once it reaches the capacity,
		our dynamic array will declare and instantiate a new array with increased capacity.
		(old values will be given new memory addresses and the old array will be deleted by the garbage collector)||thus time consuming
		Increased capcity depends on the programming language you ae using,
		generally it is between 1.5-2 times the original capacity(arraylists have 1.5 times increase)
		
		Disadvantages- wastes memory if expanded array has unused space; shifting elements,expanding/shrinking array is O(n)
		*/
		
		//ArrayList<String> array= new ArrayList<String>(); is in-built dynamic array so might as well use it
		
	private int capacity=10;
	private int size=0;
	private Object[] array;
	public Dynamic_Arrays() 
	{
		array=new Object[capacity];
	}
	public Dynamic_Arrays(int capacity) 
	{
		this.capacity=capacity;
		array=new Object[capacity];
	}
	public void add(Object data) 
	{
		if(size>=capacity)
			grow();
		array[size]=data;
		size++;
	}
	public void insert(int index,Object data)
	{
		if(size>=capacity)
			grow();
		for(int i=size;i>index;i--)
		{
			array[i]=array[i-1];
		}
		array[index]=data;
		size++;
		
	}
	public void delete(Object data)
	{
		for(int i=0;i<size;i++)
		{
			if(array[i]==data)
			{
				for(int j=i;j<size-1;j++)
				{
					array[j]=array[j+1];
				}
			array[size-1]=null;
			size--;
			if(size<=(capacity/3))
				shrink();
			break;
			}
		}
	}
	public int search(Object data)
	{
		for(int i=0;i<size;i++)
		{
			if(array[i]==data)
				return i;
		}
		return -1; //-1 is returned if i is not returned
	}
	public void grow()
	{
		int newCapacity=capacity*2;
		Object[] newArray=new Object[newCapacity];
		for(int i=0;i<size;i++)
		{
			newArray[i]=array[i];
		}
		array=newArray;
		capacity=newCapacity;
	}
	public void shrink()
	{
		int newCapacity=capacity/2;
		Object[] newArray=new Object[newCapacity];
		for(int i=0;i<size;i++)
		{
			newArray[i]=array[i];
		}
		array=newArray;
		capacity=newCapacity;
	}
	public Object get(int index) 
	{
		return array[index];
    }
	public boolean isEmpty()
	{
		return size==0;
	}
	public String toString() 
	{
		String string="";
		for(int i=0;i<size;i++)
		{
			string+=array[i]+",";
		}
		if(string!="")
		string="["+string.substring(0,string.length()-1)+"]";//-1 to remove last commma.. substring(included,excluded);
		else
		string="[]";
		return string;
	}
}
