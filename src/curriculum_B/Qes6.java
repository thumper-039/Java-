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
	
	 Scanner scan = new Scanner(System.in);
		String item = scan.nextLine();
		
	   String[] itemBox = item.split("、");
	   int tvRandom = new java.util.Random().nextInt(12);
	   
	   for(String items : itemBox) {
		   int nokori = new java.util.Random().nextInt(12);
		   
		   switch (items) {
		   
		   //パソコン、冷蔵庫、扇風機、洗濯機、加湿器　の残り台数は〇台です
		   case"パソコン":
		   case"冷蔵庫":
		   case"扇風機":
		   case"洗濯機":
		   case"加湿器":
			
		     System.out.println(items +"の残り台数は"+nokori+"台です");   
		   
		   break;
		   
		 //テレビ、ディスプレイ　の残り台数は〇台です
		   case"テレビ":
		   case"ディスプレイ":
			   
		     System.out.println(items +"の残り台数は"+tvRandom+"台です"); 
			   
		   break;
			  
		 //『 その他商品 』は指定の商品ではありません
		   default:
				   
			  System.out.println("『"+ items +"』は指定の商品ではありません");
			
		   }
	   }
	}
}
	

