package twenty_nine_shori;

// ソートを使用するためのインポート
import java.util.Arrays;
// 降順用のインポート
import java.util.Collections;

// Shoriクラスを継承した子クラスsubShoriクラス
public class SubShori extends Shori {

	// 空のコンストラクタ（受け取る引数がないため）
	public SubShori () {

	}

	public void  sort (String order) {
		// もし昇順と入力された場合（文字型は==ではなくorder.equals("〇〇")）
		if (order.equals("昇順")) {
			// ソート（numBoxを昇順に並べ替える）
			Arrays.sort(numBox); 

			// もし降順と入力されたら
		} else if (order.equals("降順")) {

			// int型のままだと降順できないためIntger型に変換する
			Integer[] integerNumBox = Arrays.stream(numBox).boxed().toArray(Integer[]::new);
			// 値を降順に並べる
			Arrays.sort(integerNumBox, Collections.reverseOrder());		 

			// 並び変えた値を順番にnumBoxに入れていく
			for (int i = 0; i < integerNumBox.length; i++) {
				numBox[i] = integerNumBox[i];
			}

			/* 

        ☆昇順の値を受け取ってから反転させる☆

		Arrays.sort(numBox);

		 // 先頭と後ろの値を順番に入れ替えているため、iは半分だけでOK（numBox.length / 2）
		for (int i = 0; i < numBox.length / 2; i++) {
			 int desc = numBox[i];
			 // 後ろから順番にnumBoxに代入していく
			    numBox[i] = numBox[numBox.length - 1 - i];
			    numBox[numBox.length - 1 - i] = desc;
			 */

		}

	}	


}

