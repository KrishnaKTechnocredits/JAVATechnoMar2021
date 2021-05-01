package nikita;

public class Sumint {

	String str= "12h14i4w8sdc15";
	
	void getSum() {
		String temp="0";
		int sum=0;
		char ch;
		for(int i=0;i<str.length();i++) {
			ch=str.charAt(i);
			if(Character.isDigit(ch)) {
				temp=temp+ch;								
			}
			else {
				sum=sum+Integer.parseInt(temp);
				
				temp="0";
			}
		}
		sum=sum+Integer.parseInt(temp);
		System.out.println(sum);
	}	
public static void main(String args[]) {
	
	Sumint s=new Sumint();
	s.getSum();
}
}
