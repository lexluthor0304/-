package helloWorld;

public class Mthor_overload {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int n = plus(10, 7);
		System.out.println(n);
		double d = plus(3.14, 7.4);
		System.out.println(d);
	}

	private static double plus(double d1, double d2) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println(d1);
		System.out.println(d2);
		return d1 + d2;
	}

	private static int plus(int n1, int n2) {
		// TODO 自動生成されたメソッド・スタブ
		return n1 + n2;
	}

}
