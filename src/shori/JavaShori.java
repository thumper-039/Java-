package shori; // 処理用のパッケージ

// 日付を指定の文字列にするためSimpleDateFormatクラスをインポート宣言する
import java.text.SimpleDateFormat;
// 現在の日時を取得するためDateクラスをインポート宣言する
import java.util.Date;

public class JavaShori {

	// ほかのパッケージからアクセスができるようにpublicをつけてフィールドに変数をつくる
	public String hello ;
	public String sushi ;
	public String food ;
	public String time ;

	// コンストラクタ（インスタンス（new）を作ったときに自動で呼ばれる）を宣言
	public JavaShori () {

		// インスタンスのフィールドに値を代入する
		this.hello = "こんにちは！ここは日本です！";
		this.sushi ="この寿司はうまい";
		this.food ="寿司は和食です";

		// 日付を文字列にするためにSimpleDateFormatをインスタンス化→日付を引数として受け取る
		SimpleDateFormat shosiki = new SimpleDateFormat("yyyy/MM/dd H:m:s");
		// 現在の日時を取得するためにDateをインスタンス化
		Date now = new Date();
		// formatNowに指定した書式の現在時刻を文字列として代入する
		String formatNow = shosiki.format(now);
		// インスタンスのフィールドに値を代入する
		this.time = "今の現在日時は" + formatNow + "です";


	}
}
