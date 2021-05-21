package sandesh.OWN_Practice_Sandesh_1;

public class ClientAB {

	public static void main(String[] args) {
		CodeA ca1 = new CodeA();
		CodeB cb1 = new CodeB();
		
		ca1 = cb1;
		System.out.println(ca1.varA1);
		System.out.println(ca1.varA2);
		ca1.methodA1();
		ca1.methodA2();
	}

}
