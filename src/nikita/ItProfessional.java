package nikita;

public final class ItProfessional {

		String name;
		boolean party;
		boolean addictedt;
		boolean addictedc;
		boolean alcohol;
			
		void empName(String epname)
		{
		 name=epname;	 
		}
		
		void doesPartyOnWeekend(boolean pw)
		{ 
		 party=pw;
		}

		void isAddictedToTea(boolean at)
		{ 
		 addictedt=at;
		}

		void isAddictedToCoffee(boolean ac)

		{
		 addictedc=ac;
		}

		void isAddictedToAlcohol(boolean al)
		{
		 alcohol=al;
		}
		
		void displayInformation()
		{
		 System.out.println("Emplyee name is:" +name);
		 System.out.println("Does employee party:"+party);
		 System.out.println("Is employee addicted to tea:"+addictedt);
		 System.out.println("Is employee addicted to coffee:"+addictedc);
		 System.out.println("Is employee addicted to alcohol:"+alcohol);
		}
		public static void main(String[] args)

		{
		 ItProfessional it1=new ItProfessional();
		 it1.empName("Nikita");
		 it1.doesPartyOnWeekend(true);
		 it1.isAddictedToTea(true);
		 it1.isAddictedToCoffee(true);
		 it1.isAddictedToAlcohol(false);
		 it1.displayInformation();        
		}
	}

