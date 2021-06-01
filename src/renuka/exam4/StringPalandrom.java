package renuka.exam4;

public class StringPalandrom {
	
    public void palandromFromString(String str[]){
        for(int index = 0; index <= str.length ;index++){
        	StringBuffer sb1 = new StringBuffer(str[index]);
        	sb1.reverse();
  		    if(str[index].equals(sb1.toString())) { 
  		        System.out.print(str[index] +" :is palindrome ");
  		    }
  		} 
    }

	public static void main(String[] args) {
		  StringPalandrom palandrom = new StringPalandrom();
		  String str1 = "Hi MAM hello NamaN techno";
		  String str[] = str1.split(" ");
		  palandrom.palandromFromString(str);
	}	  
}
