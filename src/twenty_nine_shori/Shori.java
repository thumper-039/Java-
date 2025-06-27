package twenty_nine_shori;



public class Shori {

	// privateでアクセスに制限をかける
	private String[] prefecture = {"北海道","青森県","岩手県","宮城県","秋田県","山形県","福島県","茨城県","栃木県","群馬県","埼玉県"};
	private String[] prefecturalCapital = {"札幌市","青森市","盛岡市","仙台市","秋田市","山形市","福島市","水戸市","宇都宮市","前橋市","さいたま市"};
	private double[] area = { 83424,9646,15275,7282,11638,9323,13784,6097,6408,6362,3798};
	// protectedでサブクラスからもアクセスできるように宣言する
	protected int[] numBox;

	// 空のコンストラクタ（受け取る引数がないため）
	public Shori (){

	}

	// 入力された値を受け取って配列を組むメソッド
	public void num(String num) {

		// 受け取った数字をカンマ区切りにして配列に代入する
		String[] parts = num.split(",");

		// カンマ区切りにして受け取った値は文字型なので、新しく整数方の配列をつくる
		numBox = new int[parts.length];
		// カンマ区切りして取り出した値を一つずつ順番にnumBoxに入れていく
		for (int i = 0; i < numBox.length; i++) {
			// String型として受け取ったのでint型に変換して代入していく
			this.numBox[i] = Integer.parseInt(parts[i]);
		}
	}
	// 該当する数字に対する値を出力するメソッド
	public void show () {

		// 配列に入っている値を順番に出力していく
		for (int l = 0; l < numBox.length; l++) {

			System.out.println("都道府県：" + prefecture[numBox[l]]);
			System.out.println("県庁所在地：" + prefecturalCapital[numBox[l]]);
			// printf→"%.1f\n",△△で小数点第一位まで数字を出力する。後ろに単位をつける時はフォーマット文字列の中に文字として追加する。（fと\の間）
			System.out.printf("面積：%.1fkm2\n", area[numBox[l]] );
			System.out.println();

		}
	}
}


