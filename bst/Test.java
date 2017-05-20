package bst;

public class Test {
	public static void main(String[] args)
	{
		Node root = new Node(5);
		//System.out.println(root);
		Node node2 = new Node(10);
		Node node3 = new Node(11);
		root.setRight(node2);
		//System.out.println(root.getRight());
		root.setLeft(new Node(3));
		node2.setRight(node3);
		//System.out.println(root.getLeft());
		//System.out.println("  5  ");
		//System.out.println(" /  \\ ");
		//System.out.println(root.getLeft() + "   " + root.getRight());
		BinarySearchTree bst = new BinarySearchTree(root);
		bst.preOrder();
		System.out.println();
		bst.postOrder();
		//System.out.println(bst.search(10));
	}
}
