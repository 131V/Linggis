class Node {
	int data;
	Node next;

	Node(int data) {
		this.data = data;
		this.next = null;
	}
}

class LinkedList {
	Node head;
	Node tail;

	public void insert(int data) {
		Node newNode = new Node(data);

		if (head == null) {
			head = newNode;
			tail = newNode;
			return;
		}

		tail.next = newNode;
		tail = newNode;
	}

  public void insertByPosition(int position, int data) {
    Node newNode = new Node(data);
    Node current = head;

	if (position == 1) {
		newNode.next = head;
		head = newNode;
		return;
	}

    for (int i = 1; i < (position-1); i++) {
      current = current.next;
    }

    Node after = current.next;
    current.next = newNode;
    current.next.next = after;
  }

	public void deleteHead() {
		if (head != null) {
			head = head.next;
		}
	}

	public void deleteTail() {
		if (head == null) {
			return;
		}

		if (head.next == null) {
			head = null;
			return;
		}

		Node current = head;
		while(current.next.next != null) {
			current = current.next;
		}

		current.next = null;
		tail = current;
	}


	public void deleteByPosition(int position) {
		Node current = head;

		if (position == 1) {
			deleteHead();
			return;
		}

		for (int i = 1; i < position - 1; i++) {
			current = current.next;
		}

		if (current == null || current.next == null) {
			System.out.println("out of the position!");
			return;
		}

		current.next = current.next.next;


	}

	public int search(int data) {
		Node current = head;
		int index = 0;
		while (current.data != data) {
			index++;
			current = current.next;

			if (current == null) {
				System.out.println("there is no value");
				return -1;
			}
		}
		return index;
	}

	public void display() {
		Node tail = head;

		while (tail != null) {
			System.out.print(tail.data + "->");
			tail = tail.next;
		}

		System.out.println("null");
	}
}