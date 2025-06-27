package twenty_nine_main;
// scannerを使用するのでインポート
import java.util.Scanner;

import twenty_nine_shori.SubShori;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("数字を入力してください");

		// 受け取った数字をnumに代入する
		String num = scan.nextLine();

		System.out.println("昇順・降順のどちらかを入力してください");
		// 昇順・降順のどちらかをorderに代入する
		String order =  scan.nextLine();

		scan.close();

		// subShoriクラスを使用するためにインスタンス化

		SubShori sub = new SubShori();
		// numメソッド（入力された値をカンマ区切りにして配列を組む）に引数（num）を渡して呼び出す。
		sub.num(num);
		// sortメソッドに引数（order（昇順or降順））を渡して呼び出す。指定された順番に数字を並べ替える。
		sub.sort(order);
		// 出力用のshowメソッドを呼び出す
		sub.show();

	}

}
