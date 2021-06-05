package monika.Practise1.Revision;

public class Access_Testing { 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Accessmodifer_Testing.x + Accessmodifer_Testing.m2());
		Accessmodifer_Testing obj = new Accessmodifer_Testing();
		System.out.println(obj.x);
	//	obj.m1();
		System.out.println(obj.x);
		System.out.println(obj.m1());
		System.out.println(obj.m2());
				
	}

}
