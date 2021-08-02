package datastructures;

//create the Nodehead
class LinkedList {
	Node head;

	class Node {
		int data;
		Node next;

		public Node(int d) {
			data = d;
			next = null;
		}

	}
//insert at begining
	public void insertAtBegining(int new_data) {
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;

	}
//insert after
	public void insertAfter(Node prev_node, int new_data) {
		if (prev_node == null) {
			System.out.println("The previous must be in linkedlist...");
			return;
		}
		Node new_node = new Node(new_data);
		new_node.next = prev_node.next;  //Refering
		prev_node.next = new_node;  //Linking

	}
//insert at the end
	public void insertAtEnd(int new_data) {
		Node new_node = new Node(new_data);
		if (head == null) {
			head = new Node(new_data);
			return;
		}
		new_node.next = null;
		Node last = head;
		while (last.next != null) {
			last = last.next;

			last.next = new_node;
			return;
		}
	}
//delete the node
	void deleteNode(int position) {
		if (head == null) {
			return;
		}
		Node temp = head;
		if (position == 0) {
			head = temp.next;
			return;
		}
		// find the key to be deleted
		for (int i = 0; temp != null && i < position - 1; i++) {
			temp = temp.next;
		}
		// if key is not present
		if (temp == null || temp.next == null) {
			return;
		}
		// remove the node
		Node next = temp.next.next;
		temp.next = next;
	}
//search the node
	boolean searchNode(Node head, int key) {
		Node current = head;
		while (current != null) {
			if (current.data == key) {
				return true;

			}
			current = current.next;
		}
		return false;

	}

//sort the linkedlist
	void sortedLinkedList(Node head) {
		Node current = head;
		Node index = null;
		int temp;

		if (head == null) {
			return;
		} else {
			while (current != null) {
				index = current.next;

				while (index != null) {
					if (current.data > index.data) {
						temp = current.data;
						current.data = index.data;
						index.data = temp;
					}
					index = index.next;
				}
				current = current.next;

			}
		}
	}

	// print the linkedlist
	public void printList() {
		Node tnode = head;
		while (tnode != null) {
			System.out.println(tnode.data + " ");
			tnode = tnode.next;
		}
	}
}
