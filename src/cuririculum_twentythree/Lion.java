package cuririculum_twentythree;

public class Lion {

	/*

	 	下記がコンソールに出力されるように作成してください
	 	※thisとsetterとgetterとフィールドを使ってください

	  	動物名：ライオン
		体長：2.1m
		速度：80km/h

	 */

	// private で、自分自身のクラスでのみ呼び出す事ができる
	private String animal;
	private float cm;
	private int speed;

	// animalの値を取り出すためのメソッド（getterメソッド）
	public String getAnimal() {
		return this.animal;
	}
	// animalに値を代入するためのメソッド（setterメソッド）を定義(引数を受け取る)
	public void setAnimal(String animal) {
		this.animal = animal;
	}
	// cmの値を取り出すためのメソッド（getterメソッド）
	public float getCm() {
		return this.cm;
	}
	// cmに値を代入するためのメソッド（setterメソッド）を定義(引数を受け取る)
	public void setCm(float cm) {
		this.cm = cm;
	}
	// speedの値を取り出すためのメソッド（getterメソッド）
	public int getSpead() {
		return this.speed;
	}
	// speedに値を代入するためのメソッド（setterメソッド）を定義(引数を受け取る)
	public void setSpead(int spead) {
		this.speed = spead;
	}

	public static void main(String[] args) {
		// Lionクラスをインスタンス化
		Lion l = new Lion();

		// set〇〇に引数として値を代入する
		l.setAnimal ("ライオン");
		l.setCm(2.1f);
		l.setSpead(80);

		// コンソールに出力する
		System.out.println("動物名：" + l.animal);
		System.out.println("体長：" + l.cm + "m");
		System.out.println("速度" + l.speed + "km/h");
	}

}



