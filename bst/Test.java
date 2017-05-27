package bst;

public class Test {
	public static void main(String[] args)
	{
		Node root = new Node(5);
		Node node2 = new Node(10);
		Node node3 = new Node(11);
		
		root.setRight(node2);
		root.setLeft(new Node(3));
		node2.setRight(node3);
		
		BinarySearchTree bst = new BinarySearchTree(root);
		
		bst.preOrder();
		System.out.println();
		bst.inOrder();
		System.out.println();
		bst.postOrder();
		System.out.println();
		
		
		
	}
}
