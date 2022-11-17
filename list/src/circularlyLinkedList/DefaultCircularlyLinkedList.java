package circularlyLinkedList;

public class DefaultCircularlyLinkedList<E> implements CircularlyLinkedList<E> {
	private int size = 0;
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
	public E last() {
		if (isEmpty()) {
			throw new RuntimeException("Linked list is empty");
		} else {
			return tail.getValue();
		}
	}

//Update method
	@Override
	public void rotate() {
		if (tail != null) {
			tail = tail.getNext();
		}
	}

	@Override
	public void addFirst(E e) {
		if (isEmpty()) {
			tail = new Node<E>(e, null); // đặt tail bằng e
			tail.setNext(tail);// tạo vòng lặp để có thể xoay tròn khi đến tail
		} else {
			Node<E> newest = new Node<E>(e, tail.getNext());
			tail.setNext(newest);// đưa newest lên đầu
		}
		size++;
	}

	@Override
//	get first but not remove first
	public E first() {
		if (isEmpty()) {
			throw new RuntimeException("Linked list is empty");
		} else {
			return tail.getNext().getValue();
		}
	}

	@Override
	public void addLast(E e) {
		addFirst(e);
		tail = tail.getNext();
	}

	@Override
	public E removeFirst() {
		if (isEmpty()) {
			throw new RuntimeException("Linked list is empty");
		} else {
			Node<E> head = tail.getNext();
			if (head == tail) {
				tail = null;
			} else {
				tail.setNext(head.getNext());
			}
			size--;
			return head.getValue();
		}
	}

}
