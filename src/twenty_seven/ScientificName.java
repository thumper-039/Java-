package twenty_seven;

// Shoriクラスを親クラスとして継承する
public class ScientificName extends Shori {


	// ほかのクラスからアクセスできないようにprivateで学名用の変数を宣言する
	private String[] scientificName = {"パンテラ レオ","ロキソドンタ・サイクロティス","アイルロポダ・メラノレウカ","パン・トゥログロディテス","チャップマンシマウマ","不明"};

	public ScientificName() {
		// 親クラスのコンストラクタを呼び出す
		super();
	}

	// Shoriクラスから引数iを受け取る
	public void showScientificName (int i) {

		// 引数の値に応じて学名を出力する
		System.out.println("学名：" + scientificName[i]);
		System.out.println();

	}
}


