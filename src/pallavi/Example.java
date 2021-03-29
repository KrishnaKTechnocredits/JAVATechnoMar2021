package pallavi;

class Example{
int empId=10;

void updateEmp(){
empId=100;
System.out.println(empId);
}

void showEmpId(){

System.out.println(empId);}

public static void main(String args[]){
Example emp=new Example();
//emp.empId
emp.showEmpId();
emp.updateEmp();
emp.showEmpId();


}

}