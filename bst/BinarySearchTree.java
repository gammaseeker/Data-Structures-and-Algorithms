package bst;

public class BinarySearchTree {
	private Node root;
	
	public BinarySearchTree()
	{
		
	}
	public BinarySearchTree(Node root)
	{
		this.root = root;
		
	}
	
	public BinarySearchTree(int data)
	{
		this.root = new Node(data);
	}
	
	public Node search(int target)
	{
		return search(this.root, target);
	}
	
	public Node search(Node root, int target)
	{
		if(root == null || root.getData() == target)
		{
			return root;
		}
		
		if(target < root.getData())
		{
			return search(root.getLeft(), target);
		}
		else
		{
			return search(root.getRight(), target);
		}
	}

	public Node minimum()
	{
		Node x = root;
		while(x.getLeft() != null)
		{
			x = x.getLeft();
		}
		return x;
	}
	
	public Node maximum()
	{
		Node x = root;
		while(x.getRight() != null)
		{
			x = x.getRight();
		}
		return x;
	}
	
	public void insert(Node n)
	{
		if(n.getData() <= root.getData())
		{
			if(root.getLeft() == null)
			{
				root.setLeft(n);
				n.setParent(root);
			}
			if(root.getLeft() != null)
			{
				insert(n);
			}
			
		}
		if(n.getData() > root.getData())
		{
			if(root.getRight() == null)
			{
				root.setRight(n);
				n.setParent(n);
			}
			if(root.getRight() != null)
			{
				insert(n);
			}
			
		}
	}
	
	public void delete(Node n)
	{
		
	}
	
	public int get(int index)
	{
		return 0;
	}
	
	
	public void inOrder()
	{
		inOrder(root);
	}
	
/*  private void inOrder(Node root)
	{	
		if(root!=null)
		{
		    System.out.print(root.getData() + " ");
		    preOrder(root.getLeft());
		    preOrder(root.getRight());
		}
	}*/
	
	private void inOrder(Node root)
	{	
		if(root!=null)
		{
		   inOrder(root.getLeft());
		   System.out.print(root.getData() + " ");
		   inOrder(root.getRight());
		}
	}
	
	public void preOrder()
	{
		preOrder(root);	
	}
	
	private void preOrder(Node root)
	{
		if(root.getLeft() == null &&  root.getRight() == null)
		{
			System.out.print(root.getData() + " ");
		}
		else
		{
	        System.out.print(root.getData() + " ");
	        if(root.getLeft() != null)
	        {
	            
	            preOrder(root.getLeft());
	        }
	       
	            if(root.getRight() != null)
	            {
	                preOrder(root.getRight());
	            }
	        
	          
	    }
	}
	
	public void postOrder()
	{
		postOrder(root);
	}
	
	private void postOrder(Node root)
	{
		if(root.getLeft() == null && root.getRight() == null)
		{
		     System.out.print(root.getData() + " ");
		 }
		    else
		    {
		        if(root.getLeft() != null)
		        {
		             postOrder(root.getLeft());
		              
		        }
		        if(root.getRight() != null)
		        {
		            postOrder(root.getRight());
		            
		        }
		        System.out.print(root.getData() + " ");
		    }
	}
	
}
