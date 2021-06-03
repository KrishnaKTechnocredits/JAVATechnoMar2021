/*
 * 1. return all the arm-strong number from given array.
input: [153,279,371,303,407]
output: [153,371,407]

public ArrayList<Integer> getArmStrongNumber(int number[]){
	//write your logic
}

2. Return all the words having more than two vowels from given array.
input: ["aashay","sandesh","madhavi","ankit","ami","priyanka"]
output: ["aashay","madhavi","priyanka"]

public ArrayList<String> getVowels(String words[]){
	//write your logic
}

Notes : 22nd May'2021

Thread Class Method :
1) start
2) run
3) setName
4) getName
5) setPriority --- [1 to 10 : 1 lowest & 10 Max]
6) getPriority
7) sleep
8) join
9) yield

------------------------------------------------

Why We need Collections framework or Limitations of Array.
1) Size limitation
2) functionality like remove duplicates, sorted order while inserting elements
3) operations on data [insert, remove, replace, search]
4) Heterogeneous objects without size limitation. 

Object[] arr = new Object[5];
arr[0] = "Maulik";
arr[1] = 1;
arr[2] = 5943098530;

Why we need Collection/Collections Framework : 
When we want to store Heterogeneous objects without size limitation, we need Collections framework.

------------------------------------------------------
Collections Framework : 

1) List : 
-> List is an interface
-> Duplicate is allowed & maintains insertion order.

ArrayList: 
-> ArrayList is a class, parent is List interface
-> ArrayList allows duplicates and it maintains insertion order.

ArrayList nameList = new ArrayList();
nameList.add("Aashvi");
nameList.add("Techno");
nameList.add("Krishna");
nameList.add(1);
nameList.add(true);

ArrayList Methods:
1) boolean add(Object obj)
2) int size()
3) Object get(int index)
4) Object remove(int index)
5) void add(int index, Object obj)
6) Object set(int index, Object obj)
7) boolean contains(Object obj)

Programming Test - 12 : 22nd May'2021

1) ArrayList<Integer> filerNumber(ArrayList<Integer> arr) [15 mins]
all the numbers, which is div by 3 or by 5 or by 3 & 5.

input : [10,2,3,6,15,44,32]
output : 10,3,6,15

2) int countName(ArrayList<String> arr, String targetName) []

input : ["Vaibhav", "Aashay", "Prashant", "Aashay", "Aashay", "Anubhav"]
target name : Aashay and replace the target name with Technocredits
Replace targetName with Technocredits
output : ["Vaibhav", "Technocredits", "Prashant", "Technocredits", "Technocredits", "Anubhav"] 
output : 3

Hint : Loop should be travesered only 3 times or occurance of target name.
Hint : contains, indexOf, set

One of the logic could be as below. [please write different logic]

static int countName(ArrayList<String> arr, String targetName){
	for(int index = 0 ; index<arrList.size();index++){ // 50
		if(arrList.get(index).equals("Aashay")){
			count++;
			arrList.set(index,"Technocredits");
		}
	}
	sop(arrList);	
	return count;
}
	
main(){
	ArrayList<String> nameList = new ArrayList<String)();
	nameList.add("Aashay");
	nameList.add("Surbhi");
	nameList.add("Aashvi");
	
	int ans = countName(nameList, "Aashay");
	sop(nameList); // 
}






 */
 package rupali.codingexam;
 import java.util.ArrayList;
 

public class Armstrong {
	public ArrayList<Integer> getArmstrongNumber(int[] numbers){
		ArrayList<Integer> number=new ArrayList<Integer>();
		int temp1=0,temp2=0,temp3=0;
		for(int index=0;index<numbers.length;index++) {
			temp1=0;
			temp3=0;
			temp2=numbers[index];
			while(temp2>0) {
				temp1=temp2%10;
				temp2=temp2/10;
				temp3=temp3+(temp1*temp1*temp1);
			}
			if(numbers[index]==temp3)
				number.add(temp3);
		}
		
		return number;
	}

	public static void main(String[] args) {
		int[] arr= {153,279,371,303,407};
		Armstrong armstrong=new Armstrong();
		System.out.println("Input array is: ");
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
		System.out.println("Output array is: ");
		ArrayList<Integer> output = armstrong.getArmstrongNumber(arr);
		System.out.println(output);
	}
}
