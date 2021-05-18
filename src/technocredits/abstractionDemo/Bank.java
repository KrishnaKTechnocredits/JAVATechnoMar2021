package technocredits.abstractionDemo;

public interface Bank {
	int registrationNo = 123;
	void debitOp();
	default void gstCacl() {
		System.out.println("Bank Default Impl");
	}
	
	static void issueCheque() {
		System.out.println("Bank issueCheque");
	}
}
