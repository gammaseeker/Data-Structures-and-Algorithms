
public class LinkedListTest {
	public static void main(String[] args)
	{
		LinkNode node1 = new LinkNode("Hello");
		LinkNode node2 = new LinkNode("World");
		LinkNode node3 = new LinkNode("I");
		LinkNode node4 = new LinkNode("Like");
		LinkNode node5 = new LinkNode("Cats");
		
		SinglyLinkedList list = new SinglyLinkedList(node1);
		list.add(list, "World");
		list.add(list, "I");
		list.add(list, "Like");
		list.add(list, "Cats");
		
		System.out.println(list.search(list, "Cats"));
	}

}
