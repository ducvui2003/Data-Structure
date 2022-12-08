package singlyLinkedList;

class Node<E> {
	private E value;
	private Node<E> next;

	public Node(E value, Node<E> next) {
		super();
		this.value = value;
		this.next = next;
	}

	@Override
	public String toString() {
		return this.value.toString();
	}

	public E getValue() {
		return value;
	}

	public void setValue(E value) {
		this.value = value;
	}

	public Node<E> getNext() {
		return next;
	}

	public void setNext(Node<E> next) {
		this.next = next;
	}
}