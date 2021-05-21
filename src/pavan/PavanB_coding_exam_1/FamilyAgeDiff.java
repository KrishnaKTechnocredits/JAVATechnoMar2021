package pavan.PavanB_coding_exam_1;

import java.util.Scanner;

public class FamilyAgeDiff {

	int getMaxAge(int[]arg){
		int maxage= arg[0];
		for(int index=0;index<arg.length;index++) {
			if(arg[index]>maxage)
				maxage=arg[index];
		}return maxage;
	}
	
	int getMinAge(int[]arg){
		int minage= arg[0];
		for(int index=0;index<arg.length;index++) {
			if(arg[index]<minage)
				minage=arg[index];		
		}return minage;
	}

	void getDiffAge(int maxagef, int minagef) {
		int diff= maxagef-minagef;
		System.out.println("Diffrence between younger and older family member is "+diff);
	}
	
	public static void main(String[] args) {
		int[]fammem= {7,12,56,62,25};
		FamilyAgeDiff familyAgeDiff= new FamilyAgeDiff();
		int maxfage=familyAgeDiff.getMaxAge(fammem);
		int minfage=familyAgeDiff.getMinAge(fammem);
		familyAgeDiff.getDiffAge(maxfage, minfage);	
	}

}
