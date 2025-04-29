package curriculum_B;

public class Qes5 {
	
	
	public static void main(String[] args) {
		
		/*5
		 * for文を使用して下記の通りに出力してください
		 */

		
		//最初の繰り返し
		for(int secondNum=1;secondNum<10;secondNum++) {
		  //繰り返しの中の繰り返し
		  for (int firstNum=1;firstNum<21;firstNum++) {
			
			int kakezan = firstNum*secondNum;
			//String.format("%03d", i)　←　3桁に0詰め（ゼロパディング）
			System.out.print(String.format("%03d", firstNum )+" * "+String.format("%03d", secondNum)+ " = " +String.format("%03d", kakezan));
			
			// ||は19の後ろまでつける
			if (firstNum < 20) {
			System.out.print(" || ");
			//secondNumが20までいったら改行する
		    }else{
			System.out.println();	
			
		    }
			
		    }
		    }
	}
}
