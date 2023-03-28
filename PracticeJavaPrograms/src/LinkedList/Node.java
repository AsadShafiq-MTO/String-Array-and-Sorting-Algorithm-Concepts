package LinkedList;	

public class Node {
	
	Node head;
	String data;
	Node next;
	
	public Node(String data) 
	{
		this.data=data;
		this.next=null;
	}
	public void addfirst(String data)
	{
		Node newNode=new Node(data);
		if(head==null)
		{
			head=newNode;
			return;
		}
		newNode.next=head;
		head=newNode;
	}
	
	public void addLast(String data)
	{
		Node newNode=new Node(data);
		if(head==null)
		{
			head=newNode;
			return;
		}
		
		Node currNode=head;
		while(currNode.next!=null)
		{
			currNode=currNode.next;
		}
		currNode.next=newNode;
		
	}
	public void print()
	{
		
		if(head==null)
		{
			System.out.println("List is Empty");
			return;
		}
		Node currNode=head;
		
		while(currNode!=null)
		{
			System.out.print(currNode.data+"-> ");
			currNode=currNode.next;
		}
		System.out.println("NULL");
		
	}
	public void deleteFirst()
	{
		if(head==null)
		{
			System.out.println("List is Empty");
			return;
		}
		head=head.next;
		
	}
	public void deleteLast()
	{
		if(head==null)
		{
			System.out.println("List is Empty");
			return;
		}
		if(head.next==null)
		{
			head=null;
			return;
		}
		Node secondLast=head;
		Node lastNode=head.next;
		while(lastNode.next!=null)
		{
			lastNode=lastNode.next;
			secondLast=secondLast.next;
		}
		secondLast.next=null;
	}
	public void reverseItrative()
	{
		Node pre=head;
		Node currNode=head.next;
		
		
		if(head==null)
		{
			System.out.println("List is Empty");
			return;			
		}
		if(head.next==null)
		{
			return;
		}
		while(currNode!=null)
		{
			Node next=currNode.next;
			currNode.next=pre;
			
			pre=currNode;
			currNode=next;
			
		}
		head.next=null;
		head=pre;
	}
	
}
