class MyCircularQueue {
    private int begin;
    private int end;
    private int cur;
    private int[] array;
    /** Initialize your data structure here. Set the size of the queue to be k. */
    public MyCircularQueue(int k) {
        begin = 0;
        end = 0;
        cur = 0;
        array = new int[k];
    }
    
    /** Insert an element into the circular queue. Return true if the operation is successful. */
    public boolean enQueue(int value) {
        if(cur == array.length) return false;
        array[end] = value;
        if(end == array.length - 1) end = 0;
        else end++;
        cur++;
        return true;
    }
    
    /** Delete an element from the circular queue. Return true if the operation is successful. */
    public boolean deQueue() {
        if(cur == 0)    return false;
        if(begin == array.length - 1)   begin = 0;
        else begin++;
        cur--;
        return true;
    }
    
    /** Get the front item from the queue. */
    public int Front() {
        if(isEmpty())  return -1;
        return array[begin];
    }
    
    /** Get the last item from the queue. */
    public int Rear() {
        if(isEmpty())  return -1;
        return array[(end + array.length - 1) % array.length];
    }
    
    /** Checks whether the circular queue is empty or not. */
    public boolean isEmpty() {
        return cur == 0;
    }
    
    /** Checks whether the circular queue is full or not. */
    public boolean isFull() {
        return cur == array.length;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */