//★★
package day05;

/*
	숙제 01 ]
 2 x  1 =  2	3 x  1 =  3		4 x  1 =  4		5 x  1 =  5
 2 x  2 =  4	3 x  2 =  6		4 x  2 =  8		5 x  2 =  10
 2 x  3 =  6	...
 2 x  4 =  8
 2 x  5 = 10
 2 x  6 = 12
 2 x  7 = 14
 2 x  8 = 16
 2 x  9 = 18 	3 x  9 =  27
 
 6 x  1 = 6 	7 x  1 = 7		8 x  1 = 8		9 x  1 = 9
 
 ....
 6 x  9 = 54 	7 x  9 = 63		8 x  9 = 72		9 x  9 = 81
 */

public class Homework01 {

	public static void main(String[] args) {
		int dan, gop;
		
		for(int j= 0; j<9 ;j++) {
			for(int i =1 ; i<9 ; i++) {
				dan = i+1;
				gop = j+1;
				System.out.printf(" %3d x %3d = %3d ", dan, gop , dan*gop);
				

				}
			System.out.println();
		}
		
		
		

	}

}
