package parakh;

public class Human{

      String name;
	  boolean canSpeak;
	  int age;
	   
	  void humanName(String humanName){
	       name = humanName;
	  }
	  
	  void canSpeak(boolean speak){
	       canSpeak = speak;
	  }
	  
	  void humanAge(int humanAge){
	       age = humanAge;
	  }
	  
	  void showDetails(){
	       System.out.println("Human Name: " +name +"\n" +"Can human speak: " +canSpeak + "\n" + "Human Age: " +age);
	  }
	  
	  public static void main(String args[]){
	       Human human = new Human();
		   human.humanName("Rohit");
		   human.canSpeak(true);
		   human.humanAge(45);
		   human.showDetails();
		   }
}