public static int factorial(int n) {
		if(n == 0 || n == 1)	return 1;
		return factorial(n - 1) * n;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(factorial(8));
	}