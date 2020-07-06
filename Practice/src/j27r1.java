class TestInitializer {
	//インスタンスフィールド　int型配列a(0～4)の宣言
	private int[] a = new int[5];
	//コンストラクタ
	public TestInitializer() {
		for(int i=0; i<5; i++) {
			a[i]+=i;
		}
	}
	//表示するメソッド
	public void display() {
		for(int i=0; i<5; i++) {
			System.out.print("a["+i+"]="+a[i]+" ");
		}
	}
}

public class j27r1 {
	public static void main(String[] args) {
		TestInitializer ti = new TestInitializer();
		ti.display();
	}
}
