/*
 Assignment - 15 : 9th April'2021

A person has total 4 accounts in ICICI, HDFC, BOB, SBI one in each.
          a) Person can debit or credit amount from respective bank.
              Hint : Switch case is expected here. [Please watch today's recording again, in case of confusion.]

          b) A Method to show total balance [ICICI balance + HDFC balance + BOB balance + SBI Balance]

          c) A Method to show total credit, debit operations 
                 output : Total credit operation - 7 times
                              Total debit operation - 5 times

         d) A Method to show individual bank credit operations.
                output : ICICI bank Credit Operation - 2
                         HDFC bank Credit Operation - 2
		                 SBI bank Credit Operation - 1
                         BOB bank Credit Operation - 4

         e) A Method to show individual bank debit operations.
                output : ICICI bank Debit Operation - 2
                         HDFC bank Debit Operation - 2
		                 SBI
 */

package paras.Assignment15;

public class BankUsingSwitch {

	int iciciTotalBalance, HdfcTotalBalance, bobTotalBalance, sbiTotalBalance;
	int iciciCredit, hdfcCredit, bobCredit, sbiCredit;
	int iciciDebit, hdfcDebit, bobDebit, sbiDebit;
	
	void setBalance(String bank, int Balance) {
		switch(bank) {
		case "ICICI" :
			iciciTotalBalance = Balance;
			break;
		case "HDFC" :
			HdfcTotalBalance = Balance;
			break;
		case "BOB" :
			bobTotalBalance = Balance;
			break;
		case "SBI" :
			sbiTotalBalance = Balance;
			break;
		default:
			System.out.println("Please Select Proper Bank name");
		}
	}
	
	void transaction(String operation, String bank, int amount) {
		switch(operation){
		case "Debit":
			switch(bank) {
			case "ICICI" :
				if(iciciTotalBalance > amount) {
					iciciTotalBalance = iciciTotalBalance - amount;
					iciciDebit++;
				}else
					System.out.println("Insufficient Balance in ICICI Bank Account");
				break;
			case "HDFC" :
				if(HdfcTotalBalance > amount) {
					HdfcTotalBalance = HdfcTotalBalance - amount;
					hdfcDebit++;
				}else
					System.out.println("Insufficient Balance in HDFC Bank Account");
				break;
			case "BOB" :
				if(bobTotalBalance> amount) {
					bobTotalBalance = bobTotalBalance - amount;
					bobDebit++;
				}else
					System.out.println("Insufficient Balance in BOB Bank Account");
				break;
			case "SBI" :
				if(sbiTotalBalance > amount) {
					sbiTotalBalance = sbiTotalBalance - amount;
					sbiDebit++;
				}else
					System.out.println("Insufficient Balance in ICICI Bank Account");
				break;
			default :
				System.out.println("Please Select Proper Bank");
			}
		break;
		
		case "Credit" :{
			switch(bank) {
			case "ICICI" :
					iciciTotalBalance = iciciTotalBalance + amount;
					iciciCredit++;
				break;
			case "HDFC" :
					HdfcTotalBalance = HdfcTotalBalance + amount;
					hdfcCredit++;
				break;
			case "BOB" :
					bobTotalBalance = bobTotalBalance + amount;
					bobCredit++;
				break;
			case "SBI" :
					sbiTotalBalance = sbiTotalBalance + amount;
					sbiCredit++;
				break;
			default :
				System.out.println("Please Select Proper Bank");
			}
			}
		}
	}
	void totalBalanceOfAllBank() {
		System.out.println("Total Balance of ICICI, HDFC, BOB and SBI is: " + (iciciTotalBalance + HdfcTotalBalance + bobTotalBalance + sbiTotalBalance));
	}
	
	void allBankTotalOperation() {
			System.out.println("\nTotal Credit Operation of All Bank is: " + (iciciCredit+hdfcCredit+bobCredit+sbiCredit));
			System.out.println("\nTotal Dedit Operation of All Bank is: " + (iciciDebit+hdfcDebit+bobDebit+sbiDebit));
	}
	
	void bankWiseCreditOpration() {
		System.out.println("\nBank Wise Credit Operations: ");
		System.out.println("\nICICI Total Credit Operation - " + iciciCredit + "\nHDFC Total Credit Operation - " + hdfcCredit + "\nBOB Total Credit Operation - " + bobCredit + "\nSBI Total Credit Operation - " + sbiCredit);
	}
	
	void bankWiseDebitOpration() {
		System.out.println("\nBank Wise Debit Operations: ");
		System.out.println("\nICICI Total Debit Operation - " + iciciDebit + "\nHDFC Total Debit Operation - " + hdfcDebit + "\nBOB Total Debit Operation - " + bobDebit + "\nSBI Total Debit Operation - " + sbiDebit);
	}
	
	
	public static void main(String[] args) {
		BankUsingSwitch bankUsingSwitch = new BankUsingSwitch();
		bankUsingSwitch.setBalance("ICICI", 15000);
		bankUsingSwitch.setBalance("HDFC", 15000);
		bankUsingSwitch.setBalance("BOB", 15000);
		bankUsingSwitch.setBalance("SBI", 15000);
		bankUsingSwitch.transaction("Debit", "ICICI", 2000);
		bankUsingSwitch.transaction("Debit", "HDFC", 1000);
		bankUsingSwitch.transaction("Debit", "BOB", 2500);
		bankUsingSwitch.transaction("Debit", "SBI", 5000);
		bankUsingSwitch.transaction("Credit", "ICICI", 2500);
		bankUsingSwitch.transaction("Credit", "HDFC", 2000);
		bankUsingSwitch.totalBalanceOfAllBank();
		bankUsingSwitch.allBankTotalOperation();
		bankUsingSwitch.bankWiseCreditOpration();
		bankUsingSwitch.bankWiseDebitOpration();
	}
}