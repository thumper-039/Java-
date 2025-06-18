package twenty_seven_main;
//ユーザーの入力を受け取るためにスキャナーをインポートする
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("動物名、体長、速度を「:」で区切って入力してください");

		// 入力された値をanimalDateに代入する
		String animalDate = scan.nextLine();

		// Dateクラスをインスタンス化
		Date d = new Date();
		// DateクラスのscientificNameに引数animalDateを渡して呼び出す
		d.scientificName(animalDate);
		// DateクラスのshoeAnimalメソッドを呼び出す
		d.showAnimal();
		
		// scannerを閉じる
		scan.close();

	}

}


