package basicClass;

// SimpleDateFormatをインポートする（書式）←別のパッケージにあるクラスを使えるようにするためにインポート
import java.text.SimpleDateFormat;
// Dateをインポートする（日付）←別のパッケージにあるクラスを使えるようにするためにインポート
import java.util.Date;

public class Animal {

	public static void main(String[] args) {
		
		// Q1：Dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力してください。
		// Dogクラスをdog変数に代入
		Dog dog = new Dog ();
		// DogクラスのanimalNameをコンソールに出力する
		System.out.println("動物の名前："+dog.animalName);
		
		// Q2：Dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力してください。
		// DogクラスをdogNum変数に代入。引数に値を渡す。
		Dog dogNum = new Dog (2);
		// dogNum.animalNumで動物の数を出力する
		System.out.println("動物の数："+dogNum.animalNum);
				
		// 現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力してください
		// SimpleDateFormatをインスタンス化してコンストラクタを呼ぶ（日付のフォーマットを指定）
        SimpleDateFormat shosiki = new SimpleDateFormat("yyyy-MM-dd H:m:s");

        // 現在の日時を変数now
        Date now = new Date();

        // nowを指定したフォーマットに合わせた値をformattedDateに代入
        String formatNow = shosiki.format(now);

        // formattedDateを出力
        System.out.println("現在の日時：" + formatNow);

	}

}
