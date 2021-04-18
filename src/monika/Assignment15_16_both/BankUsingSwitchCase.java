package monika.Assignment15_16_both;
/*Assignment - 15 : 9th April'2021
A person has total 4 accounts in ICICI, HDFC, BOB, SBI one in each.
          a) Person can debit or credit amount from respective bank.
              Hint : Switch case is expected here. [Please watch today's recording again, in case of confusion.]
          b) A Method to show total balance [ICICI balance + HDFC balance + BOB balance + SBI Balance]
          c) A Method to show total credit, debit operations 
                 output : Total credit operation - 7 times, Total debit operation - 5 times
         d) A Method to show individual bank credit operations.
                output : ICICI bank Credit Operation - 2,   HDFC bank Credit Operation - 2,  SBI bank Credit Operation - 1
                         BOB bank Credit Operation - 4
         e) A Method to show individual bank debit operations.
                output : ICICI bank Debit Operation - 2
                         HDFC bank Debit Operation - 2
		                 SBI*/
public class BankUsingSwitchCase {
	int ibalance = 0, sbalance = 0, hbalance = 0, bbalance = 0;
	int idebitCount = 0, sdebitCount = 0, hdebitCount = 0, bdebitCount = 0;
	int icreditCount = 0, screditCount = 0, hcreditCount = 0, bcreditCount = 0;
	
	/*void getBalanceValues(int i, int s, int h, int b) {
		ibalance = i; sbalance = s; hbalance = h; bbalance = b;
	}
	*/
	void operationOnBank(String transationType,String bankName, int amt) {
		switch(transationType.toLowerCase()) {
			case "debit":
				switch(bankName.toUpperCase()) {
					case "ICICI": {
						ibalance = ibalance - amt;
						idebitCount++;
						break;}
					case "SBI":
						sbalance = sbalance - amt;
						sdebitCount++;
						break;
					case "HDFC":
						hbalance = hbalance - amt;
						hdebitCount++;
						break;
					case "BOB":
						bbalance = bbalance - amt;
						bdebitCount++;
						break;
					default:
						System.out.println("Please check your bank name");
						break;
				}
			break;
		case "credit":
				switch(bankName.toUpperCase()) {
					case "ICICI":
						ibalance = ibalance + amt;
						icreditCount++;
						break;
					case "SBI":
						sbalance = sbalance + amt;
						screditCount++;
						break;
					case "HDFC":
						hbalance = hbalance + amt;
						hcreditCount++;
						break;
					case "BOB":
						bbalance = bbalance + amt;
						bcreditCount++;
						break;
					default:
						System.out.println("Please check your bank name");
						break;
				}
		break;
		default:
			System.out.println("Please check your transaction type name");
			break;
		}
	}
	
	int totalBalanceOfAccounts(int icici, int sbi, int hdfc, int bob) {
		int totalBalanceOfAccounts = ibalance + sbalance + hbalance + bbalance;
		return totalBalanceOfAccounts;	
	}
	
	void individualDebitCreditOperations(String transactionType, String bankName) {
		String type = transactionType.toUpperCase();
		String bank = bankName.toUpperCase();
		
		if(type.equals("DEBIT")) {
			if(bank.equals("SBI"))
				System.out.println(type+" count of bank "+bank+" is "+idebitCount);
			else if(bank.equals("SBI"))
				System.out.println(type+" count of bank "+bank+" is "+sdebitCount);
			else if(bank.equals("HDFC"))
				System.out.println(type+" count of bank "+bank+" is "+hdebitCount);
			else if(bank.equals("BOB"))
				System.out.println(type+" count of bank "+bank+" is "+bdebitCount);
			else
				System.out.println("Please check your bank name");
		}else if((type.equals("CREDIT"))){
				if(bank.equals("SBI"))
					System.out.println(type+" count of bank "+bank+" is "+icreditCount);
				else if(bank.equals("SBI"))
				System.out.println(type+" count of bank "+bank+" is "+screditCount);
				else if(bank.equals("HDFC"))
					System.out.println(type+" count of bank "+bank+" is "+hcreditCount);
				else if(bank.equals("BOB"))
					System.out.println(type+" count of bank "+bank+" is "+bcreditCount);
				else
					System.out.println("Please check your bank name");
		}
		else
			System.out.println("Please check your transaction type");
	}
	
	int totalDebitOperations(int idebitCount,int sdebitCount, int hdebitCount, int bdebitCount ) {
		int totalDebitCounts = idebitCount+ sdebitCount+ hdebitCount+ bdebitCount;
		return totalDebitCounts;
	}
	
	int totalCreditOperations(int icreditCount,int screditCount, int hcreditCount, int bcreditCount ) {
		int totalCreditCounts = icreditCount+ screditCount+ hcreditCount+ bcreditCount;
		return totalCreditCounts;
	}
}
