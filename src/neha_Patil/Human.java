package neha_Patil;

public class Human {
	  String pName;
	  boolean canSpeak;
	  int pAge;
	  
	  void humanName(String Name){
	      pName = Name;
		  }
      void canSpeak(boolean speak ){
		    canSpeak = speak;
		  }
		  void humanAge(int Age){
		     pAge = Age;
	 }
	 void showdetails(){
	 System.out.println("Name is "+ pName);
	 System.out.println("Can Speak "+canSpeak);
	 System.out.println("Age is "+pAge);
	 }
	 public static void main(String[] args){
	 Human h = new Human();
	 h.humanName("Vrishank");
	 h.canSpeak(true);
	 h.humanAge(3);
	 h.showdetails();
}

}
