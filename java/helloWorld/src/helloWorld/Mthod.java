package helloWorld;

public class Mthod {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		hello();
		bye();
		hellobye();
	}
	private static void hello() {
		System.out.println("こんにちは！");
	}

	private static void bye() {
		System.out.println("さちばら");
	}

	private static void hellobye() {
		hello();
		bye();
	}

}
