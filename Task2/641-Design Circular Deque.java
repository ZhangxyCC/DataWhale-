class MyCircularDeque {

    /** Initialize your data structure here. Set the size of the deque to be k. */
    private int length; //the capacity of array
    private int size;   // the actual size of array(the occupied)
    private int[] array;
    private int begin;
    private int end;
    public MyCircularDeque(int k) {
        this.size = k;
        array = new int[k];
        this.length = 0;
        this.begin = 0;
        this.end = 0;
    }
    
    /** Adds an item at the front of Deque. Return true if the operation is successful. */
    public boolean insertFront(int value) {
       if(isFull())  return false;
        array[begin] = value;
        begin = (begin + size - 1) % size;
        length++;
        if(length == 1) end = (end + 1) % size;
        return true;
    }
    
    /** Adds an item at the rear of Deque. Return true if the operation is successful. */
    public boolean insertLast(int value) {
        if(isFull())  return false;
        array[end] = value;
        end = (end + 1) % size;
        length++;
        if(length == 1) begin = (begin + size - 1) % size;
        return true;
    }
    
    /** Deletes an item from the front of Deque. Return true if the operation is successful. */
    public boolean deleteFront() {
        if(length == 0) return false;
        begin = (begin + 1) % size;
        length--;
        if(length == 0) end = begin;
        return true;
    }
    
    /** Deletes an item from the rear of Deque. Return true if the operation is successful. */
    public boolean deleteLast() {
        if(length == 0) return false;
        end = (end + size - 1) % size;
        length--;
        if(length == 0) begin = end;
        return true;
    }
    
    /** Get the front item from the deque. */
    public int getFront() {
        if(length == 0) return -1;
        return array[(begin + 1) % size];
    }
    
    /** Get the last item from the deque. */
    public int getRear() {
        if(length == 0) return -1;
        return array[(end + size - 1) % size];
    }
    
    /** Checks whether the circular deque is empty or not. */
    public boolean isEmpty() {
        return length == 0;
    }
    
    /** Checks whether the circular deque is full or not. */
    public boolean isFull() {
        return length == size;
    }
}
