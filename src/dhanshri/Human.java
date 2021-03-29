package dhanshri;

public class Human{
 String nameHuman;
 boolean humanSpeak;
 int age;
 
 void humanName(String hName){
  nameHuman = hName;
 }
 
 void canSpeak(boolean flag){
  humanSpeak = flag;
 }

 void humanAge( int hAge){
  age = hAge;
 }

 void showDetails(){
  System.out.println("Human name is "+nameHuman);
  System.out.println("Age of human is "+age);
  System.out.println("Can he/She Speak :"+humanSpeak);
  }
 public static void main(String[] args){
 Human human = new Human();
 human.humanName("Dhanshri");
 human.humanAge(25);
 human.canSpeak(true);
 human.showDetails();
 }
}