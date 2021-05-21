package technocredits.abstractionDemo;

public class IciciBank implements Bank {

	@Override
	public void debitOp() {

	}

	public void gstCacl() {
		System.out.println("Child GSL");
	}
	
	
	void m1() {
		gstCacl();
	}
	
	public static void main(String[] args) {
		Bank.issueCheque();
	}
}
