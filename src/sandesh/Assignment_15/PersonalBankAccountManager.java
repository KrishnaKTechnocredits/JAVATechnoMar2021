/*Assignment - 15 : 9th April'2021

A person has total 4 accounts in ICICI, HDFC, BOB, SBI one in each.
          a) Person can debit or credit amount from respective bank.
              Hint : Switch case is expected here. [Please watch today's recording again, in case of confusion.]

          b) A Method to show total balance [ICICI balance + HDFC balance + BOB balance + SBI Balance]

          c) A Method to show total credit, debit operations 
                 output : Total credit operation - 7 times
                              Total debit operation - 5 times
.
         d) A Method to show individual bank credit operations.
                output : ICICI bank Credit Operation - 2
                         HDFC bank Credit Operation - 2
		                 SBI bank Credit Operation - 1
                         BOB bank Credit Operation - 4

         e) A Method to show individual bank debit operations.
                output : ICICI bank Debit Operation - 2
                         HDFC bank Debit Operation - 2
		                 SBI*/

package sandesh.Assignment_15;

import java.util.Scanner;

public class PersonalBankAccountManager {

	static double hdfcBalance, iciciBalance, bobBalance, sbiBalance;
	static int hdfcCreditOperations, hdfcDebitOperations, iciciCreditOperations, iciciDebitOperations;
	static int bobCreditOperations, bobDebitOperations, sbiCreditOperations, sbiDebitOperations;

	double performCreditDebit(String operationType, double amount, String bankName) {
		// HDFC
		if (bankName.equalsIgnoreCase("HDFC")) {
			if (operationType.equalsIgnoreCase("credit")) {
				hdfcBalance += amount;
				hdfcCreditOperations++;

			} else if (operationType.equalsIgnoreCase("debit") && hdfcBalance != 0) {
				if (hdfcBalance > amount) {
					hdfcBalance -= amount;
					hdfcDebitOperations++;
				} else if (hdfcBalance < amount) {
					System.out.println("You have only " + hdfcBalance + " left to withdraw.");
					System.out.println("Enter Y if you want to withdraw the last remaining balance else enter N");
					Scanner sc = new Scanner(System.in);
					char consentInput = sc.next().charAt(0);
					// sc.close();
					if (consentInput == 'Y') {
						PersonalBankAccountManager.hdfcBalance -= hdfcBalance;
						hdfcDebitOperations++;
					} else
						return hdfcBalance;
				}
			} else
				System.out.println("Please credit money to your HDFC account first");
		}
		// ICICI
		else if (bankName.equalsIgnoreCase("ICICI")) {
			if (operationType.equalsIgnoreCase("credit")) {
				iciciBalance += amount;
				iciciCreditOperations++;
			}
			else if (operationType.equalsIgnoreCase("debit") && iciciBalance != 0) {
				if (iciciBalance > amount) {
					iciciBalance -= amount;
					iciciDebitOperations++;
				}
				else if (iciciBalance < amount) {
					System.out.println("You have only " + iciciBalance + " left to withdraw.");
					System.out.println("Enter Y if you want to withdraw the last remaining balance else enter N");
					Scanner sc = new Scanner(System.in);
					char consentInput = sc.next().charAt(0);
					// sc.close();
					if (consentInput == 'Y') {
						PersonalBankAccountManager.iciciBalance -= iciciBalance;
						iciciDebitOperations++;
					} else
						return iciciBalance;
				}
			} 
			else
				System.out.println("Please credit money to your ICICI account first");
		}
		// BOB
		else if (bankName.equalsIgnoreCase("BOB")) {
			if (operationType.equalsIgnoreCase("credit")) {
				bobBalance += amount;
				bobCreditOperations++;
				}
			else if (operationType.equalsIgnoreCase("debit") && bobBalance != 0) {
				if (bobBalance > amount) {
					bobBalance -= amount;
					bobDebitOperations++;
				} 
				else if (bobBalance < amount) {
					System.out.println("You have only " + bobBalance + " left to withdraw.");
					System.out.println("Enter Y if you want to withdraw the last remaining balance else enter N");
					Scanner sc = new Scanner(System.in);
					char consentInput = sc.next().charAt(0);
					if (consentInput == 'Y') {
						PersonalBankAccountManager.bobBalance -= bobBalance;
						bobDebitOperations++;
					} else
						return bobBalance;
				}
			}
			else
				System.out.println("Please credit money to your BOB account first");
		}
		
		// SBI
		else if (bankName.equalsIgnoreCase("SBI")) {
			if (operationType.equalsIgnoreCase("credit")) {
				sbiBalance += amount;
				sbiCreditOperations++;
				}
			else if (operationType.equalsIgnoreCase("debit") && sbiBalance != 0) {
				if (sbiBalance > amount) {
					sbiBalance -= amount;
					sbiDebitOperations++;
				} 
				else if (sbiBalance < amount) {
					System.out.println("You have only " + sbiBalance + " left to withdraw.");
					System.out.println("Enter Y if you want to withdraw the last remaining balance else enter N");
						Scanner sc = new Scanner(System.in);
						char consentInput = sc.next().charAt(0);
						if (consentInput == 'Y') {
							PersonalBankAccountManager.sbiBalance -= sbiBalance;
							sbiDebitOperations++;
						}
						else
							return sbiBalance;
					}
				}
				else
					System.out.println("Please credit money to your SBI account first");
		}		
		
		if (bankName.equalsIgnoreCase("HDFC"))
			return hdfcBalance;
		else if (bankName.equalsIgnoreCase("ICICI"))
			return iciciBalance;
		else if (bankName.equalsIgnoreCase("BOB"))
			return bobBalance;
		else if (bankName.equalsIgnoreCase("SBI"))
			return sbiBalance;
		else
			return 0.0;
	}

	void getBank(String bankInputName) {
		// HDFC
		switch (bankInputName.toUpperCase()) {
		case "HDFC":
			System.out.println("Your HDFC account balance is -: " + hdfcBalance);
			System.out.println("What operation do you want to perform ---> Credit or Debit");
			Scanner sc = new Scanner(System.in);
			String operationType = sc.next();
			System.out.println("Please enter Amount -: ");
			double amount = sc.nextDouble();
			double localHdfcBalance = performCreditDebit(operationType, amount, "HDFC");
			if (localHdfcBalance == 0) {
				// System.out.println("Request to please credit money to your HDFC account");
				System.out.println("Enter Y if you want to proceed else enter N");
				sc = new Scanner(System.in);
				char consentInput = sc.next().charAt(0);
				if (consentInput == 'Y') {
					System.out.println("Please enter Amouunt -: ");
					amount = sc.nextDouble();
					localHdfcBalance = performCreditDebit("Credit", amount, "HDFC");
				} else
					System.out.println("Bye Bye");
			}
		break;
			
		
		//ICICI
		case "ICICI":
			System.out.println("Your ICICI account balance is -: " + iciciBalance);
			System.out.println("What operation do you want to perform ---> Credit or Debit");
			sc = new Scanner(System.in);
			operationType = sc.next();
			System.out.println("Please enter Amount -: ");
			amount = sc.nextDouble();
			double localIciciBalance = performCreditDebit(operationType, amount, "ICICI");
			if (localIciciBalance == 0) {
				System.out.println("Enter Y if you want to proceed else enter N");
				sc = new Scanner(System.in);
				char consentInput = sc.next().charAt(0);
				if (consentInput == 'Y') {
					System.out.println("Please enter Amouunt -: ");
					amount = sc.nextDouble();
					localIciciBalance = performCreditDebit("Credit", amount, "ICICI");
				} else
					System.out.println("Bye Bye");
			}
		// sc.close();
		
		
		//BOB
		case "BOB":
			System.out.println("Your BOB account balance is -: " + bobBalance);
			System.out.println("What operation do you want to perform ---> Credit or Debit");
			sc = new Scanner(System.in);
			operationType = sc.next();
			System.out.println("Please enter Amount -: ");
			amount = sc.nextDouble();
			double localBobBalance = performCreditDebit(operationType, amount, "BOB");
			if (localBobBalance == 0) {
				System.out.println("Enter Y if you want to proceed else enter N");
				sc = new Scanner(System.in);
				char consentInput = sc.next().charAt(0);
				if (consentInput == 'Y') {
					System.out.println("Please enter Amount -: ");
					amount = sc.nextDouble();
					localBobBalance = performCreditDebit("Credit", amount, "BOB");
					} else
						System.out.println("Bye Bye");
			}

		//SBI
		case "SBI":
			System.out.println("Your SBI account balance is -: " + sbiBalance);
			System.out.println("What operation do you want to perform ---> Credit or Debit");
			sc = new Scanner(System.in);
			operationType = sc.next();
			System.out.println("Please enter Amount -: ");
			amount = sc.nextDouble();
			double localSbiBalance = performCreditDebit(operationType, amount, "SBI");
			if (localSbiBalance == 0) {
				System.out.println("Enter Y if you want to proceed else enter N");
				sc = new Scanner(System.in);
				char consentInput = sc.next().charAt(0);
				if (consentInput == 'Y') {
					System.out.println("Please enter Amount -: ");
					amount = sc.nextDouble();
					localSbiBalance = performCreditDebit("Credit", amount, "SBI");
					} else
					System.out.println("Bye Bye");
			}
		break;
		
		default:
			System.out.println("Please enter correct bank name");
		}
	
	}

	int getAllCreditOperations() {
		int totalCreditOperations = hdfcCreditOperations + iciciCreditOperations + bobCreditOperations
				+ sbiCreditOperations;
		return totalCreditOperations;
	}

	int getAllDebitOperations() {
		int totalDebitOperations = hdfcDebitOperations + iciciDebitOperations + bobDebitOperations + sbiDebitOperations;
		return totalDebitOperations;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char continueConsent = 'Y';
		System.out.println("Welcome to All in One Bank Account Manager");
		do {
			System.out.println("Your HDFC account balance is -: " + hdfcBalance);
			System.out.println("Your ICICI account balance is -: " + iciciBalance);
			System.out.println("Your BOB account balance is -: " + bobBalance);
			System.out.println("Your SBI account balance is -: " + sbiBalance);
			System.out.println("Print Y if you want to proceed else print N");
			sc = new Scanner(System.in);
			continueConsent = sc.next().charAt(0);
			if (continueConsent == 'N')
				break;
			System.out.println("Select 1 bank from ---> HDFC or ICICI or BOB or SBI");
			System.out.println("Type in the Bank's name from which you want to perform credit/ debit operations");
			String bankInputName = sc.next();
			new PersonalBankAccountManager().getBank(bankInputName);
		} while (continueConsent != 'N');

		System.out.println("HDFC Debit operations performed " + hdfcDebitOperations + " times.");
		System.out.println("HDFC Credit operations performed " + hdfcCreditOperations + " times.");
		System.out.println("ICICI Debit operations performed " + iciciDebitOperations + " times.");
		System.out.println("ICICI Credit operations performed " + iciciCreditOperations + " times.");
		System.out.println("BOB Debit operations performed " + bobDebitOperations + " times.");
		System.out.println("BOB Credit operations performed " + bobCreditOperations + " times.");
		System.out.println("SBI Debit operations performed " + sbiDebitOperations + " times.");
		System.out.println("SBI Credit operations performed " + sbiCreditOperations + " times.");
		System.out.println("Total Credit Operations -: " + new PersonalBankAccountManager().getAllCreditOperations());
		System.out.println("Total Debit Operations -: " + new PersonalBankAccountManager().getAllDebitOperations());
		sc.close();
	}
}
