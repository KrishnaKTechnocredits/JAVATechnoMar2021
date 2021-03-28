package bhavana;
class ITProfessional{
	String name;
	boolean weekendParty,teaAddiction,coffeeAddiction,alcoholAddiction;
	
	void setDetails(String person_name,boolean partiesOnWeekend,boolean teaAddict,boolean coffeeAddict,boolean alcoholaddict){
		name=person_name;
		weekendParty=partiesOnWeekend;
		teaAddiction=teaAddict;
		coffeeAddiction=coffeeAddict;
		alcoholAddiction=alcoholaddict;
	}
	
	void displayInfo(){
		System.out.println("Name of the person is:"  +name);
		System.out.println("Is parties on weekends:" +weekendParty);
		System.out.println("Is tea addict:" +teaAddiction);
		System.out.println("Is coffee addict:" +coffeeAddiction);
		System.out.println("Is alcohol addict:" +alcoholAddiction);
	}
	
	public static void main(String[] args){
		ITProfessional ITP= new ITProfessional();
		ITP.setDetails("Gopal",true,false,true,false);
		ITP.displayInfo();
	}
}