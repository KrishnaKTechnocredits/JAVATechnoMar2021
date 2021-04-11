package pavan.Assignment15;

import java.util.Scanner;

public class BankSwitchCase {
	int icBalace= 10000;
	int hdBalance=10000;
	int dobBalance=10000;
	int sbiBalace=10000;

	int debICICI=0;
	int debhdfc=0;
	int debdob=0;
	int debsbi=0;
	
	int creICICI=0;
	int crehdfc=0;
	int credob=0;
	int cresbi=0;
	
void operations(String Bank, String operation,int amount) {
	switch (operation) {
	case "Debit":
			switch (Bank) {
			case "ICICI":
						if(icBalace>=amount) {
							icBalace= icBalace-amount;
							debICICI++;
							System.out.println("Amount debited from ICICI bank and current balance is "+ debICICI);
						} 
						else {
							System.out.println("Doesn't have enough balace");
							break;	
						}
						
						
					case "HDFC":
						if(hdBalance>=amount) {
							hdBalance= hdBalance-amount;
							debhdfc++;
							System.out.println("Amount debited from ICICI bank and current balance is "+ hdBalance);
						} 
						else {
							System.out.println("Doesn't have enough balace");
							break;
					}
					case "DOB":
						if(dobBalance>=amount) {
							dobBalance= dobBalance-amount;
							debdob++;
							System.out.println("Amount debited from ICICI bank and current balance is "+ dobBalance);
						} 
						else {
							System.out.println("Doesn't have enough balace");
							break;	
						}
					 case "SBI":
						if(sbiBalace>=amount) {
							sbiBalace= sbiBalace-amount;
							debsbi++;
							System.out.println("Amount debited from ICICI bank and current balance is "+ sbiBalace);
						} 
						else {
							System.out.println("Doesn't have enough balace");
							break;	
						}
						default: {
							System.out.println("Enter correct bank name");
						}
			}					
						
	case "credit":
			switch(Bank) {
			case "ICICI":
				if(amount>0) {
					icBalace= icBalace+amount;
					creICICI++;
					System.out.println("Credited amount :"+ amount);
					System.out.println("total amount in ICICI bank :"+icBalace);	
				}
				break;
				
			case "HDFC"	:
				if(amount>0) {
					hdBalance= hdBalance+amount;
					crehdfc++;
					System.out.println("Credited amount :"+ amount);
					System.out.println("total amount in HDFC bank :"+hdBalance);
				break;	
			}
				
			case "DOB":
				if(amount>0) {
					dobBalance= dobBalance+amount;
					credob++;
					System.out.println("Credited amount :"+ amount);
					System.out.println("total amount in DOB bank :"+dobBalance);
				break;	
	           }
			case "SBI":
				if(amount>0) {
					sbiBalace= sbiBalace+amount;
					credob++;
					System.out.println("Credited amount :"+ amount);
					System.out.println("total amount in SBI bank :"+sbiBalace);
				break;			
			}
				default:
				System.out.println("Bank name is not correct");
			}

	}
}

void totalBalace() {
	System.out.println("Total balance is "+(icBalace+hdBalance+dobBalance+sbiBalace));
}


void TotalCreditDebit() {
	System.out.println("total debit done "+(debhdfc+debICICI+debdob+debsbi));
	System.out.println("Total credit "+ (creICICI+crehdfc+credob+cresbi));
}

void IndividualBankCredit() {
	System.out.println("No of credits for ICICI ="+ creICICI );
	System.out.println("No of credits for HDFC ="+ crehdfc );
	System.out.println("No of credits for DOB ="+ credob );
	System.out.println("No of credits for DOB ="+ cresbi );
}

void IndividualBankDebit() {
	System.out.println("No of debit for ICICI ="+ debICICI );
	System.out.println("No of debit for HDFC ="+ debhdfc );
	System.out.println("No of debit for DOB ="+ debdob );
	System.out.println("No of debit for DOB ="+ debsbi );
}

public static void main(String[] args) {
	BankSwitchCase bankSwitchCase=new BankSwitchCase();
	Scanner scanner= new Scanner(System.in);
	System.out.println("Enter the operation to perform");
	String operation= scanner.nextLine();
	System.out.println("Enter the bank name");
	String bank= scanner.nextLine();
	System.out.println("Enter the amount");
	int amount= scanner.nextInt();
	bankSwitchCase.operations(bank, operation, amount);
	bankSwitchCase.totalBalace();
	bankSwitchCase.TotalCreditDebit();
	bankSwitchCase.IndividualBankCredit();
	bankSwitchCase.IndividualBankDebit();
}
}




	



