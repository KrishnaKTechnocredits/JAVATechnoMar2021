package monika.Assignment22_FindFreqOfChar_String_Array;
/*Create a class with following functionality. [Estimated time: 40 mins]
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
         And so on....	-------------------------------*/
public class FrequencyOfCharInStringAndArray {
	void getFreqOfCharInString(String input) {
		int count =0;
		for(int index=0;index<input.length();index++) {
			if(input.charAt(index) == 'e')
				count++;
		}
		System.out.println("Count of char e : "+count);
	}
	
	void getFreqOFAllChar(String input) {
		int aCount = 0,kCount = 0,nCount = 0,sCount = 0, hCount = 0;
		for(int index=0;index<input.length();index++) {
			if(input.charAt(index) == 'a')
				aCount++;
			else if(input.charAt(index) == 'k')
				kCount++;
			else if(input.charAt(index) == 'n')
				nCount++;
			else if(input.charAt(index) == 's')
				sCount++;
			else if(input.charAt(index) == 'h')
				hCount++;
			else
				System.out.println("Condition not handled");
		}
		System.out.println("Count of a : "+aCount);
		System.out.println("Count of k : "+kCount);
		System.out.println("Count of n : "+nCount);
		System.out.println("Count of s : "+sCount);
		System.out.println("Count of h : "+hCount);
	}
	
	void getFreqFromArray(String[] arr) {
		int rajRCount = 0,rajACount = 0,rajJCount = 0,aaryaACount = 0,aaryaYCount = 0,aaryaRCount = 0;
		int aavrutiACount = 0,aavrutiVCount = 0,aavrutiRCount = 0, aavrutiUCount = 0, aavrutiTCount = 0, aavrutiICount = 0;
		int shrutiSCount = 0,shrutiHCount = 0,shrutiRCount = 0,shrutiUCount = 0,shrutiICount = 0,shrutiTCount = 0;
		
		
		for(int index = 0;index<arr.length;index++) {
			for(int innerindex = 0;innerindex<arr[index].length();innerindex++) {
				if(arr[index].equals("raj")){
					if(arr[index].charAt(innerindex) == 'r')
						rajRCount++;
					else if(arr[index].charAt(innerindex) == 'a')
						rajACount++;
					else if(arr[index].charAt(innerindex) == 'j')
						rajJCount++;
				}else if(arr[index].equals("aarya")){
					if(arr[index].charAt(innerindex) == 'r')
						aaryaRCount++;
					else if(arr[index].charAt(innerindex) == 'a')
						aaryaACount++;
					else if(arr[index].charAt(innerindex) == 'y')
						aaryaYCount++;
				}
				else if(arr[index].equals("aavruti")){
					if(arr[index].charAt(innerindex) == 'r')
						aavrutiRCount++;
					else if(arr[index].charAt(innerindex) == 'a')
						aavrutiACount++;
					else if(arr[index].charAt(innerindex) == 'v')
						aavrutiVCount++;
					else if(arr[index].charAt(innerindex) == 'u')
						aavrutiUCount++; 
					else if(arr[index].charAt(innerindex) == 't')
						aavrutiTCount++;
					else if(arr[index].charAt(innerindex) == 'i')
						aavrutiICount++;
					
				}else if(arr[index].equals("shruti")){
					if(arr[index].charAt(innerindex) == 'r')
						shrutiRCount++;
					else if(arr[index].charAt(innerindex) == 's')
						shrutiSCount++;
					else if(arr[index].charAt(innerindex) == 'h')
						shrutiHCount++;
					else if(arr[index].charAt(innerindex) == 'u')
						shrutiUCount++;
					else if(arr[index].charAt(innerindex) == 't')
						shrutiTCount++;
					else if(arr[index].charAt(innerindex) == 'i')
						shrutiICount++;
				}
			}
		}
		/*for(int count = 0;count<arr.length;count++) {
			for(int innercount = 0;innercount<arr[count].length();innercount++) {
				System.out.println("Count of char - "+arr[count].charAt(innercount)+" in array - "+arr[count]+" is "+rajRCount
						+"\n abc);		
			}
		}*/
		/*System.out.println(arr[0]+" count : "+arr[0].charAt(0)+" "+rajACount);
		System.out.println(arr[1]+" count : "+arr[1].charAt(0)+rajACount);
		*/
		
		System.out.println(rajACount +"\n" +rajJCount+"\n" +rajRCount);
		System.out.println(aaryaACount +"\n" +aaryaRCount+"\n" +aaryaYCount);
		System.out.println(aavrutiACount+"\n"+aavrutiICount+"\n"+aavrutiRCount+"\n"+aavrutiTCount+"\n"+aavrutiUCount+"\n"+aavrutiVCount);
		System.out.println(shrutiHCount+"\n"+shrutiICount+"\n"+shrutiRCount+"\n"+shrutiSCount+"\n"+shrutiTCount+"\n"+shrutiUCount);
	
	}
	
	public static void main(String[] args) {
		FrequencyOfCharInStringAndArray obj = new FrequencyOfCharInStringAndArray();
		obj.getFreqOfCharInString("technocredits");
		obj.getFreqOFAllChar("aakanksha");
		String[] arr = {"raj", "aarya", "aavruti", "shruti"};
		obj.getFreqFromArray(arr);
	}

}
