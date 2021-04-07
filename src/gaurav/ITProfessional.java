package gaurav;

//Create a class named as ITProfessional which contain below methods
//Assignment 3

class ITProfessional{
	String empname;
	boolean partyOnWeekend;
	boolean addicatedToTea;
	boolean addicatedToCoffee;
	boolean addicatedToAlocohal;
	
	void empname(String name){
		empname=name;
	 }
	void doesPartyOnWeekend(boolean p){
		partyOnWeekend = p;
	 }
    void isAddicatedToTea(boolean t){
		addicatedToTea = t;	
	 }
    void isAddicatedToCoffee(boolean a){
		addicatedToCoffee = a;
	 }
	void isAddicatedToAlocohal(boolean b){
		addicatedToAlocohal = b;
	 }
	 void displayInfromation(){
		System.out.println("Employee name is : " + 	empname);
		System.out.println("Party on weekend : " +	 partyOnWeekend);
		System.out.println("Is he addicated to tea : " + addicatedToTea);
		System.out.println("Is he addicated to coffee : " +addicatedToCoffee);
		System.out.println("Is he addicated to alocohal: " +addicatedToAlocohal);
	 }
	 public static void main(String[]args){
		ITProfessional professional = new ITProfessional();
		professional.empname("Rohan");
		professional.doesPartyOnWeekend(true);
		professional.isAddicatedToTea(true);
		professional.isAddicatedToCoffee(false);
		professional.isAddicatedToAlocohal(false);
		professional.displayInfromation();
	 }
}
	 