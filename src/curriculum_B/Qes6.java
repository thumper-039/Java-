package curriculum_B;

import java.util.Scanner;

public class Qes6 {

	public static void main(String[] args) {

		/*6
		 * 入力した商品の残り台数が出力されるシステムを下記の条件で作成してください
		 */

		//入力例↓↓
		//パソコン、冷蔵庫、扇風機、洗濯機、加湿器、テレビ、ディスプレイ、その他商品

		System.out.print("商品を入力してください");

		// ユーザーの入力を受け取る
		Scanner scan = new Scanner(System.in);
		// 入力された値をitemに代入する
		String item = scan.nextLine();

		// itemをカンマで区切って配列に入れる
		String[] itemBox = item.split("、");
		// テレビ、ディスプレイの残り台数を0~11の乱数で決めて、tvRandomに代入する
		int tvRandom = new java.util.Random().nextInt(12);

		// 拡張for文で、入力された文字を一つずつ出力していく
		for(String items : itemBox) {
			// パソコン、冷蔵庫、扇風機、洗濯機、加湿器の残り台数を0~11の乱数で決めて、nokoriに代入する
			int nokori = new java.util.Random().nextInt(12);

			//switch文で分岐を作ってそれぞれの処理を実行する
			switch (items) {

			//パソコン、冷蔵庫、扇風機、洗濯機、加湿器　の残り台数は〇台です
			// パソコン、冷蔵庫、扇風機、洗濯機、加湿器 の場合の処理
			case"パソコン":
			case"冷蔵庫":
			case"扇風機":
			case"洗濯機":
			case"加湿器":

				System.out.println(items +"の残り台数は"+nokori+"台です");   

				// switchを抜ける
				break;

				// テレビ、ディスプレイ　の残り台数は〇台です
				// テレビ、ディスプレイの場合の処理
			case"テレビ":
			case"ディスプレイ":

				System.out.println(items +"の残り台数は"+tvRandom+"台です"); 

				// switchを抜ける
				break;

			//『 その他商品 』は指定の商品ではありません
			// パソコン、冷蔵庫、扇風機、洗濯機、加湿器、テレビ、ディスプレイ以外の場合
			default:

				System.out.println("『"+ items +"』は指定の商品ではありません");

			}
		}
	}
}


