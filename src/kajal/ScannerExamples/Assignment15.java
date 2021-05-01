package kajal.ScannerExamples;

public class Assignment15 {

	double totalBalanceIcici, totalBalanceHdfc, totalBalanceBob, totalBalanceSbi, totalBalance;
	int debitCountIcici, debitCountHdfc, debitCountBob, debitCountSbi, creditCountIcici, creditCountHdfc,
			creditCountBob, creditCountSbi, totalDebitCount, totalCreditCount;

	void setBalance(double balace, String bankName) {

		switch (bankName.toUpperCase()) {
		case "ICICI":
			totalBalanceIcici = balace;
			break;
			
		case "HDFC":
			totalBalanceHdfc = balace;
			break;
			
		case "BOB":
			totalBalanceBob = balace;
			break;
			
		case "SBI":
			totalBalanceSbi = balace;
			break;
			
		default:
			System.out.println("Invalid bank, Enter valid bank name");
		}
	}

	void Operation(String op, String bankName, int amount) {
		switch (op.toUpperCase()) {
		default:
			System.out.println("Invalid Transcation");
		case "DEBIT":
			switch (bankName.toUpperCase()) {

			default:
				System.out.println("Invalid bank");
				break;
				
			case "ICICI":
				if (totalBalanceIcici >= amount) {
					totalBalanceIcici = totalBalanceIcici - amount;
					debitCountIcici++;
					totalDebitCount++;
				} else
					System.out.println("Insufficient Balance");
				break;
				
			case "HDFC":
				if (totalBalanceHdfc >= amount) {
					totalBalanceHdfc = totalBalanceHdfc - amount;
					debitCountHdfc++;
					totalDebitCount++;
				} else
					System.out.println("Insufficient Balance");
				break;
				
			case "BOB":
				if (totalBalanceBob >= amount) {
					totalBalanceBob = totalBalanceBob - amount;
					debitCountBob++;
					totalDebitCount++;
				} else
					System.out.println("Insufficient Balance");
				break;
				
			case "SBI":
				if (totalBalanceSbi >= amount) {
					totalBalanceSbi = totalBalanceSbi - amount;
					debitCountSbi++;
					totalDebitCount++;
				} else
					System.out.println("Insufficient Balance");
				break;

			}
			break;
		case "CREDIT":
			switch (bankName.toUpperCase()) {
			case "ICICI":
				totalBalanceIcici = totalBalanceIcici + amount;
				creditCountIcici++;
				totalCreditCount++;
				break;
				
			case "HDFC":
				totalBalanceIcici = totalBalanceIcici + amount;
				creditCountHdfc++;
				totalCreditCount++;
				break;
				
			case "BOB":
				totalBalanceIcici = totalBalanceIcici + amount;
				creditCountBob++;
				totalCreditCount++;
				break;
				
			case "SBI":
				totalBalanceIcici = totalBalanceIcici + amount;
				creditCountSbi++;
				totalCreditCount++;
				break;
				
			default:
				System.out.println("Invalid bank");
			}
		}
	}

	void totalBalance() {
		System.out.println("ToTal Balance is: " + (totalBalanceIcici + totalBalanceHdfc + totalBalanceBob + totalBalanceSbi));
	}

	void totalCount() {
		System.out.println("ToTal Debit operation: " + totalDebitCount + " times");
		System.out.println("ToTal Credit operation: " + totalCreditCount + " times");
	}

	void totalIndividualCreditOp() {
		System.out.println("ICICI bank Credit Operation: " + creditCountIcici + " times");
		System.out.println("HDFC bank Credit Operation: " + creditCountHdfc + " times");
		System.out.println("BOB bank Credit Operation: " + creditCountBob + " times");
		System.out.println("SBI bank Credit Operation: " + creditCountSbi + " times");
	}

	void totalIndividualDebitOp() {
		System.out.println("ICICI bank Debit Operation: " + debitCountIcici + " times");
		System.out.println("HDFC bank Debit Operation: " + debitCountHdfc + " times");
		System.out.println("BOB bank Debit Operation: " + debitCountBob + " times");
		System.out.println("SBI bank Debit Operation: " + debitCountSbi + " times");
	}

	public static void main(String[] args) {
		Assignment15 assign = new Assignment15();
		assign.setBalance(6000, "Hdfc");
		assign.setBalance(4000, "SBI");
		assign.setBalance(8000, "BOB");
		assign.setBalance(5000, "ICICI");
		assign.totalBalance();
		assign.Operation("Credit", "ICICI", 4300);
		assign.Operation("Credit", "sbi", 4000);
		assign.Operation("Credit", "HDFC", 600);
		assign.Operation("Credit", "Bob", 500);
		assign.Operation("Debit", "Icici", 200);
		assign.Operation("Debit", "sbi", 300);
		assign.Operation("debit", "HDFC", 1000);
		assign.Operation("debit", "bob", 500);
		assign.totalIndividualCreditOp();
		assign.totalIndividualDebitOp();
		assign.totalCount();
		assign.totalBalance();
	}
}

