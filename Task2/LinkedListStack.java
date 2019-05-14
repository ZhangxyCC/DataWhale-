public class LinkedListStack<T>{ 
	private Node first = null;
	private int N = 0;
	private class Node{
		T t;
		Node next; 
	} 
	public boolean isEmpty(){
		return first == null;
	} 
	public int size(){ 
		return N; 
	} 
	public void push(T t){
		Node oldFirst = first; 
		first = new Node(); 
		first.t = t; 
		first.next = oldFirst; 
		N++; 
	} 
	public T pop(){
		T t = first.t; 
		first = first.next; 
		N--; 
		return t; 
	} 
}
	