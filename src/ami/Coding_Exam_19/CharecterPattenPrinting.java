package ami.Coding_Exam_19;

import java.util.Scanner;

public class CharecterPattenPrinting {
	
	static void PrintName() {
		String str = "GLOBANT" ;
	char [] ch= str.toCharArray();
	for (int i = 0; i < ch.length; i++) {
        for (int j = 0; j <= i; j++) {
            System.out.print(ch[j] + " ");
        }
        System.out.println();
    }
    
    for (int i = ch.length -2; i >= 0; i--) {
        for (int p = 0; p <= i ; p++) {
            System.out.print(ch[p]+ " ");
        }
        System.out.println();
    }
    
	}
	
    public static void main(String[] args) {
    	PrintName();
        
	}
}


