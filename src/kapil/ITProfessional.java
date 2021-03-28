package kapil;

class ITProfessional{

    String Name;
	boolean Weekends;
	boolean Tea;
	boolean Coffee;
	boolean Alcohol;
	
	void professional(String A, boolean B ,boolean C, boolean D, boolean E){
	      Name = A;
		  Weekends = B;
		  Tea = C;
		  Coffee = D;
		  Alcohol = E;
	}	  
	
	void displayInfo(){
	      System.out.println("Name = " +Name);
		  System.out.println("Party on Weekends =" +Weekends);
		  System.out.println("Addicted to tea =" +Tea);
		  System.out.println("Addicted to Coffee =" +Coffee);
		  System.out.println("Addicted to Alcohol =" +Alcohol);
		}
	
	public static void main(String[] args){
	      ITProfessional itprofessional = new ITProfessional();
		  itprofessional.professional(" Arun", true,true,false,false);
		  itprofessional.displayInfo();
		}
}		