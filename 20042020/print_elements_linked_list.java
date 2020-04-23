//print_elements_linked_list
//https://www.hackerrank.com/challenges/print-the-elements-of-a-linked-list/problem?isFullScreen=true

import java.util.*;
import java.lang.*;

class node
{
	public int data;
	public node next;
	public node(){}
	public node(int data)
	{
		this.data = data;
		this.next = null;
	}
}

class print_elements_linked_list extends node
{
	node head;
	int size;
	print_elements_linked_list()
	{
		this.size = 0;
		this.head = null;
	}

	void add_end(int data)
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
	void print()
	{
		node temp = head;
		while(temp != null)
		{
			System.out.println(temp.data);
			temp = temp.next;  
		}
	}	
	
	public static void main(String[] args)
	{
		print_elements_linked_list list1 = new print_elements_linked_list();
		list1.add_end(1);
		list1.add_end(2);
		list1.add_end(3);
		list1.print();
	}
}