package doublyLinkedList;

public interface DoublyLinkedList<T> {
	void clear();

	int size();

	boolean isEmpty();

	void add(T element);

	void addFirst(T element);

	void addLast(T element);

	T peekFirst();

	T peekLast();

	T removeFirst();

	T removeLast();

	T remove(Node<T> node);

	boolean remove(Object obj);

	T removeAt(int index);

	int indexOf(Object obj);

	boolean contains(Object obj);
}
