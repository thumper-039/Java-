package curriculum_B;

import java.util.Scanner;

public class Qes1_3 {

	public static void main(String[] args) {

		/*1
		 * ログイン時の入力チェックシステムを下記条件で作成してください
		 */

		// コンソールにユーザー名を入力できるようにしてください

		// nameをString型で宣言する
		String name;
		// ユーザーの入力を受け取る
		Scanner scan = new Scanner(System.in);

		// do-while文
		do {
			System.out.println("ユーザー名を入力してください");
			// 入力された値をnameに代入する
			name = scan.nextLine();

			// ユーザー名の文字数が10文字より大きい場合「名前を10文字以内にしてください」と出力してください
			// 入力されたnameの文字数が10より大きかったら「名前を10文字以内にしてください」を出力する
			if (name.length() > 10 ) {
				System.out.println("「名前を10文字以内にしてください」");

				// ユーザー名の文字数が0文字以下もしくはnullの場合「名前を入力してください」と出力してください
				// 入力されたnameの文字数が0文字以下もしくはnullの場合「名前を入力してください」と出力する
			}else if(name.length()<=0 || name == null) {
				System.out.println("「名前を入力してください」");

				/*2
				 * ユーザー名が半角英数字以外の場合「半角英数字のみで名前を入力してください」と出力してください
				 */

				// nameがnull以外、かつ半角英数字以外の時に半角英数字(name.matches("^[a-zA-Z0-9]+$"))のみで名前を入力してください」を出力する
			}else if(name != null && !name.matches("^[a-zA-Z0-9]+$")) {
				System.out.println("「半角英数字のみで名前を入力してください」");

				// ユーザー名が正常な値だった場合「ユーザー名「 入力したユーザー名 」を登録しました」と出力してください
				// その他の場合
			}else{
				// ifの条件式に当てはまらなくなったらdo-while文から抜ける
				break;

			}

			// ifの条件式に当てはまったら繰り返す
		}while(true);

		/*3
		 * じゃんけんのシステムを下記の条件で作成してください
		 */
		// 「0はグー、1：チョキ、2：パー」とすること
		// じゃんけんに勝つまでループすること
		// 一回ごとに自分の手と相手の手を下記の通り出力してください

		//ユーザー名「name」を登録しました
		System.out.println("「ユーザー名「"+ name +"」を登録しました」");
		System.out.println("じゃんけんをします。0～2の数字を入力してください。");


		// じゃんけんの回数をカウントするための変数
		int count = 0 ;

		// do-while文
		do {

			//じゃんけんをするたびにカウントしていく
			count ++ ;

			int nameNum = Integer.parseInt(scan.nextLine());

			/*配列 
			 * String [] nameHand = new String [3];
			 * nameHand[0] = "グー"
			 *nameHand[1] = "チョキ"
			 *nameHand[2] ="パー"
			 */

			//nameの手は「パー」
			String [] nameHand = {"グー","チョキ","パー"};
			System.out.println(""+ name +"の手は「"+nameHand[nameNum]+"」");

			//相手の手は「グー」
			// 相手の手は0～2のなかからランダムで値を決めて、aiteNumに代入
			int aiteNum = new java.util.Random().nextInt(3);
			// 相手の手を配列にする（0→グー1→チョキ2→パー）
			String [] aiteHand = {"グー","チョキ","パー"};
			// aiteHand[aiteNum]　配列の要素を出力する
			System.out.println("相手の手は「"+aiteHand[aiteNum]+"」");
			// 1行空ける
			System.out.println();

			//自分がじゃんけんに勝った場合、下記が出力されるようにしてください
			// もし自分がじゃんけんに勝った場合（0かつ１または1かつ2、2かつ0）
			if((nameNum == 0 && aiteNum == 1) || (nameNum == 1 && aiteNum == 2) || (nameNum == 2 && aiteNum == 0)) {
				//やるやん。
				System.out.println("やるやん。");
				//次は俺にリベンジさせて
				System.out.println("次は俺にりべんじさせて");

				// 勝ったら繰り返しから抜ける
				break;

				//・自分がじゃんけんでグーに負けた場合、下記が出力されるようにしてください
				// じゃんけんにグーで負ける場合（自分0かつ相手2）の場合
			}else if (nameNum == 0 && aiteNum == 2) {

				//俺の勝ち！
				System.out.println("俺の勝ち！");
				//負けは次につながるチャンスです！
				System.out.println("負けは次につながるチャンスです！");
				//ネバーギブアップ！
				System.out.println("ネバーギブアップ！");

				//・自分がじゃんけんでチョキに負けた場合、下記が出力されるようにしてください
				// じゃんけんにチョキで負ける場合（自分1かつ相手0）
			}else if(nameNum == 1 && aiteNum == 0) {
				//俺の勝ち！
				System.out.println("俺の勝ち！");
				//たかがじゃんけん、そう思ってないですか？
				System.out.println("たかがじゃんけん、そう思ってないですか？");
				//それやったら次も、俺が勝ちますよ
				System.out.println("それやったら次も、俺が勝ちますよ");

				//・自分がじゃんけんでパーに負けた場合、下記が出力されるようにしてください
				// じゃんけんにパーで負ける場合（自分2かつ相手1）
			}else if (nameNum == 2 && aiteNum == 1){
				//俺の勝ち！
				System.out.println("俺の勝ち！");
				//なんで負けたか、明日まで考えといてください。
				System.out.println("なんで負けたか、明日まで考えといてください。");
				//そしたら何かが見えてくるはずです
				System.out.println("そしたら何かが見えてくるはずです");

				//・あいこの場合、下記が出力されるようにしてください
				// その他の場合（あいこ）
			}else {
				//DRAW あいこ もう一回しましょう！
				System.out.println("DRAW あいこ もう一回しましょう！");
			}

			// ifの条件式に当てはまったら繰り返す
		}while (true);

		//じゃんけんを行った回数を表示してください
		//勝つまでにかかった合計回数は1回です
		System.out.println();
		System.out.println("勝つまでにかかった合計回数は "+ count +"回です");

	}
}