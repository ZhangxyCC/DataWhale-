public class LinkedListQueue<T>{ 
	Node first = null; 
	Node last = null; 
	int N = 0; 
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
	public void enqueue(T t){
		Node oldLast = last; 
		last = new Node(); 
		last.t = t; 
		last.next = null; 
		if(N == 0){ 
			first = last; 
		}else{ 
			oldLast = last; 
		} 
		N++; 
	} 
	public T dequeue(){
		T t = first.t; 
		first = first.next; 
		if(N == 0) last = null; 
		N--; 
		return t; 
	} 
}
