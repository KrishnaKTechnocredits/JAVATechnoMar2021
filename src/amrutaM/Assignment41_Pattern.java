package amrutaM;
/*Write a code to print below pattern.
*
##
***
####
******/

public class Assignment41_Pattern {

	public static void main(String[] args) {
		for(int index=1; index<=5;index++) {
			if(!(index%2==0)) {
				for(int inner = 1;inner<=index;inner++) {
					System.out.print("* ");
				}
			}else {
				for(int inner = 1;inner<=index;inner++) {
					System.out.print("# ");
				}
			}
			System.out.println();
			
		}
	}
}
