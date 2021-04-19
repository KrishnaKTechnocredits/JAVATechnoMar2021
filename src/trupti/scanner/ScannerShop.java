package trupti.scanner;

import java.util.Scanner;


	/*Assignment  7  : 30th March 2021 
	1. Create a system (Shop) which maintains each item's quantity.
	a. Initial stocks of Maggie: 50 Maggie packets 
	b. Initial stocks of Dosa : 43 packets 
	c. Initial stocks of pouches : 39 oil packets 
	d. Initial stocks of panipuri : 43 packets  
	e. Initial stocks of masala’s : 73 packets.*/

	public class ScannerShop {
		String maggie,dosa,pouches,panipuri,masala;
		int maggieStock,dosaStock,pouchesStock,panipuriStock,masalaStock;
		
		void setInitialQuantity(int maggie,int dosa,int pouches,int panipuri,int masala) {
			maggieStock=maggie;
			dosaStock=dosa;
			pouchesStock=pouches;
			panipuriStock=panipuri;
			masalaStock=masala;
		}
		
		void requestedQuantity(int reqMaggie,int reqDosa,int reqPouches,int reqPanipuri,int reqMasala,String pAllowedStatus) {
			if(reqMaggie<=maggieStock) {
				maggieStock=maggieStock-reqMaggie;
			}
			else {
				System.out.println("Sorry,not sufficient stock.We can give you only "+maggieStock);
				System.out.println("Maggie in stock is : "+maggieStock+" and requested quantity is :"+reqMaggie+" Running out of stock ");
			if(pAllowedStatus.equals("PAllowed")) {
				maggieStock=0;
			}
			}
			
			if(reqDosa<=dosaStock) {
				dosaStock=dosaStock-reqDosa;
			}
			else {
				System.out.println("Sorry,not sufficient stock.We can give you only "+dosaStock);
				System.out.println("Dosa in stock is : "+dosaStock+" and requested quantity is :"+reqDosa+" Running out of stock ");
			if(pAllowedStatus.equals("PAllowed")) {
				dosaStock=0;
			}
			}
			
			if(reqPouches<=pouchesStock) {
				pouchesStock=pouchesStock-reqPouches;
			}
			else {
				System.out.println("Sorry,not sufficient stock.We can give you only "+pouchesStock);
				System.out.println("Pouches in stock is : "+pouchesStock+" and requested quantity is :"+reqPouches+" Running out of stock ");
			if(pAllowedStatus.equals("PAllowed")) {
				pouchesStock=0;
			}
			}
			
			if(reqPanipuri<=panipuriStock) {
				panipuriStock=panipuriStock-reqPanipuri;
			}
			else {
				System.out.println("Sorry,not sufficient stock.We can give you only "+panipuriStock);
				System.out.println("Panipuri in stock is : "+panipuriStock+" and requested quantity is :"+reqPanipuri+" Running out of stock ");
			if(pAllowedStatus.equals("PAllowed")) {
				panipuriStock=0;
			}
			}
			
			if(reqMasala<=masalaStock) {
				masalaStock=masalaStock-reqMasala;
			}
			else {
				System.out.println("Sorry,not sufficient stock.We can give you only "+masalaStock);
				System.out.println("Masala in stock is : "+masalaStock+" and requested quantity is :"+reqMasala+" Running out of stock ");
			if(pAllowedStatus.equals("PAllowed")) {
				masalaStock=0;
			}
			}
		}
		
		void outOfStock() {
			if(maggieStock==0)
				System.out.println("Maggie is out of stock.");
			if(dosaStock==0)
				System.out.println("Dosa is out of stock.");
			if(pouchesStock==0)
				System.out.println("Pouches are out of stock.");
			if (panipuriStock==0)
				System.out.println("Panipuri is out of stock.");
			if (masalaStock==0)
				System.out.println("Masala is out of stock.");
		}
		
		void displayQuantity(){
			System.out.println("Maggie available in stock "+maggieStock);
			System.out.println("Dosa available in stock "+dosaStock);
			System.out.println("Pouches available in stock "+pouchesStock);
			System.out.println("Panipuri available in stock "+panipuriStock);
			System.out.println("Masala available in stock "+masalaStock);
		}
		
		public static void main(String[] args) {
			ScannerShop scannershop=new ScannerShop();
			Scanner scanner=new Scanner(System.in);
			System.out.println("Enter Initial quantity");
			String inputNumber1=scanner.nextLine();
			int number1=Integer.parseInt(inputNumber1);
			String inputNumber2=scanner.nextLine();
			int number2=Integer.parseInt(inputNumber2);
			String inputNumber3=scanner.nextLine();
			int number3=Integer.parseInt(inputNumber3);
			String inputNumber4=scanner.nextLine();
			int number4=Integer.parseInt(inputNumber4);
			String inputNumber5=scanner.nextLine();
			int number5=Integer.parseInt(inputNumber5);
			scannershop.setInitialQuantity(number1,number2,number3,number4,number5);
			scannershop.displayQuantity();
			System.out.println("Enter Requested quantity");
			String inputNumber6=scanner.nextLine();
			int number6=Integer.parseInt(inputNumber6);
			String inputNumber7=scanner.nextLine();
			int number7=Integer.parseInt(inputNumber7);
			String inputNumber8=scanner.nextLine();
			int number8=Integer.parseInt(inputNumber8);
			String inputNumber9=scanner.nextLine();
			int number9=Integer.parseInt(inputNumber9);
			String inputNumber10=scanner.nextLine();
			int number10=Integer.parseInt(inputNumber10);
			String inputline=scanner.nextLine();
			scannershop.requestedQuantity(number6,number7,number8,number9,number10,inputline);
			scannershop.displayQuantity();
			scannershop.outOfStock(); 
			scanner.close();
		}

	}

	