package bst;

public class BinarySearchTree {
	private Node root;
	private Node point;
	public BinarySearchTree()
	{
		
	}
	public BinarySearchTree(Node root)
	{
		this.root = root;
		this.point = root;
	}
	
	public BinarySearchTree(int data)
	{
		this.root = new Node(data);
		this.point = new Node(data);
	}
	
	public Node search(int target)
	{
		if(root == null)
		{
			return null;
		}
		else
		{
			if(point.getData() == target)
			{
				point = this.root;
				return point;
			}
			else
			{
				if(target > point.getData())
				{
					point = goRight(point);
					return search(target);
				}
				else
				{
					point = goLeft(point);
					return search(target);
				}
			}
		}
		
	}
	
	private Node goLeft(Node n)
	{
		return n.getLeft();
	}
	
	private Node goRight(Node n)
	{
		return n.getRight();
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
	
	private void inOrder(Node root)
	{
		
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
		if(root.getLeft() == null && root.getRight() == null){
		     System.out.print(root.getData() + " ");
		 }
		    else{
		        if(root.getLeft() != null){
		             postOrder(root.getLeft());
		              
		        }
		        if(root.getRight() != null){
		            postOrder(root.getRight());
		            
		        }
		        System.out.print(root.getData() + " ");
		    }
	}
	
}
