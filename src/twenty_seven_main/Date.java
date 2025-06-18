package twenty_seven_main;

// Shoriクラスを継承してDateクラスを作成する
public class Date extends Shori {

	// コンストラクタ
	public Date() {
		// 親クラスのコンストラクタを呼び出す
		super();
	}

	// 引数animalDateを受け取って値を代入するメソッド
	public void scientificName(String animalDate) {

		// :区切りで値を配列partsに代入する
		String[] parts = animalDate.split(":");
		// partsの1番目をanimalに代入する
		setAnimal(parts[0]);
		// partsの2番目をheightに代入する（String型からdouble型に変更する）
		setHeight(Double.parseDouble(parts[1]));
		// partsの3番目をspeedに代入する（String型からint型に変更する）
		setSpeed(Integer.parseInt(parts[2]));

		// switch文で入力された値に合わせた学名をsetScientificNameに代入する
		switch (animalDate) {
		case "ライオン:2.1:80" :
			setScientificName("パンテラ レオ");
			break;
		case "ゾウ:3.2:40" :
			setScientificName("ロキソドンタ・サイクロティス");
			break;
		case "パンダ:1.9:30" :
			setScientificName("アイルロポダ・メラノレウカ");
			break;
		case "チンパンジー:0.94:25" :
			setScientificName("パン・トゥログロディテス");
			break;
		case "シマウマ:2.4:65" :
			setScientificName("チャップマンシマウマ");
			break;
		case "インコ:0.1:50" :
			setScientificName("不明");
			break;

		default:

		}


	}
}



