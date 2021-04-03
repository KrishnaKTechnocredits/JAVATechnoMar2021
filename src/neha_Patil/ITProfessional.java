package neha_Patil;

public class ITProfessional {
    String EmployeeName;
		boolean Party;
		boolean tea;
		boolean Coffee;
		boolean Alcohol;

		void empName(String name){		
			EmployeeName = name;
		}

		void doesPartyOnWeekend(boolean weekendparty){		
			Party = weekendparty;
		}

		void isAddictedToTea(boolean addictedtotea){
			tea = addictedtotea;
		}

		void isAddictedToCoffee(boolean addictedtocoffee){
			Coffee = addictedtocoffee;
		}

		void isAddictedToAlcohol(boolean addictedtoalcohol){
			Alcohol = addictedtoalcohol;
		}

		void showDetails(){		

			System.out.println("Employee Name is :                        "+ EmployeeName);
			System.out.println("Does this employee party on Weekend :     "+Party);
			System.out.println("Does this employee addicted to Tea: :     "+ tea);
			System.out.println("Does this employee addicted to Coffee:    "+ Coffee);
			System.out.println("Does this employee addicted to Alcohol:   "+ Alcohol);
		}

		public static void main(String[] args){
			ITProfessional Ip = new ITProfessional();
			Ip.empName("Narendra");
			Ip.doesPartyOnWeekend(true);
			Ip.isAddictedToTea(true);
			Ip.isAddictedToCoffee(false);
			Ip.isAddictedToAlcohol(true);
			Ip.showDetails();
		}
	}


