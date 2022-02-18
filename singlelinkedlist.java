public class singlelinkedlist {

	public Node head = null;
	class Node {
		private int data;
		private Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public void addNull(int data) {
		Node newNode = new Node(data);

		if (this.head == null) {
			this.head = newNode;
		} else {
			Node cur = this.head;
			while (cur.next != null) {
				cur = cur.next;
			}
			cur.next = newNode;
		}
	}

	public void delete(int data) {
        System.out.println("Deleting First Occurance of data " + data + " from the list");
		if (this.head == null) {
			System.out.println("The List is empty.\n");
			return;
		}

		Node cur = this.head, prev = this.head;

		if (this.head.data == data) {
			this.head = this.head.next;
			return;
		}

		while (cur != null && cur.data != data) {

			prev = cur;
			cur = cur.next;
		}

		if (cur != null) {
			prev.next = cur.next;
		} else {
			System.out.println("The data " + data + " could not be found in the List");
		}
	}

	public void print() {
		if (this.head == null) {
			System.out.println("The List is empty.");
		} else {
			System.out.println("The contents of the Singly Linked List are : ");
			Node cur = this.head;
			while (cur != null) {
				System.out.print(cur.data + " -> ");
				cur = cur.next;
			}
			System.out.println("NULL\n");
		}
	}

	public static void main(String[] args) {
		singlelinkedlist list = new singlelinkedlist();
      	for (int i=1;i<=8;i++) {
			list.addNull(i);
		}
		list.print();
		list.delete(1);
		list.print();
		list.delete(8);
		list.print();
		list.delete(4);
		list.print();
	}
}