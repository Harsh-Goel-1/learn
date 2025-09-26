package kunal_dsa;

//singly linked list... not edited very much, just in a base phase
public class LL
{
	private int size;
	private Node head;//by default they(objects) are  null
	private Node tail;
	
	public void display() 
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.value+" -> ");
			temp=temp.next;
		}
		System.out.println("END");
	}
	
	public void insertFirst(int value)
	{
		Node node=new Node(value);
		node.next=head;
		head=node;
		if(tail==null)
			tail=head;
		size+=1;
	}
	
	public void insertLast(int value)
	{
		if(tail==null)
		{
			insertFirst(value);
			return;
		}
		Node node=new Node(value);
		tail.next=node;
		tail=node;
		size++;
	}
	
	public void insert(int value,int index)
	{
		if(index==0)
		{
			insertFirst(value);
			return;
		}
		if(index==size)
		{
			insertLast(value);
			return;
		}
		Node temp=head;
		for(int i=0;i<index-1;i++)
		{
			temp=temp.next;
		}
		Node node=new Node(value,temp.next);
		temp.next=node;
		size++;
		System.out.println(head.next.value);
		System.out.println(temp.next.value);
		System.out.println(head);
		System.out.println(temp);
	}
	
	public int deleteFirst()
	{
		int val=head.value;
		head=head.next;
		if(head==null)
			tail=null;
		size--;
		return val;
	}
	
	public int deleteLast()
	{
		Node temp=head;
		for(int i=0;i<size-1;i++)
		{
			temp=temp.next;
		}
		int val=temp.next.value;
		temp.next=null;
		if(tail==null)
			head=null;
		return val;
	}
	
	public LL()
	{
		this.size=0;
	}
	
	private class Node
	{
		int value;
		Node next;
		Node(int value)
		{
			this.value=value;
		}
		Node(int value, Node next)
		{
			this.value=value;
			this.next=next;
		}
	}
	
	public static void main(String args[])
	{
		LL list=new LL();
		list.insertFirst(0);
		list.insertFirst(23);
		list.insertFirst(82);
		list.insert(12, 2);
		list.display();
	}
}