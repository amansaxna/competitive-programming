//delete_i_linked_list.java

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

class delete_i_linked_list extends node{
	node head;
	int size;
	delete_i_linked_list()
	{
		this.size = 0;
		this.head = null;
	}
	private void add_end(int data)
	{
		node new_node = new node(data);
		if( head == null)
		{
			head = new_node;
			return;
		}
		node temp = head;
		while(temp.next != null)
		{
			temp = temp.next;
		}
		temp.next = new_node;
		size++;
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
	private void delete_i(int position)
	{
		int i =0;
		node temp = head;
		if (position == 0) 
        { 
            head = temp.next;   // Change head 
            return; 
        }
		while(i != position-1 && temp!=null)
		{
			temp = temp.next;
			i++;
		}
		node temp2 = temp.next;
		temp.next = temp2.next;
		return;
	}
	public static void main(String[] args)
	{
		delete_i_linked_list list1 = new delete_i_linked_list();
		list1.add_end(1);
		list1.add_end(2);
		list1.add_end(3);
		list1.add_end(4);
		list1.print();
		System.out.println("------------------------------------------");
		list1.delete_i(2);
		list1.print();
	}
}