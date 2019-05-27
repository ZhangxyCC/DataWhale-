 
public class EightQ {
	public int Queen() {
		int[][] A = new int[8][8];
		int count = 0;
		for(int i = 0; i < 8;i++) {
			count += helper(A,0,i);
		}
		return count;
	}
	public int helper(int[][] A, int row, int col) {
		int count = 0;
		if(row == 7)	return 1;
		A[row][col] = 1;
		loop: for(int i = 0; i < 8;i++) {
			for(int j = row; j >= 0; j--) {
				if(A[j][i] == 1)	continue loop;
				if((i - row + j - 1 >= 0) && A[j][i - row + j - 1] == 1)	continue loop;
				if((i + row - j + 1 < 8) && A[j][i + row - j + 1] == 1)	continue loop;
			}
			count += helper(A, row + 1, i);
		}
		A[row][col] = 0;
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EightQ q = new EightQ();
		System.out.println(q.Queen());
	}
}
