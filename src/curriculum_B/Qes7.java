package curriculum_B;

import java.util.Scanner;

public class Qes7 {
	
	public static void main(String[] args) {
	
	/*7
	 * N人の生徒の成績を管理するプログラムを下記条件で作成してください
	 */
	
	//生徒の人数を入力してください（2以上）: 2
		System.out.print("生徒の人数を入力してください(2以上):");
	
        Scanner scan = new Scanner(System.in);
		int students = scan.nextInt();
		
		//〇人目の『英語』の点数を入力してください :10
		//〇人目の『数学』の点数を入力してください :10
		//〇人目の『理科』の点数を入力してください :10
		//〇人目の『社会』の点数を入力してください :10
		
		int [] studentBox = new int[students];
		String [] kamoku = {"英語","数学","理科","社会"};
		int [][]tensuu =new int [students][kamoku.length];

		int i ;
		int j ;
		
	    for (i=0; i<studentBox.length;i++) {
	    	
	    	studentBox[i] = i+1;
	    	
	    	for(j=0;j<kamoku.length;j++){
	    		
	    	System.out.print(studentBox[i]+"人目の『"+kamoku[j]+"』の点数を入力してください:");
	    	
	    	tensuu[i][j]= scan.nextInt();
	    	
	     }
	    }
	  //〇人目の平均点は10.00点です。
		
	    	 for (i=0; i<studentBox.length;i++) {
		    	 int total = 0 ;	
		    	for(j=0;j<kamoku.length;j++){
		        total += tensuu[i][j];
		    	
		    	}
		    	
	   	     double heikin = (double)total / kamoku.length ;
	   	     System.out.printf(studentBox[i]+"人目の平均点は%.2f点です。",heikin);	
	   	     System.out.println();
	   	   
	         }
	    	 
	    	 //〇〇の平均点は10.00点です。		 
	    		 int subTotal = 0;
	    		 for(j=0;j<kamoku.length;j++){
	    		 for (i=0; i<studentBox.length;i++) {
	    			 
	    		subTotal += tensuu[i][j];	 
	    		
	    		 }
	    		 
	    		 double subHeikin = (double)subTotal / students;
	    		 System.out.printf(kamoku[j]+"の平均点は%.2f点です。",subHeikin);	
	    		 System.out.println();
	    		 
	    	} 
	       }
          }

	
	
	

