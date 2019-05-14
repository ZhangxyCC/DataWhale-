public class ArrayQueue<Item> {
    private Item[] a;
    private int head;
    private int tail;
    private int N;   
    public ArrayQueue(){
    	a = (Item[])new Object[1];
    	tail = 0;
    	head = 0;
    	N = 0;
    }
    public boolean isEmpty() {
        return N==0;
    }
    public int size() {
        return N;
    }
    public void add(Item item) {
        if(N==a.length) resize(a.length*2);
        a[tail++]=item;        
        if(tail==a.length) tail=0;   
        N++;            
    }
    public Item remove() {
        Item item=a[head];    
        a[head++]=null;       
        N--;               
        if(head==a.length) head=0; 
        if(N<a.length/4) resize(a.length/2);    
        return item;   
    }
    public void resize(int n) {
        Item[] items=(Item[])new Object[n];
        for(int i=0;i<N;i++) {
            items[i]=a[(i+head)%a.length];   
        }
        a=items;
        head=0;    
        tail=N;
    }
}