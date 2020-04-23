//add_head_linked_list
//https://www.hackerrank.com/challenges/insert-a-node-at-the-head-of-a-linked-list/problem?isFullScreen=true&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen
import java.util.*;

class node
{
	public int data;
	public node next;
	node() {}
	node(int data)
	{
		this.data = data;
		this.next = null;
	}
}
class add_head_linked_list extends node
{
	int size;
	node head;
	add_head_linked_list()
	{
		this.size = 0;
		this.head = null;
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
	public static void main(String[] args)
	{
		add_head_linked_list list1 = new add_head_linked_list();
		//list1.add_end(1);
		//list1.add_end(2);
		//list1.add_end(3);
		list1.add_head(1);
		list1.add_head(2);
		list1.add_head(3);
		list1.print();
	}
}