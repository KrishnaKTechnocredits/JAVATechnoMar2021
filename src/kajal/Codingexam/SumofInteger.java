package kajal.Codingexam;

public class SumofInteger {

	void sumInt(String str) {
		String sum = "";
		int total=0;

		for(int index=0; index<str.length(); index++) {
			
			if(Character.isDigit(str.charAt(index))) {
				sum= sum+str.charAt(index);
									
				}
			else {
				if(sum!="") {
					total= total+ Integer.parseInt(sum);
					sum="";
				}
			}
		}
		if(sum!="") {
			total= total+ Integer.parseInt(sum);
			}
		System.out.println(total);
			
	}
	
public static void main(String [] args) {
		String str = "12h14i4w8sdc15";
		new SumofInteger().sumInt(str);
	}
}
