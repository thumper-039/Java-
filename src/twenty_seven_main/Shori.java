package twenty_seven_main;

public class Shori {

	// privateでフィールドに変数を宣言する
	// animalに動物名
	private String animal;
	// height に体長
	private double height;
	// speed に速度
	private int speed;
	// scientificName に学名
	private String scientificName;

	// Dateクラスから引数animalを受け取ってanimalに値を代入する（setter）
	public void setAnimal(String animal) {
		this.animal = animal;
	}
	// フィールドのanimalの値を受け取る
	public String getAnimal() {
	    return this.animal;
	}
	// Dateクラスから引数heightを受け取ってheightに値を代入する（setter）
	public void setHeight(double height) {
		this.height = height;
	}
	// フィールドのheightの値を受け取る
	public double getHeight() {
	    return this.height;
	}
	// Dateクラスから引数speedを受け取ってspeedに値を代入する（setter）
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	// フィールドのspeedの値を受け取る
	public int getSpeed() {
	    return this.speed;
	}
	// Dateクラスから引数scientificNameを受け取ってscientificNameに値を代入する（setter）
	public void setScientificName(String scientificName) {
		this.scientificName = scientificName;
	}
	// フィールドのscientificNameの値を受け取る
	public String getScientificName() {
	    return this.scientificName;
	}

	// showAnimalメソッドで文字を出力する
	public void showAnimal () {
		System.out.println("動物名：" + getAnimal());
		System.out.println("体長：" + getHeight() + "m");
		System.out.println("速度：" + getSpeed() + "km/h");
		System.out.println("学名：" + getScientificName());

	}

}


