package singlyLinkedList;

public class DefaultSinglyLinkedList<E> implements SinglyLinkedList<E> {
	private int size = 0;
	private Node<E> head = null;
	private Node<E> tail = null;

	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public E first() {
		if (isEmpty()) {
			throw new RuntimeException("Linked list is empty");
		} else {
			return head.getValue();
		}
	}

	@Override
	public E last() {
		if (isEmpty()) {
			throw new RuntimeException("Linked list is empty");
		} else {
			return tail.getValue();
		}
	}

	@Override
	public void addFirst(E e) {
		head = new Node<E>(e, head);
		if (isEmpty()) {
			tail = head;
		}
		size++;

	}

	@Override
	public void addLast(E e) {
		Node<E> newNode = new Node<E>(e, null); // newNode is added in tail
		if (isEmpty()) {
			head = newNode;
		} else {
			tail.setNext(newNode);
		}
		tail = newNode;
		size++;
	}

	@Override
	public E removeFirst() {
		if (isEmpty()) {
			throw new RuntimeException("Linked list is empty");
		} else {
			E oldHead = head.getValue();
//			set head for head - 1
			Node<E> newHead = head.getNext();
			head = newHead;
			size--;
			if (isEmpty()) {
				tail = null;
			}
			return oldHead;
		}
	}

}
