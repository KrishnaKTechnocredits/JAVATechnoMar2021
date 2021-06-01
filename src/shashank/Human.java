package shashank;
class Human{
     String humanName;
	 boolean canSpeak;
	 int humanAge;
	 public void humanName(String name)
	 {
		 humanName=name;
	 }
	 public void canSpeak(boolean speak)
	 {
		 canSpeak=speak;
	 }
	 public void humanAge(int age)
	 {
		 humanAge=age;
	 }
	 public void showDetails()
	 {
		 System.out.println("Persons Name is:- " + humanName);
		 System.out.println("Does person able to speak? :- " + canSpeak);
		 System.out.println("Persons age is:- " + humanAge);
	 }
	 public static void main(String args[])
	 {
		 Human human = new Human();
		 human.humanName("Shashank Dharmadhikari");
		 human.canSpeak(true);
		 human.humanAge(26);
		 human.showDetails();
	 }
}