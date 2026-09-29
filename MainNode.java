public class MainNode {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();

		list.insert(10);
		list.insert(20);
		list.insert(30);
		list.insert(40);
		list.insert(50);

		list.deleteHead();
		list.deleteTail();
		
		list.insertByPosition(1, 60);
		list.insertByPosition(3, 70);

		list.deleteByPosition(4);

		System.out.println("Linked list: ");
		list.display();

		System.out.println(list.search(360));
	}
}
