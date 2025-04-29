package curriculum_A;

public class Qes1_13 {

	public static void main(String[] args) {
		
		/*1
		 * 下記9個をローカル変数として宣言のみしてください
		 */
		
		byte by;
		short sh;
		int in;
		long lo;
		float fl;
		double dou;
		char ch;
		String st;
		boolean bo;
		
		/*2
		 * それぞれのローカル変数をローカル内でそれぞれの初期値を代入し初期化してください
		 */
		
		by = 0;
		sh = 0;
		in = 0;
		lo = 0L;
		fl = 0.0f;
		dou = 0.0d;
		ch = '\u0000';
		st =null;
		bo = false;
		
		/*3
		 * 初期化をしたそれぞれの変数に下記の値を代入してください
		 */
		
		by = 10;
		sh = 100;
		in = 1000;
		lo = 10000L;
		fl = 9.5F;
		dou = 10.5;
		ch = 'a';
		st = "ハロー";
		bo = true;
		
		/*4
		 * 下記の通りにコンソール出力されるようにしてください
		 */
		
		//11110
         System.out.println(by + sh + in + lo);	
         //20
         System.out.println(by + by);
         //a ハロー true
         System.out.println(ch + st + bo);
         //11130(数字を全て足す)
         System.out.println(by + sh + in + lo + fl + dou);
         //10000000000(小数点以外の数字を全てかける)
         System.out.println(by * sh * in * lo);
		//0.105(10.5割る100をする)
         System.out.println(dou / 100);
         //-90(10引く100をする)
         System.out.println(by - 100);
         
         /*5
          *「ハローJAVA43」
          */
         
         int num=20;
         int num1=23;
         System.out.println("ハローJAVA"+(num+num1));
		
         /*6
          * 『山田太郎 18歳 170.5cm 62.2kg 寿司』
          */
         
         String name = "山田太郎";
         int age = 18;
         double sin = 170.5;
         double tai = 62.2;
         String tab = "寿司";
         //「初めまして○○です」
         System.out.println("初めまして" + name + "です");
         //「年齢は○○歳です」
         System.out.println("年齢は" + age + "歳です");
         //「身長は○○cmです」
         System.out.println("身長は" + sin + "cmです");
         //「体重は○○kgです」
         System.out.println("体重は" + tai + "kgです");
         //「好きな食べ物は○○です」
		System.out.println("好きな食べ物は"+ tab +"です");
		
		/*7
		 * 6で作成した自己紹介に続いてBMIが出力されるようにしてください
		 */
		
		//「BMIは○○です」
		double bmi =  tai / ((sin / 100) * (sin / 100));
		   //10倍する
        bmi = bmi * 10;
          //Math.roundメソッドで四捨五入する
        long after = Math.round(bmi);
          //取得した値をdouble型にキャストして10で割る
		System.out.println("BMIは" + ((double)after/10) + "です");
		
		/*8
		 * 6で宣言した変数に再代入し下記の通りコンソールに出力してください
		 */
		
	    name = "鈴木一郎";
        age = 24;
         int originalAge = age ; //最初の値を保存(問11でつかう)
        sin = 168.5;
         double originalSin = sin ;//最初の値を保存
        tai = 64.2;
         double originalTai = tai ;//最初の値を保存
        tab = "オムライス";
        //「初めまして鈴木一郎です」
        System.out.println("はじめまして" + name + "です");
        //「年齢は24歳です」
        System.out.println("年齢は" + age + "歳です");
        //「身長は168.5cmです」
        System.out.println("身長は" + sin + "cmです");
        //「体重は64.2kgです」
        System.out.println("体重は" + tai + "kgです");
        //「好きな食べ物はオムライスです」
		System.out.println("好きな食べ物は"+ tab +"です");
		//BMIは22.6です
		double sBmi =  tai / ((sin / 100) * (sin / 100));
		  //10倍する
        sBmi = sBmi * 10;
          //Math.roundメソッドで四捨五入する
        double sAfter = Math.round(sBmi);
          //取得した値をdouble型にキャストして10で割る
		System.out.println("BMIは" + ((double)sAfter/10) + "です");
		
		/*9
		 * 8で使用した変数【年齢・身長・体重】の数値を和算で自己代入し、下記の通りコンソールに出力してください
		 */
		
		age = age + 24 ;
		sin = sin + 168.5 ;
		tai = tai + 64.2 ;
		
		
	    //「初めまして鈴木一郎です」
        System.out.println("はじめまして" + name + "です");
        //「年齢は48歳です」
        System.out.println("年齢は" + age + "歳です");
        //「身長は337.0cmです」
        System.out.println("身長は" + sin + "cmです");
        //「体重は128.4kgです」
        System.out.println("体重は" + tai + "kgです");
        //「好きな食べ物はオムライスです」
		System.out.println("好きな食べ物は"+ tab +"です");
		//BMIはBMIは11.31ですです
		double newBmi =  tai / ((sin / 100) * (sin / 100));
		  //10倍する
        newBmi = newBmi * 10;
          //Math.roundメソッドで四捨五入する
        double newAfter = Math.round(newBmi);
          //取得した値をdouble型にキャストして10で割る
		System.out.println("BMIは" + ((double)newAfter/10) + "です");
	
		
		/*10
		 * 8で使用した年齢が25歳以上ならtrueが出力されるようにしてください。ただしif文は使いません
		 */
		age = originalAge ;//元の値を代入
		
		boolean isOverTwentyFive;
		int tage = age;
		isOverTwentyFive = (age>=25);
		System.out.println(isOverTwentyFive);
		
		/*11
		 * 8で使用した【年齢・身長・体重】を文字列型に型変換し繋げて出力してください
		 */
		sin = originalSin;//元の値を代入
		tai = originalTai;//元の値を代入
		
		String ageSt = String.valueOf(age);
		String sinSt = String.valueOf(sin);
		String taiSt = String.valueOf(tai);
		System.out.println(ageSt + ageSt + taiSt);
		
		/*12
		 * 11で変換した【年齢・身長】を整数型に変換して出力してください
		 */
		
		int ageInt = Integer.parseInt(ageSt); //文字列型を整数方に変換
		int sinCast = (int) sin; // double型からint型にキャスト（整数部分のみ）
		int sinInt = (int) sinCast; // sin を整数型に変換

		System.out.print(ageInt);
		System.out.println(sinInt);
		
		/*13
		 * 12で変換した【年齢・身長】で【年齢が25もしくは身長が160以上】であればtrueを出力してください
		 */
		
		boolean result = (ageInt >= 25 || sinInt >= 160.0);// 条件を満たすかどうかを判定（年齢が25以上、または身長が160cm以上ならtrue）
		System.out.println(result);//結果を出力（条件が満たされていればtrue、そうでなければfalseが表示さる）
	}

}
	
