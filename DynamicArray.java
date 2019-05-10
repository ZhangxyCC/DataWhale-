import java.util.Iterator;
/*
 *     实现一个支持动态扩容的数组
 */
public class DynamicArray<Item> implements Iterable<Item>{
	private int size;
	private int length;
	private Item[] array;
	public DynamicArray() {
		array = (Item[]) new Object[1];
		this.size = 1;
		this.length = 0;
	}
	public void add(Item item) {
		if(length == size) {
			Item[] newArray = (Item[]) new Object[size * 2];
			for(int i = 0;i < size; i++) {
				newArray[i] = array[i];
			}
			size *= 2;
			array = newArray;
		}
		array[length++] = item;
	}
	public Item get(int index) {
		Item item = null;
		if(index < size)	return array[index];
		else	return null;
	}
	
	public int getSize() {
		return size;
	}
	
	private class daIterator<Item> implements Iterator<Item>{
		private int i = 0;
		@Override
		public boolean hasNext() {
			return i < length;
		}

		@Override
		public Item next() {
			return (Item) array[i++];
		}
		
	}
	@Override
	public Iterator<Item> iterator() {
		return new daIterator<Item>();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DynamicArray<Integer> a = new DynamicArray<>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		for(int i : a) {
			System.out.println(i);
		}
		System.out.println(a.get(2));
	}
}

