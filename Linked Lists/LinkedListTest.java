
public class LinkedListTest {
	public static void main(String[] args)
	{
		LinkNode node1 = new LinkNode("Hello");
		LinkNode node2 = new LinkNode("World");
		LinkNode node3 = new LinkNode("I");
		LinkNode node4 = new LinkNode("Like");
		LinkNode node5 = new LinkNode("Cats");
		
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
