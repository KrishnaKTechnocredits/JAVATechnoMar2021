/*
 *
 print the following pattern.
G
G L
G L O
G L O B
G L O B A
G L O B A N
G L O B A N T
 */
package rupali.codingexam.exam19;

public class Pattern1 {
	public static void main(String[] args) {
		String 	str="GLOBANT";
		for(int i=0;i<str.length()+1;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(str.charAt(j));
			}
			System.out.println();
		}
	}

}
