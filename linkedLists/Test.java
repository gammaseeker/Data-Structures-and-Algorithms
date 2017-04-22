package linkedLists;

public class Test {
	public static void main(String[] args)
	{
		Node node1 = new Node("Hello");
		Node node2 = new Node("World");
		Node node3 = new Node("I");
		Node node4 = new Node("Like");
		Node node5 = new Node("Cats");
		
		/*node1.setNext(node2);
		node2.setNext(node3);
		node3.setNext(node4);
		node4.setNext(node5);*/
		
		SinglyLinkedList list = new SinglyLinkedList(node1);
		list.add(list, "World");
		list.add(list, "I");
		list.add(list, "Like");
		list.add(list, "Cats");
		
		System.out.println(list.search(list, "Hello"));
		System.out.println(list.search(list, "World"));
		System.out.println(list.search(list, "I"));
		System.out.println(list.search(list, "Like"));
		System.out.println(list.search(list, "Cats"));
	}
}
