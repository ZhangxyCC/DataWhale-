/*
 * 循环数组
 */
class Node{
		String content;
		Node next;
}
public class CircleLinkedList {
	public Node head;
	public int size;
	public CircleLinkedList(){
		size = 0;
	}
	public void add(Node n) {
		if(size == 0) {
			head = n;
			head.next = n;
		}else {
			Node p = head;
			while(p.next != head) {
				p = p.next;
			}
			p.next = n;
			n.next = head;
		}
		size++;
	}
	
	public void remove(String s) {
		if(size == 0)	return;
		if(size == 1 && head.content.equals(s)) {
			size--;
			head = null;
			return;
		}
		Node p1 = head;
		Node p2 = head.next;
		while(p2 != head) {
			if(p2.content.equals(s)) {
				p1.next = p2.next;
				size--;
				return;
			}
		}
		return;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircleLinkedList c = new CircleLinkedList();
		Node node1 = new Node();
		node1.content = "1";
		Node node2 = new Node();
		node2.content = "2";
		c.add(node1);
//		c.add(node2);
		c.remove("2");
		Node head = c.head;
		System.out.println(head.content);
		while(head.next != c.head) {
			head = head.next;
			System.out.println(head.content);
		}
	}

}
