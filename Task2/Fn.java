public class Fn {
	public static int fac(int n) {
		if(n == 1 || n == 2)	return 1;
		return fac(n - 1) + fac(n - 2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fac(8));
	}
}
