package linkedLists;

public interface LinkedList 
{
	public String search(SinglyLinkedList list, String target);
	public String search(SinglyLinkedList list, int target);
	public boolean add(SinglyLinkedList list, Node node);
	public boolean add(SinglyLinkedList list, String item);
	public boolean add(SinglyLinkedList list, String item, int index);
	public boolean delete(SinglyLinkedList list, String item);
	public void display();
}
