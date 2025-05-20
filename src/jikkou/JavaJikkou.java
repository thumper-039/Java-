package jikkou; // 実行用のパッケージ

// 処理用のパッケージ内のクラスを使えるようにインポート宣言
import shori.JavaShori;

public class JavaJikkou {

	public static void main(String[] args) {
		// 処理用パッケージ内のJavaShoriを使うためインスタンス化
		JavaShori j = new JavaShori();

		// インスタンスのフィールドの内の値を表示
		System.out.println(j.hello); // こんにちは！ここは日本です！
		System.out.println(j.sushi); // この寿司はうまい
		System.out.println(j.food); // 寿司は和食です
		System.out.println(j.time); // 今の現在日時は2023/03/09 10:23:39です


	}

}
