package shashank;
class ITProfessional
{
	String employeeName;
	boolean partyOnweekend;
	boolean addictedToTea;
	boolean addictedToCofee;
	boolean addictedToAlchol;
	
	public void empName(String empName)
	{
		employeeName=empName;
	}
	public void doesPartyOnWeekend(boolean partyOnweekend)
	{
		this.partyOnweekend=partyOnweekend;
	}
	public void isAddictedToTea(boolean addictedToTea)
	{
		this.addictedToTea=addictedToTea;
	}
	public void isAddictedToCoffee(boolean addictedToCofee)
	{
		this.addictedToCofee=addictedToCofee;
	}
	public void isAddictedToAlcohol(boolean addictedToAlchol)
	{
		this.addictedToAlchol=addictedToAlchol;
	}
	public void displayInformation()
	{
		System.out.println("Employee Name is:- " + employeeName);
		System.out.println("Does party on weekend:- " + partyOnweekend);
		System.out.println("Is " + employeeName + " addited to tea:- " + addictedToTea);
		System.out.println("Is " + employeeName + " addicted To Cofee:- " + addictedToCofee);
		System.out.println("Is " + employeeName + " addicted To Alchol:- " + addictedToAlchol);
	}
	public static void main(String args[])
	{
		ITProfessional itprofessional = new ITProfessional();
		itprofessional.empName("Shashank");
		itprofessional.doesPartyOnWeekend(false);
		itprofessional.isAddictedToTea(true);
		itprofessional.isAddictedToCoffee(true);
		itprofessional.isAddictedToAlcohol(false);
		itprofessional.displayInformation();
	}
	
}