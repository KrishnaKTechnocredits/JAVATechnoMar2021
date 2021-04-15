package monika.Assignment15_16_both;

import java.util.Scanner;

public class CallingClassForBankUsingSwitchCase {

	public static void main(String[] args) {
		BankUsingSwitchCase obj = new BankUsingSwitchCase();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please add your inital amount for bank ICICI :");
		obj.ibalance = sc.nextInt();
		System.out.println("Please add your inital amount for bank SBI :");
		obj.sbalance = sc.nextInt();
		System.out.println("Please add your inital amount for bank HDFC :");
		obj.hbalance = sc.nextInt();
		System.out.println("Please add your inital amount for bank BOB :");
		obj.bbalance = sc.nextInt();		
		
		int totalBalance = obj.totalBalanceOfAccounts(obj.ibalance, obj.sbalance, obj.hbalance, obj.bbalance);
		System.out.println("Total balance is "+totalBalance);
		
		/*System.out.println("Provide bank name for transactions :");
		String bank = sc.nextLine();
		System.out.println("Provide type of transaction you want from your bank :");
		String transaction = sc.nextLine();
		System.out.println("Provide amount :");
		int amt = sc.nextInt();
		obj.operationOnBank(bank, transaction, amt);// incorrect results
		sc.nextLine();*/
		obj.operationOnBank("debit", "icici", 100);
		obj.operationOnBank("credit", "icici", 1000);
		obj.operationOnBank("debit", "sbi", 100);
		obj.operationOnBank("credit", "sbi", 1000);
		obj.operationOnBank("debit", "hdfc", 100);
		obj.operationOnBank("credit", "hdfc", 1000);
		obj.operationOnBank("debit", "bob", 100);
		obj.operationOnBank("credit", "bob", 1000);
		
		int totalBalance1 = obj.totalBalanceOfAccounts(obj.ibalance, obj.sbalance, obj.hbalance, obj.bbalance);
		System.out.println("Total balance is "+totalBalance1);
		
		/*System.out.println("Provide type of transaction you want from your bank :");
		String trans = sc.nextLine();
		System.out.println("Provide bank name for transactions :");
		String bk = sc.nextLine();*/
		//obj.individualDebitCreditOperations(trans, bk);// incorrect results
		obj.individualDebitCreditOperations("debit", "sbi");
		obj.individualDebitCreditOperations("debit", "hdfc");
		
		obj.individualDebitCreditOperations("credit", "hdfc");
		obj.individualDebitCreditOperations("credit", "bob");
		
		int totalCreditCounts = obj.totalCreditOperations(obj.icreditCount, obj.screditCount, obj.hcreditCount, obj.bcreditCount);
		int totalDebitCounts = obj.totalDebitOperations(obj.idebitCount, obj.sdebitCount, obj.hdebitCount, obj.bdebitCount);
		System.out.println("Total credit operations count are "+totalCreditCounts); // incorrect results
		System.out.println("Total debit operations count are "+totalDebitCounts); // incorrect results
		
		
	}

}
