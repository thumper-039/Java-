package thirty;

// BigDecimalを使うためにインポート（誤差が出ないように正確に計算するため）
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Person {

	// 問題1：インスタンスフィールドを定義してください
	private String name;
	private int age;
	private double height;
	// 問題4：インスタンスフィールド「weight」を定義し（double型）
	private double weight;
	static int count = 0;

	// 問題2：コンストラクタを定義してください（下記それぞれの引数）
	public Person(String name,int age,double height,double weight){

		// 問題3：コンストラクタの中で各インスタンスフィールドに値をセットしてください
		this.name = name;
		this.age = age;
		this.height = height;
		// 問題4:コンストラクタの中で値をセット
		this.weight = weight;
		count++;

	}

	// 問題6：インスタンスメソッド「bmi」を定義してください（戻り値：double）
	public double bmi(){
		// BMI ＝ 体重kg ÷ (身長m)2
		double bmi = weight / (this.height*this.height);
		// double型のbmiを文字列に変換してから、BigDecimalクラスのオブジェクトに変換
		BigDecimal newBmi = new BigDecimal(String.valueOf(bmi));
		
		// 切り捨て
		newBmi = newBmi.setScale(0, RoundingMode.DOWN); 
		// 四捨五入　bd = bd.setScale(1, RoundingMode.HALF_UP);
		// 問題7：bmiメソッドでインスタンスのBMIを返すようにしてください
		// double方に戻して値を返す
		return newBmi.doubleValue();
	}

	// 問題8：インスタンスメソッド「print」を定義してください（戻り値：void）
	public void print() {
		// 問題9：printメソッドの中でthisを用いて「名前は〇〇です」,「年は〇〇です」「BMIは○○です」と出力してください
		System.out.println("名前は" + this.name + "です");
		System.out.println("年は" + this.age + "才です");
		System.out.printf("BMIは%.1fです\n",this.bmi());
		System.out.println();
		// 問題10：人数の合計を「合計○人です」と出力してください。
		System.out.println("合計" +count+ "人です");
	}

	// privateを墓のクラスでも使えるようにgetterを使う
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public double getHeight() {
		return height;
	}

}
