package twenty_fifth_main;

// ユーザーの入力を受け取るためにスキャナーをインポートする
import java.util.Scanner;

// 処理パッケージのHeroクラスを使用できるようにインポート
import twenty_fifth_shori.Hero;


public class Main {

	public static void main(String[] args) {

		// ユーザーの入力した文字を受け取る
		Scanner scan = new Scanner(System.in);
		System.out.println("名前を入力してください");

		// 受け取った文字をnameに代入する
		String name = scan.nextLine();

		// Heroクラス（子クラス）をインスタンス化
		Hero h = new Hero();
		// ユーザーの入力したnameを引数としてsetNameに渡す
		h.setName(name);
		// getNameでnameを受け取って出力する
		System.out.println("こんにちは「" + h.getName() + "」さん");
		// showStatusメソッドを呼び出す
		h.showStatus();
		// helloメソッドを呼び出す
		h.hello();
		// scannerを閉じる
		scan.close();
	

	}

}

