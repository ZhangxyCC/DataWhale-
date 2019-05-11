import java.util.Arrays;
/*
 * 实现一个大小固定的有序数组，支持动态增删改操作
 */
public class SortArray {
	public int[] array;
	private int pointer;
	public SortArray(int size) {
		this.array = new int[size];
		this.pointer = 0;
	}
	public void add(int n) {
		if(pointer == 0)	array[pointer++] = n;
		else if(pointer == array.length)	return;
		else {
			if(array[pointer - 1] <= n)	array[pointer++] = n;
			else {
				int a = pointer - 1;
				int b = pointer;
				while(a >= 0) {
					if(array[a] > n) {
						int t = array[a];
						array[a--] = n;
						array[b--] = t;
					}
				}
				pointer++;
			}
		}
	}
	public void remove(int index) {
		if(index >= pointer || index < 0)	return;
		while(index < pointer) {
			array[index] = array[++index];
		}
		pointer--;
	}
	
	public void change(int index, int val) {
		if(index >= pointer || index < 0)	return;
		array[pointer++] = val;
		Arrays.sort(array, 0, pointer - 1);
	}
	public static void main(String[] args) {
		SortArray s = new SortArray(5);
		s.add(3);
		s.add(2);
		s.add(7);
		s.add(1);
//		for(int i : s.array) {
//			System.out.print(i + " ");
//		}
		s.remove(1);
		for(int i : s.array) {
			System.out.print(i + " ");
		}
	}

}

