package twenty_seven;

//ユーザーの入力を受け取るためにスキャナーをインポートする
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("コンソールに文字を入力してください");

		// 入力された値をanimalDateに代入する
		String animalDate = scan.nextLine();

		// ScientificNameクラスをインスタンス化
		ScientificName s = new ScientificName();
		// ScientificNameクラスのanimalDateに引数animalDateを渡して呼び出す
		s.animalDate(animalDate);
		// ScientificNameクラスのanimalPartsを呼び出す
		s.animalParts();

		// scannerを閉じる
		scan.close();

	}

}


