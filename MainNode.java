public class MainNode {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();

		list.insert(67);
		list.insert(420);

		list.deleteHead();
		list.deleteByPosition(3);

		list.insert(69);
		list.insert(100);
		
		list.insertByPosition(1, 86);
		list.insertByPosition(3, 666);

		System.out.println("Linked list: ");
		list.display();

		System.out.println(list.search(360));
	}
}