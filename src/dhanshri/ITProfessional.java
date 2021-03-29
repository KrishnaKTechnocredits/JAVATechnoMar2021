package dhanshri;

public class ITProfessional {
 String employeNam;
 boolean partyOnWeelend;
 boolean addictedToTea;
 boolean addictedToCoffee;
 boolean addictedToAlcohol;
 
 void empName(String eName){
  employeNam = eName;
 }

 void doesPartyOnWeekend(boolean flag){
  partyOnWeelend = flag;
 }
 
 void isAddictedToTea(boolean flag){
  addictedToTea = flag;
 }
 
 void isAddictedToCoffee(boolean flag){
  addictedToCoffee = flag;
 }
 
 void isAddictedToAlcohol(boolean flag){
  addictedToAlcohol = flag;
 }

 void displayInformation(){
  System.out.println("Emplyee name is "+employeNam);
  System.out.println("Does he/She party on weekend "+partyOnWeelend);
  System.out.println("Is he/She Addicted to tea "+addictedToTea);
  System.out.println("Is he/She Addicted to coffee "+addictedToCoffee);
  System.out.println("Is he/She Addicted to alcohol "+addictedToAlcohol);
 }
 
 public static void main(String[] args){
  ITProfessional iTProfessional = new ITProfessional();
  iTProfessional.empName("Dhanshri");
  iTProfessional.doesPartyOnWeekend(true);
  iTProfessional.isAddictedToTea(true);
  iTProfessional.isAddictedToCoffee(false);
  iTProfessional.isAddictedToAlcohol(false);
  iTProfessional.displayInformation();
 }
}