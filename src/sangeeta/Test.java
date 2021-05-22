package sangeeta;

public class Test{
	
	public static void main(String[] args) {
		int num = 11122111;
		String str = String.valueOf(num);
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
			System.out.println(sb.toString());
		if(str.equals(sb.toString()))
			System.out.println("Number is Palindrom");
		else
			System.out.println("Number is not Palindrom");
	}
}
