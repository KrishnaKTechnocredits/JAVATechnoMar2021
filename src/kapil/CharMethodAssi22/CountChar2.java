/*Assignment - 22 : 16th April'2021

Create a class with following functionality. [Estimated time: 40 mins]
a) Find one character frequency from given name.
Input: name - technocredits
character - e
Output : e -> 2 time in technocredits

b) Find all character frequency from given name.
Input: name - aakanksha
Output : a -> 4
k -> 2
n -> 1
s -> 1
h -> 1

c) Find all character frequency from each name given in String array.
Input : Array -> {"raj", "aarya", "aavruti", "shruti"}
Output : r -> 1 time in raj
a -> 1 time in raj
j -> 1 time in raj
=====================
a -> 3 time in aarya
r -> 1 time in aarya
y -> 1 time in aarya
====================
And so on.... -------------------------------*/
package kapil.CharMethodAssi22;

public class CountChar2{
	
	void getCharFreq(String str) {
		int count = 0;
		char Targetch = 'e';
		int length = str.length();
		for(int index =0; index<length; index++) {
			if(str.charAt(index) == Targetch)
			count++;
	}	
		System.out.println("Target Character e count = "+count);			
	}
	public static void main(String[] args) {
		CountChar2 countchar2 = new CountChar2();
		countchar2.getCharFreq("technocredits");
	}
}




































