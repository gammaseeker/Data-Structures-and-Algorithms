package linkedLists;

public class Test {
	public static void main(String[] args)
	{
		/*Node node1 = new Node("Hello");
		Node node2 = new Node("World");
		Node node3 = new Node("I");
		Node node4 = new Node("Like");
		Node node5 = new Node("Cats");
		Node nodeA = new Node("wtf");*/
		
		Node node1 = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		Node node4 = new Node(4);
		Node node5 = new Node(5);
		Node node6 = new Node(6);
		
		/*node1.setNext(node2);
		node2.setNext(node3);
		node3.setNext(node4);
		node4.setNext(node5);*/
		
		SinglyLinkedList list = new SinglyLinkedList(node1);
		list.add(node2);
		list.add(node3);
		list.add(node5);
		list.insert(node6, 1);
		list.display();
		System.out.println();
		System.out.println(list.size());
		System.out.println();
		list.delete(3);
		list.display();
		System.out.println();
		SinglyLinkedList list2 = new SinglyLinkedList(node6);
		list2.add(node2);
		list2.add(node3);
		list2.add(node4);
		list2.add(node5);
		list2.display();

	}
}
