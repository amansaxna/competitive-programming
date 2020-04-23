//tree_preorder_traversal
import java.util.*;

class node
{
	public int data;
	public node left;
	public node right;
	node(){}
	node(int data)
	{
		this.data = data;
		this.left = null;
		this.right = null;
	}
}
class tree_preorder_traversal
{
	int height;
	node root;

	tree_preorder_traversal()
	{
		this.height =0;
		this.root = null;
	}

	private node insert(node root,int data)
	{
		if(root == null)	
		{
			return new node(data);
		}
		else
		{	
			node cur;
			//insert at left
			if(root.data > data)
			{
				cur = insert(root.left,data)
				root.left = cur;
			}
			else // insert at right
			{
				cur = insert(root.right,data)
				root.right = cur;
			}
		}

	}

	public void preorder_traversal(node root)
	{
		System.out.println("hello there trree");
	}

	public static void main(String[] args) 
	{
		node root = null;
		root = insert(root,data);
		//tree.preorder_traversal();
	}


}