package madhavi_Khasbage.SwitchCaseNested;
import java.util.Scanner;

public class BankManagement {
	double iciciBalance = 1000, hdfcBalance = 2000, bobBalance = 3000, sbiBalance = 4000;
	int idebitCount=0, icreditCount=0,hdebitCount=0,hcreditCount=0,bdebitCount=0,bcreditCount=0,sdebitCount=0,screditCount=0;
	

	void banksAccount(String bankName, String accType, double amount) {
		double remainBalance;
		accType = accType.toLowerCase();
		bankName = bankName.toLowerCase();

		switch (accType) {
		/* debit case start*/
		case "debit":			
			switch (bankName) {
			case "icici":
				if (amount <= iciciBalance) {
					idebitCount++;
					remainBalance = iciciBalance - amount;
					System.out.println(amount + " debited from your account. Your ICICI bank balance is:" + remainBalance);
				} else
					System.out.println("Insufficient balance!");

				break;
			case "hdfc":
				if (amount <= hdfcBalance) {
					hdebitCount++;
					remainBalance = hdfcBalance - amount;
					System.out.println(amount + " debited from your account. Your HDFC bank balance is:" + remainBalance);
				}
				break;
			case "bob":
				if (amount <= bobBalance) {
					bdebitCount++;
					remainBalance = bobBalance - amount;
					System.out.println(amount + " debited from your account. Your BOB bank balance is:" + remainBalance);
				}
				break;
			case "sbi":				
				if (amount <= sbiBalance) {
					sdebitCount++;
					remainBalance = sbiBalance - amount;
					System.out.println(amount + " debited from your account. Your SBI bank balance is:" + remainBalance);
				}
				break;
			default:
				System.out.println("Bank not found! Please enter valid bank name.");
				break;
			}
			break;
		/* debit case end*/
		/* credit case start*/
		case "credit":			
			switch (bankName) {
			case "icici":
				icreditCount++;
				remainBalance = iciciBalance + amount;
				System.out.println(amount + " credit to your account. Your ICICI bank balance is:" + remainBalance);
				break;
			case "hdfc":
				hcreditCount++;
				remainBalance = hdfcBalance + amount;
				System.out.println(amount + " credit to your accoun. Your HDFC bank balance is:" + remainBalance);
				break;
			case "bob":
				bcreditCount++;
				remainBalance = bobBalance + amount;
				System.out.println(amount + " credit to your accoun. Your BOB bank balance is:" + remainBalance);
				break;
			case "sbi":
				screditCount++;
				remainBalance = sbiBalance + amount;
				System.out.println(amount + " credit to your accoun. Your SBI bank balance is:" + remainBalance);
				break;
			default:
				System.out.println("Bank not found! Please enter valid bank name.");
				break;
		/* credit case end*/
			}
			break;
		default:
			System.out.println("Account type not found!");
		}
	}
	
	void totalBalance() {
		double totalBalance =iciciBalance+ hdfcBalance+ bobBalance+ sbiBalance;
		System.out.println("Total balance: " + totalBalance);			
	}
	
	void totalCreditDebitOperations() {		
		int tDebitCount =idebitCount + hdebitCount + bdebitCount + sdebitCount;
		int tCreditCount =icreditCount + hcreditCount + bcreditCount + screditCount;
		System.out.println("Total debit operation :" + tDebitCount + " times");
		System.out.println("Total credit operation :" + tCreditCount + " times");
	}
	
	void individualCreditOperations() {	
		System.out.println("ICICI bank credit operation :" + icreditCount);
		System.out.println("HDFC bank credit operation :" + hcreditCount);
		System.out.println("BOB bank credit operation :" + bcreditCount);
		System.out.println("SBI bank credit operation :" + screditCount);
	}
	
	void individualDebitOperations() {
		System.out.println("ICICI bank debit operation :" + idebitCount);
		System.out.println("HDFC bank debit operation :" + hdebitCount);
		System.out.println("BOB bank debit operation :" + bdebitCount);
		System.out.println("SBI bank debit operation :" + sdebitCount);
	}
	
	public static void main(String[] args) {
		BankManagement bnkMgt = new BankManagement();
		System.out.println("Current bank balance : ICICI = "+ bnkMgt.iciciBalance +", HDFC ="+  bnkMgt.hdfcBalance + 
				", BOB ="+ bnkMgt.bobBalance + ", SBI = "+ bnkMgt.sbiBalance);
		
		bnkMgt.totalBalance();
		System.out.println("=============================================================================");
		bnkMgt.banksAccount("ICICI", "debit", 300);
		bnkMgt.banksAccount("HDFC", "debit", 500); 
		bnkMgt.banksAccount("BOB", "credit", 300);
		bnkMgt.banksAccount("SBI", "credit", 300);
		bnkMgt.banksAccount("BOB", "debit", 500);
		bnkMgt.banksAccount("SBI", "debit", 1000);
		bnkMgt.banksAccount("ICICI", "credit", 1300);
		bnkMgt.banksAccount("HDFC", "credit", 1500); 
		
		System.out.println("=============================================================================");	
		bnkMgt.totalCreditDebitOperations();	
		System.out.println("=============================================================================");	
		bnkMgt.individualCreditOperations();
		System.out.println("=============================================================================");	
		bnkMgt.individualDebitOperations();	
	}
}
