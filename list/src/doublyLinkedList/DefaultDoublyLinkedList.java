package doublyLinkedList;

import javax.management.RuntimeErrorException;

public class DefaultDoublyLinkedList<T> implements DoublyLinkedList<T> {
	private int size;// quantity of node in linked list
	private Node<T> head = null;
	private Node<T> tail = null;

	@Override
	public void clear() {
		Node<T> currentNode = head;

		while (currentNode != null) {
			Node<T> nextNode = currentNode.getNext();
			currentNode.setNext(null);
			currentNode.setPrev(null);
			currentNode.setData(null);
			currentNode = nextNode;
		}
		head = tail = null;
		size = 0;

	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		return size() == 0;
	}

	@Override
	public void add(T element) {
		addLast(element);

	}

	@Override
	public void addFirst(T element) {
		if (isEmpty()) {
			head = tail = new Node<>(element, null, null);
		} else {
			Node<T> newNode = new Node<>(element, null, head);
			head.setPrev(newNode);
			head = head.getPrev();
		}

	}

	@Override
	public void addLast(T element) {
		if (isEmpty()) {
			head = tail = new Node<>(element, null, null);
		} else {
			Node<T> newNode = new Node<>(element, tail, null);
			tail.setNext(newNode);
			tail = tail.getNext();
		}

	}

	@Override
	public T peekFirst() {
		if (isEmpty()) {
			throw new RuntimeException("Empty linked list");
		} else {
			return tail.getData();
		}
	}

	@Override
	public T peekLast() {
		if (isEmpty()) {
			throw new RuntimeException("Empty linked list");
		} else {
			return head.getData();
		}
	}

	@Override
	public T removeFirst() {
		if (isEmpty()) {
			throw new RuntimeException("Empty linked list");
		} else {
			T data = head.getData();
			head = head.getNext();
			size--;
			if (isEmpty()) {
				tail = null;
			} else {
				head.setPrev(null);
			}
			return data;
		}
	}

	@Override
	public T removeLast() {
		if (isEmpty()) {
			throw new RuntimeException("Empty linked list");
		} else {
			T data = head.getData();
			tail = tail.getPrev();
			size--;
			if (isEmpty()) {
				head = null;
			} else {
				tail.setNext(null);
			}
			return data;
		}
	}

	@Override
	public T remove(Node<T> node) {
		if (node.getPrev() == null) {
			removeFirst();
		}

		if (node.getNext() == null) {
			removeLast();
		}

		node.getPrev().setNext(node.getNext());
		node.getNext().setPrev(node.getPrev());

		T data = node.getData();
		size--;

		node.setData(null);
		node.setNext(null);
		node.setPrev(null);
		node = null;

		return data;
	}

	@Override
	public boolean remove(Object obj) {
		Node<T> currentNode = head;

		if (obj == null) {
			while (currentNode != null) {
				if (currentNode.getData() == null) {
					remove(currentNode);
					return true;
				}
				currentNode = currentNode.getNext();
			}
		} else {
			while (currentNode != null) {
				if (currentNode.getData() == obj) {
					remove(currentNode);
					return true;
				}
				currentNode = currentNode.getNext();
			}
		}
		return false;
	}

	@Override
	public T removeAt(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int indexOf(Object obj) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean contains(Object obj) {
		// TODO Auto-generated method stub
		return false;
	}

}
