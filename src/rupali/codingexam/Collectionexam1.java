/*
 * Test - 15 : 28th May'2021

Return first repeating and non repeating word from given input.

String str = "Hi Maulik Techno Maulik Credits Techno Maulik Hello Hi";
output : Hi Credits
 */
package rupali.codingexam;
import java.util.*;
public class Collectionexam1 {
	public String getduplicatename(String input) {
		String[] temp=input.split(" ");
		String temp1="",temp2="",output="";
		boolean nonrepeating=false,repeating=false;
		ArrayList<String> namelist=new ArrayList<String>(Arrays.asList(temp));
		
		for(int index=0;index<namelist.size();index++) {
			if(namelist.indexOf(namelist.get(index))!= namelist.lastIndexOf(namelist.get(index)) && !nonrepeating) {
			temp1=namelist.get(index);
			nonrepeating=true;
			}else if(namelist.indexOf(namelist.get(index))== namelist.lastIndexOf(namelist.get(index)) &&(!repeating)){
				temp2=namelist.get(index);
				repeating=true;
			}
		}
		output=temp1+" "+temp2;
		return output;
	}
	
	public static void main(String[] args){
		Collectionexam1 collectionexam1=new Collectionexam1();
		String input="Hi Moulik Techno Moulik Credits Techno Moulik Hello Hi";
		String output= collectionexam1.getduplicatename(input);
		System.out.println(output);
	}
}

