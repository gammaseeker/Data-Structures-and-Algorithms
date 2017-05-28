package binarySearchTree;

public class Test {
	public static void main(String[] args)
	{
		Node root = new Node(5);
		Node node2 = new Node(10);
		Node node3 = new Node(15);
		Node node4 = new Node(3);
		Node node5 = new Node(2);
		Node node6 = new Node(4);
		
		BinarySearchTree bst = new BinarySearchTree(root);
		bst.insert(node2);
		bst.insert(node3);
		bst.insert(node4);
		bst.insert(node5);
		bst.insert(node6);
		
		bst.preOrder();
		System.out.println();
		bst.inOrder();
		System.out.println();
		bst.postOrder();
		System.out.println();
		
		System.out.println(bst.search(11));
		System.out.println(bst.search(10));
		System.out.println(bst.search(3));
		System.out.println();
		System.out.println("Minimum: " + bst.minimum());
		System.out.println("Maximum: " + bst.maximum());
		
		System.out.println();
		bst.delete(node2);
		bst.preOrder();
		System.out.println();
		bst.inOrder();
		System.out.println();
		bst.postOrder();
		System.out.println();
		
		System.out.println();
		bst.delete(root);
		bst.preOrder();
		System.out.println();
		bst.inOrder();
		System.out.println();
		bst.postOrder();
		System.out.println();
	}
}
