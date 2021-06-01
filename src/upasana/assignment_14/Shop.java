package upasana.assignment_14;

import java.util.Scanner;

public class Shop {
	int maggieTQty;
	int dosaTQty;
	int pouchestQty;
	int panipuriTQty;
	int masalaTQty;
	
	
	public void setQty(int maggieReqQty,int dosaReqQty,int pouchesReqQty,int panipuriReqQty,int masalaReqQty) {
		maggieTQty = maggieReqQty;
		dosaTQty = dosaReqQty;
		pouchestQty = pouchesReqQty;
		panipuriTQty =  panipuriReqQty;
		masalaTQty= masalaReqQty;
		
	}
	
	public void purchaseItems(int maggieReqQty,int dosaReqQty,int pouchesReqQty,int panipuriReqQty,int masalaReqQty,boolean pSAllowed) {
		if(maggieReqQty>0) {
			if(maggieReqQty<=maggieTQty) {
				maggieTQty = maggieTQty - maggieReqQty;
				System.out.println("Available qty of maggie is "+maggieTQty + "  and sold qty of maggie is "+maggieReqQty);
			}	
			else {
				if(pSAllowed) {
					maggieTQty=maggieReqQty-maggieTQty;
					System.out.println("All the packets of maggie are sold ");
					System.out.println("Available qty of maggie is "+maggieTQty + "  and sold qty of maggie is "+maggieTQty);	
					maggieTQty=0;
				}
				else
					System.out.println("Available qty of maggie is "+maggieTQty + "  and requested qty of maggie which is not sold as it exceeds the available qty is "+maggieReqQty);		
			}
		}
	
		if(dosaReqQty>0) {
			if(dosaReqQty<=dosaTQty) {
				dosaTQty = dosaTQty - dosaReqQty;
				System.out.println("Available qty of dosa is "+dosaTQty + "  and sold qty of dosa is "+dosaReqQty);
			}	
			else {
				if(pSAllowed) {
					dosaTQty=dosaReqQty-dosaTQty;
					System.out.println("All the packets of dosa are sold ");
					System.out.println("Available qty of dosa is "+dosaTQty + "  and sold qty of dosa is "+dosaTQty);		
					dosaTQty=0;
				}
				else
					System.out.println("Available qty of dosa is "+dosaTQty + "  and requested qty of dosa which is not sold as it exceeds the available qty is "+dosaReqQty);		
						
		}
	}
			
		if(pouchesReqQty>0) {
			if(pouchesReqQty<=pouchestQty) {
				pouchestQty = pouchestQty - pouchesReqQty;
				System.out.println("Available qty of pouches is "+pouchestQty + "  and sold qty of pouches is "+pouchesReqQty);
			}	
			else {
				if(pSAllowed) {
					pouchestQty=pouchesReqQty-pouchestQty;
					System.out.println("All the packets of pouches are sold ");
					System.out.println("Available qty of pouches is "+pouchestQty + "  and sold qty of pouches is "+pouchestQty);		
					pouchestQty=0;
				}
				else
					System.out.println("Available qty of pouches is "+pouchestQty + "  and requested qty of pouches which is not sold as it exceeds the available qty is "+pouchesReqQty);		
						
		  }
	   }
		
		if(panipuriReqQty>0) {
			if(panipuriReqQty<=panipuriTQty) {
				panipuriTQty = panipuriTQty - panipuriReqQty;
				System.out.println("Available qty of panipuri is "+panipuriTQty + "  and sold qty of panipuri is "+panipuriReqQty);
			}	
			else {
				if(pSAllowed) {
					panipuriTQty=panipuriReqQty-panipuriTQty;
					System.out.println("All the packets of panipuri are sold ");
					System.out.println("Available qty of panipuri is "+panipuriTQty + "  and sold qty of panipuri is "+panipuriTQty);		
					panipuriTQty=0;
				}
				else
					System.out.println("Available qty of panipuri is "+panipuriTQty + "  and requested qty of panipuri which is not sold as it exceeds the available qty is "+panipuriReqQty);		
						
			}
		}
		
		if(masalaReqQty>0) {
			if(masalaReqQty<=masalaTQty) {
			masalaTQty = masalaTQty - masalaReqQty;
			System.out.println("Available qty of masala is "+masalaTQty + "  and sold qty of masala is "+masalaReqQty);
			}	
			else {
				if(pSAllowed) {
					masalaTQty=masalaReqQty-masalaTQty;
					System.out.println("All the packets of masala are sold ");
					System.out.println("Available qty of masala is "+masalaTQty + "  and sold qty of masala is "+masalaTQty);		
					masalaTQty=0;
				}
				else
					System.out.println("Available qty of masala is "+masalaTQty + "  and requested qty of masala which is not sold as it exceeds the available qty is "+masalaReqQty);		
						
			}
		}
	}
		public void outOfStock() {
			if(maggieTQty==0)
				System.out.println("Maggie is out of stock");
			if(dosaTQty==0)
				System.out.println("dosa is out of stock");
			if(pouchestQty==0)
				System.out.println("pouche is out of stock");
			if(panipuriTQty==0)
				System.out.println("panipuri is out of stock");
			if(masalaTQty==0)
				System.out.println("panipuri is out of stock");
					
	}
	
	public void availableInStock() {
		if(maggieTQty > 0)
			System.out.println("Available qty of maggie is "+ maggieTQty);
		if(dosaTQty>0)
			System.out.println("Available qty of dosa is "+ dosaTQty);
		if(pouchestQty>0)
			System.out.println("Available qty of pouches is "+ pouchestQty);	
		if(panipuriTQty>0)
			System.out.println("Available qty of panipuri is "+ panipuriTQty);
		if(masalaTQty>0)
			System.out.println("Available qty of masala is "+ masalaTQty);
	}
	public static void main(String[] args) {
		Shop shop = new Shop();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter total maggie qty : ");
		int maggieT = scanner.nextInt();
		
		System.out.println("Enter total dosa qty : ");
		int dosaT = scanner.nextInt();
		
		System.out.println("Enter total pouches qty : ");
		int pouchesT = scanner.nextInt();
		
		System.out.println("Enter total panipuri qty : ");
		int panipuriT = scanner.nextInt();
		
		System.out.println("Enter total masala qty : ");
		int masalaT = scanner.nextInt();
		
		shop.setQty(maggieT,dosaT,pouchesT,panipuriT,masalaT);
		
		System.out.println("Enter req maggie qty : ");
		int maggie = scanner.nextInt();
		
		System.out.println("Enter req dosa qty : ");
		int dosa = scanner.nextInt();
		
		System.out.println("Enter req pouches qty : ");
		int pouches = scanner.nextInt();
		
		System.out.println("Enter req panipuri qty : ");
		int panipuri = scanner.nextInt();
		
		System.out.println("Enter req masala qty : ");
		int masala = scanner.nextInt();
		
		System.out.println("Want to proceed with partial shopping  ? ");
		boolean tf = scanner.nextBoolean();
		
		shop.purchaseItems(maggie,dosa,pouches,panipuri,masala,tf);  
		shop.availableInStock();
		shop.outOfStock( );
	}
}