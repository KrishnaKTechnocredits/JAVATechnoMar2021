package bhushan;
class ITProfessional{
	String empName;
	boolean flag1,flag2,flag3,flag4;
	void empName(String eName) {
		empName = eName;
	}
    void doesPartyOnWeekend(boolean flg1){
		flag1 = flg1;
	}
	void isAddictedToTea(boolean flg2){
		flag2 = flg2;
	}
	void isAddictedToCoffee(boolean flg3){
		flag3 = flg3;
	}
	void isAddictedToAlcohol(boolean flg4){
		flag4 = flg4;
	}
	void displayInformation(){
	System.out.println("Employee Name is: "+empName+"\nIs Party On Weekend:" +flag1+"\nIs Addicted To Tea: "+flag2+"\nIs Addicted To Coffee: "+flag3+"\nIs Addicted To Alcohol: "+flag4);
	}
	public static void main(String[] args){
		ITProfessional itProfessional1 = new ITProfessional();
		itProfessional1.empName("James");
		itProfessional1.doesPartyOnWeekend(true);
		itProfessional1.isAddictedToTea(false);
		itProfessional1.isAddictedToCoffee(true);
		itProfessional1.isAddictedToAlcohol(false);
		itProfessional1.displayInformation();
	}
}