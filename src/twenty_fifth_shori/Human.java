package twenty_fifth_shori;
// スーパークラス（親クラス）
public class Human {
	// privateで変数nameを宣言する
	private String name;
	// 空のコンストラクタ(クラスのインスタンスを作る時に最初に呼ばれる特別なメソッド)
	public Human() {
	}
	// nameの値を取り出すためのメソッド（getterメソッド）
	public String getName() {
		return this.name;
	}
	// nameに値を代入するためのメソッド（setterメソッド）を定義(引数を受け取る)
	public void setName(String name) {
		this.name = name;

	}
	// helloメソッド（あいさつ）
	public void hello() {
		System.out.println("こんにちは");

	}
}

