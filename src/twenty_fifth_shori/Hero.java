package twenty_fifth_shori;

import java.util.Random;
// Humanクラスを継承してHeroクラスをつくる
public class Hero extends Human{
	// privateでステータスの変数を宣言する
	private int hp;
	private int mp;
	private int attack;
	private int speed;
	private int defense;
	// コンストラクタでステータスを初期値を設定する
	public Hero() {
		super();
		Random random = new Random();
		this.hp = random.nextInt(1000);
		this.mp = random.nextInt(1000);
		this.attack = random.nextInt(1000);
		this.speed = random.nextInt(1000);
		this.defense = random.nextInt(1000);
	}
	// showStatusメソッドで出力する
	public void showStatus() {
		System.out.println("HP:" + this.hp);
		System.out.println("MP:" + this.mp);
		System.out.println("攻撃力:" + this.attack);
		System.out.println("素早さ:" + this.speed);
		System.out.println("防御力:" + this.defense);
		
	}
	// helloメソッド（Heroクラスのあいさつ）
	public void hello() {
		System.out.println();
		System.out.println("さあ冒険にでかけよう！");
		
	}
}


