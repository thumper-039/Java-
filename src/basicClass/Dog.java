package basicClass;

public class Dog {

		
		// Q1：フィールドに動物の名前の変数を定義してください。
		String animalName ;
		
		// Q2：フィールドに動物の数の変数を定義してください。
		int animalNum ;
		
		// Q3：Q1で作成した変数に「犬」を代入するコンストラクタを作成してください。
		public Dog () {
			// animalNameの変数に犬を代入する。
			animalName = "犬";
			
		}
		
		// Q4：Q2で作成した変数に引数を代入するコンストラクタを作成してください。
		// コンストラクタに引数を設定。
		public Dog (int num) {
			// 受け取った値をanimalNumに代入する。
			animalNum = num ;
			
		}


	}

