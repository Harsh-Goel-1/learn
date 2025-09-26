package kunal_dsa;

public class CLL {

	private Node head;
	private Node tail;
	
	public void insert(int value)
	{
		Node node=new Node(value);
		if(head==null)
		{
			head=node;
			tail=node;
			return;
		}
		node.next=head;
		tail.next=node;
		head=node;
	}
	
	public int delete(int value)
	{
		Node temp=head;
		Node prev=tail;
		int x;
		if(head!=null)
		{
			do 
			{
				if(temp.value==value)
				{
					x=temp.value;
					prev.next=temp.next;
					return x;
				}
				temp=temp.next;
				prev=prev.next;
			}while(temp!=head);
		}
		return -1;
	}
	
	public void display()
	{
		Node temp=head;
		if(head!=null)
		{
			do 
			{
				System.out.print(temp.value+" -> ");
				temp=temp.next;
			}while(temp!=head);
			System.out.println("Head");
		}
	}
	
	private class Node
	{
		int value;
		Node next;
		
		Node(int value)
		{
			this.value=value;
		}
	}
	
}
