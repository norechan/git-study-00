class TestStaticInitializer {
	//1つの要素に6個の要素数を持つ1次元配列の宣言
	public static int[] hyaku = new int[6];
	//スタティックイニシャライザ(静的初期化子)
	static {
		//hyaku[6](0～5)に10から60を代入
		for(int i=0; i<=5; i++) {
			hyaku[i]=(i+1)*10;
		}
	}
	//表示するメソッド
	public static void display() {
		System.out.println("格納されている値を確認");
		for(int i=0; i<TestStaticInitializer.hyaku.length; i++) {
			System.out.print("hyaku["+i+"] = ");
			System.out.println(hyaku[i]);
		}
	}
}

public class j27r2 {
	public static void main(String[] args) {
		TestStaticInitializer.display();
	}
}
