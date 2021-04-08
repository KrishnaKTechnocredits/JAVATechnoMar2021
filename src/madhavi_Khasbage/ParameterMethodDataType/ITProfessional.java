package madhavi_Khasbage.ParameterMethodDataType;

class ITProfessional 
{
	String empName;
	boolean isParty;
	boolean isTea;
	boolean isCoffee;
	boolean isAlcohol;
	int age;	
	void setEmpName(String eName){
		empName=eName;
	}
	
	void doesPartyOnWeekend(boolean isParty1){
		isParty=isParty1;
	}
	
	void isAddictedToTea(boolean isTea1){
		isTea=isTea1;
	}
	
	void isAddictedToCoffee(boolean isCoffee1){
		isCoffee=isCoffee1;
	}
	
	void isAddictedToAlcohol(boolean isAlcohol1){
		isAlcohol=isAlcohol1;
	}
	
	void displayInformation(){
		System.out.println("Employee name = " + empName);
		System.out.println("Party on weekend = " + isParty);
		System.out.println("Addicted to tea  = " + isTea);
		System.out.println("Addicted to coffee  = " + isCoffee);
		System.out.println("Addicted to alcohol  = " + isAlcohol);
	}	   
	public static void main(String[] agrs){
		ITProfessional objITProfessional=new ITProfessional();
		objITProfessional.setEmpName("Madhavi Khasbage");
		objITProfessional.doesPartyOnWeekend(true);
		objITProfessional.isAddictedToTea(false);
		objITProfessional.isAddictedToCoffee(true);
		objITProfessional.isAddictedToAlcohol(false);
		objITProfessional.displayInformation();
	}
	
}