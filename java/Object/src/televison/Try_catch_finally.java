package televison;


public class Try_catch_finally {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		disp(1);
		disp(2);
		disp(3);
		disp(4);
	}
		private static void disp(int no){
			int n[] = {18, 29, 36};

			try {
				System.out.println(n[no]);
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("配列の範囲を超えています");
			}
			finally{
				System.out.println("要素の出力を終了します");
			}
		}
	}
