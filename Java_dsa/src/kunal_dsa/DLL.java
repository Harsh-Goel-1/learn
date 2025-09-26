package kunal_dsa;

public class DLL
{
	private Node head;
	private Node tail;
	private int size;
	
	public int getIndexOf(int value)
	{
		int index=0;
		Node temp=head;
		for(int i=0;i<size;i++)
		{
			if(value==temp.value)
				break;
			temp=temp.next; 
			index++;
		}
		return index;
	}
	
	public int getValueAt(int index)
	{
		if(index>=size)
			return -1;
		Node temp=get(index);
		return temp.value;
	}
	
	public void insertFirst(int value)
	{
		Node node=new Node(value,null,head);
		if(head!=null)
			head.prev=node;
		head=node;
		if(tail==null)
			tail=head;
		size++;
	}
	
	public void insertLast(int value)
	{
		Node node=new Node(value,tail,null);
		if(tail!=null)
			tail.next=node;
		tail=node;
		if(head==null)
			head=tail;
		size++;
	}
	
	public void insert(int value,int index)
	{
		if(index>=size)
			System.out.println("ERROR:index");
		Node node=new Node(value);
		Node temp=get(index-1);
		node.prev=temp;
		node.next=temp.next;
		temp.next.prev=node;
		temp.next=node;
		size++;
		
	}
	
	public void display()
	{
		Node temp=head;
		for(int i=0;i<size;i++)
		{
			System.out.print(temp.value+ " -> ");
			temp=temp.next;
		}
		System.out.println("End");
	}
	
	public void displayLast()
	{
		Node temp=tail;
		for(int i=0;i<size;i++)
		{
			System.out.print(temp.value+" <- ");
			temp=temp.prev;
		}
		System.out.println("Start");
	}
	
	public int deleteFirst() 
	{
		int value=head.value;
		head=head.next;
		head.prev=null;
		size--;
		return value;
	}
	
	public int deleteLast()
	{
		int value=tail.value;
		tail=tail.prev;
		tail.next=null;
		size--;
		return value;
	}
	
	public int delete(int index)
	{
		if(index>=size)
			return -1;
		if(index==0)
			return deleteFirst();
		if(index==size)
			return deleteLast();
		Node temp=get(index-1);
		int value=temp.next.value;
		temp.next=temp.next.next;
		temp.next.next.prev=temp;
		size--;
		return value;
	}
	
	private Node get(int index)
	{
		if(index<=size/2)
		{
			Node temp=head;
			for(int i=0;i<index;i++)
			{
				temp=temp.next;
			}
			return temp;
		}
		else
		{
			Node temp=tail;
			for(int i=index;i<size-1;i++)
			{
				temp=temp.prev;
			}
			return temp;
		}
	}
	
	private class Node
	{
		int value;
		Node next;
		Node prev;
		Node(int value)
		{
			this.value=value;
		}
		Node(int value,Node prev,Node next)
		{
			this.value=value;
			this.prev=prev;
			this.next=next;
		}
	}
	
	DLL()
	{
		this.size=0;
	}
	
}
