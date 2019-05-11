/*
 * 单向链表
 */
class Node{
		String content;
		Node next;
}
public class SimpleLinkedList {
	public Node head;
	public int size;
	public SimpleLinkedList() {
		this.size = 0;
	}
	public void add(Node n) {
		if(head == null)	head = n;
		else	{
			Node p = head;
			while(p.next != null) {
				p = p.next;
			}
			p.next = n;
		}
		size++;
	}
	
	public void remove(int index) {
		if(index < 0 || index >= size)	return;
		if(index == 0) {
			head = head.next;
			size--;
			return;
		}
		Node p = head;
		for(int i = 1; i < index; i++) {
			p = p.next;
		}
		p.next = p.next.next;
		size--;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node n1 = new Node();
		n1.content = "1";
		Node n2 = new Node();
		n2.content = "2";
		SimpleLinkedList list = new SimpleLinkedList();
		list.add(n1);
		list.add(n2);
		Node head = list.head;
		while(head != null) {
			System.out.println(head.content);
			head = head.next;
		}
		list.remove(3);
		head = list.head;
		while(head != null) {
			System.out.println("==" + head.content);
			head = head.next;
		}
		
	}

}
