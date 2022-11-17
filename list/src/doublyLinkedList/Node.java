package doublyLinkedList;

class Node<T> {
	private T data;
	private Node<T> prev, next;//refer to 2 node next and previous node current

	public Node(T data, Node<T> prev, Node<T> next) {
		super();
		this.data = data;
		this.prev = prev;
		this.next = next;
	}

	@Override
	public String toString() {
		return this.data.toString();
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public Node<T> getPrev() {
		return prev;
	}

	public void setPrev(Node<T> prev) {
		this.prev = prev;
	}

	public Node<T> getNext() {
		return next;
	}

	public void setNext(Node<T> next) {
		this.next = next;
	}
}
