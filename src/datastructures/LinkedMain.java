package datastructures;

public class LinkedMain {

	public static void main(String[] args) {
		LinkedList list=new LinkedList();
		list.insertAtEnd(1);
		list.insertAtBegining(2);
		list.insertAtBegining(3);
		list.insertAtEnd(4);
		list.insertAfter(list.head.next, 5);
		
		System.out.println("linked list:");
		list.printList();
		
		System.out.println("after deleting an element:");
		list.deleteNode(3);
		list.printList();
		
		System.out.println();
		int item_to_find=3;
		if(list.searchNode(list.head, item_to_find)) {
			System.out.println(item_to_find+"is found");
		}else {
			System.out.println(item_to_find+"is not found");
		}
		
		list.sortedLinkedList(list.head);
		System.out.println("sorted list");
		list.printList();
		
		
		

	}

}
