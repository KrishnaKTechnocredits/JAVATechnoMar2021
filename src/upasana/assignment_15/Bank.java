/*
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

package upasana.assignment_15;

import java.util.Scanner;
public class Bank {
	int iciciBalT,hdfcBalT,bobBalT,sbiBalT;
	int creditCountI=0,creditCountH=0,creditCountB=0,creditCountS=0;
	int debitCountI=0,debitCountH=0,debitCountB=0,debitCountS=0;;
	void operations(String op,String bank,int amt,int totAmt) {
		switch(op){
			case "debit":
				switch(bank) {
					case "ICICI":
						iciciBalT=totAmt;
						if(iciciBalT>=amt) {
							iciciBalT-=amt;
							debitCountI++;
						}
						else
							System.out.println("Insufficient balance");
					break;
					case "HDFC":
						hdfcBalT=totAmt;
						if(hdfcBalT>=amt) {
							hdfcBalT-=amt;
							debitCountH++;
						}
						else
							System.out.println("Insufficient balance");
					break;
					case "BOB":
						bobBalT=totAmt;
						if(bobBalT>=amt) {
							bobBalT-=amt;
							debitCountB++;
						}
						else
							System.out.println("Insufficient balance");
					break;
					case "SBI":
						sbiBalT=totAmt;
						if(sbiBalT>=amt) {
							sbiBalT-=amt;
							debitCountS++;
						}
						else
							System.out.println("Insufficient balance");
					break;
				}
			break;
			case "credit":
				switch(bank){
					case "ICICI":
						iciciBalT=totAmt;
						if(amt>0) {
							iciciBalT+=amt;
							creditCountI++;
						}
						else
							System.out.println("Required balance cannot be credited");
					break;
					case "HDFC":
						hdfcBalT=totAmt;
						if(amt>0) {
							hdfcBalT+=amt;
							creditCountH++;
						}
						else
							System.out.println("Required balance cannot be credited");
					break;
					case "BOB":
						bobBalT=totAmt;
						if(amt>0) {
							bobBalT+=amt;
							creditCountB++;
						}
						else
							System.out.println("Required balance cannot be credited");
					break;
					case "SBI":
						sbiBalT=totAmt;
						if(amt>0) {
							sbiBalT+=amt;
							creditCountS++;
						}
						else
							System.out.println("Required balance cannot be credited");
					break;
				}
		}
		
}
	void totBalPrint() {
		System.out.println(iciciBalT+hdfcBalT+bobBalT+sbiBalT +" is the total balance of ICICI,HDFC,BOB,SBI");
	}
	
	void totCredDebCountPrint() {
		System.out.println(creditCountI+creditCountH+creditCountB+creditCountS 
				+" times is the total Credit Operations " );
		System.out.println(debitCountI+debitCountH+debitCountB+debitCountS 
				+" times is the total Debit Operations " );
	}
	
	void indCredCount() {
		System.out.println("ICICI bank Credit Operations are "+creditCountI+" times");
		System.out.println("HDFC bank Credit Operations are "+creditCountH+" times");
		System.out.println("BOB bank Credit Operations are "+creditCountB+" times");
		System.out.println("SBI bank Credit Operations are "+creditCountS+" times");
	}
	
	void indDebCount() {
		System.out.println("ICICI bank Debit Operations are "+debitCountI+" times");
		System.out.println("HDFC bank Debit Operations are "+debitCountH+" times");
		System.out.println("BOB bank Debit Operations are "+debitCountB+" times");
		System.out.println("SBI bank Debit Operations are "+debitCountS+" times");
	}
	
	
	public static void main(String[] args) {
		Bank bank=new Bank();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter operation to continue");
		String op = sc.next().toLowerCase();
		
		System.out.println("Enter bank to continue");
		String bankN = sc.next().toUpperCase();
		
		System.out.println("Enter total amount ");
		int totAmt = sc.nextInt();
		
		System.out.println("Enter required amount to continue");
		int amt = sc.nextInt();
		
		
		bank.operations(op, bankN,amt,totAmt);
		bank.totBalPrint();
		bank.totCredDebCountPrint();
		bank.indCredCount();
		bank.indDebCount();
		
		
	}
	
	
}
