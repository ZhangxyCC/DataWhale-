import java.util.HashMap;

/*
 * 实现两个有序数组合并为一个有序数组
 */
public class MergeArray {
	public static int[] merge(int[] A, int[] B) {
		int[] res = new int[A.length + B.length];
		int a = 0;
		int b = 0;
		int i = 0;
		while(a < A.length && b < B.length) {
			if(A[a] < B[b])	res[i++] = A[a++];
			else	res[i++] = B[b++];
		}
		if(a == A.length && b < B.length) {
			while(b < B.length) {
				res[i++] = B[b++];
			}
		}
		else if(b == B.length && a < A.length) {
			while(a < A.length) {
				res[i++] = A[a++];
			}
		}
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = new int[] {1,3,6,8,10};
		int[] B = new int[] {1,3,6,10};
		int[] C = merge(A,B);
		for(int i : C) {
			System.out.print(i + " ");
		}
	}

}
