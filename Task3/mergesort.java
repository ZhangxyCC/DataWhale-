
public class MergeSort {
	public static int[] sort(int[] list)
	{
		devide(list, 0, list.length - 1);
		return list;
	}
	
	public static void devide(int[] list, int begin, int end) {
		if(begin == end)	return;
		devide(list, begin, (begin + end) / 2);
		devide(list, (begin + end) / 2 + 1, end);
		merge(list, begin, end);
	}
	public static void merge(int[] list, int begin, int end) {
		int[] temp = list.clone();
		int a = begin;
		int b = (begin + end) / 2 + 1;
		int index = begin;
		while(a != (begin + end) / 2 + 1 && b <= end) {
			if(temp[a] <= temp[b])	list[index++] = temp[a++];
			else	list[index++] = temp[b++];
		}
		while(a != (begin + end) / 2 + 1) {
			list[index++] = temp[a++];
		}
		while(b <= end) {
			list[index++] = temp[b++];
		}
	}
	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		int[] a = new int[] {2,1,8,6,4,8,9};
		sort(a);
		for(int i : a) {
			System.out.print(i + " ");
		}

	}

}
