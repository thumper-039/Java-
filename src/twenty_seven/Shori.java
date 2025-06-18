package twenty_seven;


public class Shori {

	// 同じクラスからしかアクセスできないようにprivateで変数を宣言する
	// ,区切りにした値を入れる変数partsを宣言する
	private String[] parts;
	// :区切りした値を入れる変数animalInfoを宣言する
	private String[] animalInfo;


	// animalDateを受け取って「,区切り」
	public void animalDate(String animalDate) {
		// partsをフィールドに代入する
		this.parts = animalDate.split(",");

	}
	public void animalParts() {

		// 拡張for文のカウント用変数i
		int i = 0;

		// 拡張for文を使ってすべての値を出力していく
		for (String animalParts : parts) {

			// animalDateをカンマ区切りでそれぞれの動物の情報を取得してフィールドに代入する
			this.animalInfo = animalParts.split(":");

			// nameに動物名を代入（animalInfoの１番目）
			String name = animalInfo[0];
			// heightに体長の値を代入（animalInfoの2番目）
			double height = Double.parseDouble(animalInfo [1]);
			// speedに速度の値を代入（animalInfoの3番目）
			int speed = Integer.parseInt (animalInfo [2]);

			System.out.println("動物名：" + name);
			System.out.println("体長：" + height + "m");
			System.out.println("速度：" + speed + "km/h");

			// 	サブクラスであるScientificNameをインスタンス化
			ScientificName s = new ScientificName();
			// showScientificNameに引数iを渡して呼び出す
			s.showScientificName(i);

			// 繰り返しのためiに１を足す
			i++;

		}
	}

}






