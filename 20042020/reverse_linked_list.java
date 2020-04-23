//reverse_linked_list
//https://www.hackerrank.com/challenges/print-the-elements-of-a-linked-list-in-reverse/problem?isFullScreen=true&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen
import java.util.*;

class node
{
	public int data;
	public node next;
	node(){}
	node(int data)
	{
		this.data = data;
		this.next = null;
	}
}

class reverse_linked_list extends node{
	int size;
	node head;
	node tail;
	reverse_linked_list()
	{
		this.size =0;
		this.head =null;
		this.tail =null;
	}
	public void add_end(int data)
	{
		node new_node = new node(data);
		if(head == null)
		{
			head = new_node;
			System.out.println("node added ");
			return;
		}
		node temp = head;
		while(temp.next != null)
		{
			//System.out.println(temp.data);
			temp = temp.next;  
		}
		temp.next = new_node;
		System.out.println("node added ");
		size++;
		return;
	}
	private void print()
	{
		node temp = head;
		while(temp != null)
		{
			System.out.println(temp.data);
			temp = temp.next;  
		}
		return;
	}
	public void print_reverse()
	{
		node tail = head;
		node temp = head;
		while(tail.next != null)	{tail = tail.next; }
		while (tail != head)
		{
			while(temp.next != tail)
			{
				temp = temp.next;
			}
			System.out.println(tail.data);
			tail = temp;
			temp = head;
		}

		System.out.println(head.data);
	}
	public static void main(String[] args)
	{
		reverse_linked_list list1 = new reverse_linked_list();
		list1.add_end(1);
		list1.add_end(2);
		list1.add_end(3);
		list1.add_end(4);
		list1.print();
		System.out.println("------------------------------------------");
		list1.print_reverse();
	}
}