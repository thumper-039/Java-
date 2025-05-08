package curriculum_New_question;

import java.util.Scanner;

public class Curriculum_New_1_18 {

	// Q1：引数に文字列型と整数型をいれてコンソールに「Hello JavaSE 11」と出力するメソッドを作成してください。
	public static void firstQes (String mojiretu, int seisuu) {
		System.out.println(mojiretu + seisuu);

	}

	// Q2：引数に整数を渡すと渡した値同士を乗算しコンソールに出力するメソッドを作成してください
	// 引数 kakerareruNum,kakeruNumをうけとる
	public static void secondQes (int kakerareruNum , int kakeruNum) {
		// 引数を使った処理
		System.out.println(kakerareruNum +" × "+ kakeruNum +" = "+ kakerareruNum * kakeruNum);
	}

	// Q3：引数として整数の配列を渡すと、受け取った値を順番にコンソールに出力するメソッドを作成してください
	// 引数として配列nyuuryokuNumをうけとる
	public static void thirdQes (int [] nyuuryokuNum) {

		// 配列を使った処理
		for (int i = 0 ; i <nyuuryokuNum.length ; i++) {
			System.out.print(nyuuryokuNum[i]);
			if (i <  nyuuryokuNum.length - 1) {
				System.out.print(",");
			}

		}
		// 改行
		System.out.println();
	}

	// Q4：Q2をオーバーロードして引数を小数2つに変更し、引数同士を和算しコンソールに出力してください。
	public static void forthQes (double kakerareruNum , double kakeruNum) {
		System.out.println(kakerareruNum +" + "+ kakeruNum +" = "+ ( kakerareruNum + kakeruNum ));

	}

	// Q5：引数に整数を渡すと、1～100までのランダムな数字を引数の回数分格納して
	// 格納した値を順番にコンソールで出力後、格納した値を返すメソッドを作成してください。
	// ※0は出力＆格納しないようにしてください。

	// 戻り値を渡すint[] fiveQes、引数を受け取るint count
	public static int[] fiveQes (int count) {
		// 引数を受け取る用の配列（count数分）
		int[] randomNum = new int  [count];
		// count数分ランダムで数字を出力する
		for (int i = 0 ; i < count ;i++) {
			int num = new java.util.Random().nextInt(100) + 1;

			System.out.print(num);
			// ランダムで出力された整数をrandomNumに格納する
			randomNum[i] = num ;

			// 数字を,で区切る
			if(i < count - 1) {
				System.out.print(",");
			}

		}
		// 改行
		System.out.println();

		// ランダムな数字の配列を返り値にする
		return randomNum ;

	}

	// Q6：引数にQ5で作成したメソッドの返り値を受け取り、受け取った配列の要素の平均値をコンソールに出力するメソッドを作成してください。
	// ※小数点以下も表示されるようにしてください。

	// double型の戻り値あり、int型の引数をうけとるメソッド
	public static double sixQes (int count) {

		// Q5 引数countを渡してfiveQesを呼び出す→返り値（randomNum）をうけとる
		int[] box = fiveQes(count);

		// totalを初期化し、ランダムに出力された整数を拡張for文で足していく
		int total = 0 ;
		for (int random : box) {

			total += random ;
		}

		// int型からdouble型に変換し、平均値を出す
		double heikinti = (double)total / count ;
		System.out.println("配列の平均値："+heikinti);


		// 平均値を返り値とする
		return heikinti ;


	}



	// Q7：引数にQ6で作成したメソッドの返り値を受け取り、受け取った値が50以上ならばtrueそれ以外はfalseを返しコンソールに出力してください

	// 引数countをうけとるメソッド
	public static void sevenQes (int count) {

		// Q6　引数countを渡してsixQesを呼び出し、返り値として平均値(heikinti)をsuujiに受けとる
		double suuji = sixQes (count);

		if(suuji>= 50) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}



	}

	public static void main(String[] args) {
		// 作成したメソッドをここで呼び出してください

		// Q1
		// helloJavaメソッドに渡すデータ（mojiretu）
		String hello = "Hello JavaSE ";
		// helloJavaメソッドに渡すデータ（mojiretuとseisuu）
		firstQes(hello, 11);

		// Q2
		// 値を入力できるようにする
		Scanner scan = new Scanner(System.in);
		System.out.print("数字を入力してください（かけられる数）");
		// 入力された値を受け取る（kakerareruNum）
		int num = scan.nextInt();
		System.out.print("数字を入力してください（かける数）");
		// 入力された値を受け取る（kakeruNum）
		int secondNum = scan.nextInt();
		// 引数numとsecondNumを渡してsecondQesメソッドを呼び出す
		secondQes(num , secondNum);


		//Q3
		// ユーザーの入力する整数を文字列型として受け取る
		scan.nextLine();
		System.out.print("整数を,で区切って入力してください");
		String hairetu = scan.nextLine();
		// カンマ区切りで文字列型の配列に格納する
		String[] hairetuBox = hairetu.split(",");
		// 文字列型の配列から整数型の配列に変換する
		int[] nyuuryokuNum = new int[hairetuBox.length];

		// for文で順番に整数を出力する
		for (int i = 0; i < hairetuBox.length; i++) {
			// 文字列を整数に変換する
			nyuuryokuNum[i] = Integer.parseInt(hairetuBox[i].trim());
		}
		// 引数nyuuryokuNumを渡してthirdQesメソッドを呼び出す
		thirdQes(nyuuryokuNum);

		// Q4
		System.out.print("少数を入力してください(足される数)");
		// 入力された値を受け取る（kakerareruNum）
		double thirdNum = scan.nextDouble();
		System.out.print("少数を入力してください(足す数)");
		// 入力された値を受け取る（kakeruNum）
		double forthNum = scan.nextDouble();
		// forthQesメソッドにデータを渡す
		forthQes(thirdNum , forthNum);

		// Q7に渡す引数count（Q5で使う)
		System.out.print("整数を入力してください(ランダムな整数を出します)");
		int count = scan.nextInt();
		//引数countを渡してsevenQesメソッドを呼び出す
		sevenQes (count);

	}

}
