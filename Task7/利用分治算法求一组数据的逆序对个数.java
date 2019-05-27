/*
代码在牛客网的剑指offer中通过测试
*/
public class Solution {
    public int InversePairs(int [] array) {
        int[] temp = array.clone();
        return (int)(divide(array, temp, 0, array.length - 1) % 1000000007);
    }
    public long divide(int[] a, int[] temp, int begin, int end) {
		int mid = (begin + end) / 2;
		long count = 0;
		if(begin < end) {
			count += divide(a, temp, begin, mid);
			count += divide(a, temp, mid + 1, end);
			count += merge(a, temp, begin, mid + 1, end);
		}
		return count %1000000007;
	}
	public long merge(int[] a, int[] temp, int m1, int m2, int end) {
		int mid = m2 - 1;
		int index = m1;
		int start = m1;
		long count = 0;
		while(m1 <= mid && m2 <= end) {
			if(a[m1] > a[m2]) {
				temp[index++] = a[m2];
				count += (mid - m1 + 1);
				m2++;
			}else {
				temp[index++] = a[m1++];
			}
		}
		while(m1 <= mid)	temp[index++] = a[m1++];
		while(m2 <= end)	temp[index++] = a[m2++];
		for(int i = start; i <= end; i++)	a[i] = temp[i];
		return count % 1000000007;
	}
}