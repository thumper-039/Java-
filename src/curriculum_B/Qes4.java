package curriculum_B;

public class Qes4 {
	
	public static void main(String[] args) {
	
	/*4
	 * for文を使用して下記の通りに出力してください
	 */
	
	//最初の繰り返し
	for(int firstNum=1;firstNum<10;firstNum++) {
	  //繰り返しの中の繰り返し
	  for (int secondNum=1;secondNum<10;secondNum++) {
		
		int kakezan = firstNum*secondNum;
		//String.format("%02d", i)　←　2桁に0詰め（ゼロパディング）
		System.out.print(String.format("%02d", firstNum )+" * "+String.format("%02d", secondNum)+ " = " +String.format("%02d", kakezan));
		
		//secondNumが9になったら||いらない
		if (secondNum < 9) {
		System.out.print(" || ");
		//secondNumが9までいったら改行する
	    }else{
		System.out.println();	
		
	}
   }
  }
 }
}


	
