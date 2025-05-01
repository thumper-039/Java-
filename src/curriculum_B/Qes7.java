package curriculum_B;

import java.util.Scanner;

public class Qes7 {

	public static void main(String[] args) {

		/*7
		 * N人の生徒の成績を管理するプログラムを下記条件で作成してください
		 */

		// 生徒の人数を入力してください（2以上）: 2
		System.out.print("生徒の人数を入力してください(2以上):");

		// ユーザーの入力を受け取る
		Scanner scan = new Scanner(System.in);
		// 入力された値をstudentsに代入する
		int students = scan.nextInt();

		// 〇人目の『英語』の点数を入力してください :10
		// 〇人目の『数学』の点数を入力してください :10
		// 〇人目の『理科』の点数を入力してください :10
		// 〇人目の『社会』の点数を入力してください :10

		// 生徒数の配列
		int [] studentBox = new int[students];
		// 科目の配列
		String [] kamoku = {"英語","数学","理科","社会"};
		// 生徒と教科の二次元配列 // kamoku.length→科目数
		int [][]tensuu =new int [students][kamoku.length];

		// 生徒をカウントする
		int i ;
		// 科目をカウントする
		int j ;

		// 生徒をカウント
		for (i=0; i<studentBox.length;i++) {

			// studentBox[i]は0から始まるから、+1にして人数をカウントする
			studentBox[i] = i+1;

			// 科目をカウント（一人ずつ順番に科目の点数が入力できるようにする）
			for(j=0;j<kamoku.length;j++){

				// studentBox[i]で何人目か、kamoku[j]で科目を順番に出力していく
				System.out.print(studentBox[i]+"人目の『"+kamoku[j]+"』の点数を入力してください:");

				// 生徒と教科ごとに入力された点数をtensuu[i][j]に代入する
				tensuu[i][j]= scan.nextInt();

			}
		}
		//〇人目の平均点は10.00点です。

		// 生徒をカウント
		for (i=0; i<studentBox.length;i++) {
			// 点数の合計を初期化する（0）
			int total = 0 ;	
			// 科目をカウント 
			for(j=0;j<kamoku.length;j++){
				// totalに点数を足していって合計点を出す
				total += tensuu[i][j];
			}
			// 点数の合計（total）を科目数（kamoku.length）で割って平均点を出す
			// 小数点第二位まで表示するため、int型をdouble型に変更する
			double heikin = (double)total / kamoku.length ;
			// printf("%f〇",△△)で少数点第二位まで出力する
			System.out.printf(studentBox[i]+"人目の平均点は%.2f点です。",heikin);	
			// 改行
			System.out.println();
		}
		//〇〇の平均点は10.00点です。	
		//科目をカウント
		for(j=0;j<kamoku.length;j++){
			// 科目の合計点の初期化（0）
			int subTotal = 0;
			// 生徒をカウント
			for (i=0; i<studentBox.length;i++) {
				// subTotalに科目ごとの点数を足して合計点を出す
				subTotal += tensuu[i][j];
			}
			// 科目ごとの合計点（subTotal）を人数（students）で割って平均点を出す
			// 小数点第二位まで表示するため、int型をdouble型に変更する
			double subHeikin = (double)subTotal / students;
			// printf("%f〇",△△)で少数点第二位まで出力する
			System.out.printf(kamoku[j]+"の平均点は%.2f点です。",subHeikin);	
			// 改行
			System.out.println();
		}
		// 全体の合計点の初期値を設定（0）
		int all = 0;
		// 科目をカウント
		for(j=0;j<kamoku.length;j++){
			// 生徒をカウント
			for (i=0; i<studentBox.length;i++) {
				// 全部の点数を足す
				all += tensuu[i][j];
			}
		}
		// 全部の点数を人数×科目数で割って平均点を出す
		double allHeikin = (double)all / (students*kamoku.length);
		// printf("%f〇",△△)で少数点第二位まで出力する
		System.out.printf("全体の平均点は%.2f点です。",allHeikin);	
	}
}
