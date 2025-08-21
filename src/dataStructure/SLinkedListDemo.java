package dataStructure;

public class SLinkedListDemo {

	public static void main(String[] args) {
		SLinkedList<Integer> list = new SLinkedList<>();

		// list.removeFirst();

		System.out.println(list.isEmpty());
		System.out.println(list.size());
		System.out.println(list);

		list.addFirst(10);
		System.out.println(list.size());
		System.out.println(list);

		System.out.println(list.removeFirst());
		System.out.println(list.size());
		System.out.println(list);

		list.addFirst(20);
		System.out.println(list.size());
		System.out.println(list);
		list.addFirst(30);
		System.out.println(list.size());
		System.out.println(list);

		list.addLast(40);
		System.out.println(list.size());
		System.out.println(list);
		System.out.println(list.get(0));

		list.add(1, 15);
		System.out.println(list.size());
		System.out.println(list);

		list.add(0, 5);
		System.out.println(list.size());
		System.out.println(list);

		list.add(list.size(), -10);
		System.out.println(list.size());
		System.out.println(list);

	}

}
