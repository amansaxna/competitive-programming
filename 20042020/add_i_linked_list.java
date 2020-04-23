//add_i_linked_list

import java.util.*;

class node{
	public int data;
	public node next;
	node(){};
	node(int data)
	{
		this.data = data;
		this.next = null;
	}
}

class add_i_linked_list extends node{
	int size;
	node head;
	add_i_linked_list()
	{
		this.head = null;
		this.size =0;
	}
	private void add_head(int data)
	{
		node new_node = new node(data);
		if(head == null)
		{
			head = new_node;
			System.out.println("node added at he head");
			return;
		}
		node temp = head;
		head = new_node;
		head.next = temp;
		System.out.println("node added at he head");

		return;
	}
	public void print()
	{
		node temp = head;
		while(temp != null)
		{
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	private void add_i(int data, int pos)
	{

		node new_node = new node(data);
		int i =0;
		node temp = head;
		while(i+1 != pos)
		{
			//System.out.println(temp.data);
			temp  = temp.next;
			i++;
		}
		node temp2 = temp.next;
		temp.next = new_node;
		new_node.next = temp2;
		//System.out.println();
		//temp.next = temp2;
	}
	public static void main(String[] args)
	{
		add_i_linked_list list1 = new add_i_linked_list();
		//list1.add_end(1);
		//list1.add_end(2);
		//list1.add_end(3);
		list1.add_head(3);
		list1.add_head(2);
		list1.add_head(1);

		list1.add_i(4,1);
		list1.print();
	}
}