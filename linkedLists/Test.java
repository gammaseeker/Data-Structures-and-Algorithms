package linkedLists;

public class Test {
	public static void main(String[] args)
	{
		Node node1 = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		Node node4 = new Node(4);
		Node node5 = new Node(5);
		Node node6 = new Node(6);
		
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
