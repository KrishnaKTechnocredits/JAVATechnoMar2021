package monika.Practise1.Revision2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import org.omg.CORBA.INTERNAL;

public class Practice_Collections {
	Integer num = 1;

	static void m1() {

		ArrayList<Object> arr = new ArrayList<Object>();
		/*
		 * Integer i = new Integer(10); arr.add(i); System.out.println(arr); //10
		 * 
		 * ArrayList<Student> arr1 = new ArrayList<Student>(); Student s1 = new
		 * Student(); s1.setName("Monika").toString(); s1.setName("Sonika").toString();
		 * arr1.add(s1); System.out.println(arr1);
		 * 
		 */

		arr.add(10);
		arr.add(15);
		arr.add("Monika");
		arr.add(12);
		arr.add('c');
		arr.add(1);
		arr.add('d');
		arr.add('c');
		arr.add("Monika");
		arr.add(null);
		System.out.println(arr);
		/*Integer n = 1;*/
/*		arr.remove(n);
		arr.remove(new String("Monika"));
		arr.remove(new Character('c'));*/
/*		System.out.println(arr.remove(0));
*/		System.out.println(arr);
/*		System.out.println(arr.set(4,"Mk"));
*/

	System.out.println(arr.contains('c'));
	arr.clear();
	System.out.println(arr.get(12));
	System.out.println(arr);
	}
	
	static void getUniqueList(String[] strArr1, String[] strArr2) {
		List<String> strList1 = Arrays.asList(strArr1); // read Only List
		List<String> strList2 = Arrays.asList(strArr2);
	//	System.out.println(strList1.remove(0)); -> UnsupportedOperationsException
		ArrayList<String> arrList1 = new ArrayList<String>(strList1);
		ArrayList<String> arrList2 = new ArrayList<String>(strList2);
		System.out.println(arrList1.removeAll(arrList2));
		System.out.println("arrlist1 : "+arrList1);
		System.out.println("arrlist2 : "+arrList2);
	}
	
	static void getUniqueListOFIntegers(Integer[] intArr1, Integer[] intArr2) {
		List<Integer> strList1 = Arrays.asList(intArr1); // read Only List
		List<Integer> strList2 = Arrays.asList(intArr2);
	//	System.out.println(strList1.remove(0)); -> UnsupportedOperationsException
		ArrayList<Integer> arrList1 = new ArrayList<Integer>(strList1);
		ArrayList<Integer> arrList2 = new ArrayList<Integer>(strList2);
		System.out.println(arrList1.removeAll(arrList2));
		System.out.println("arrlist1 : "+arrList1);
		System.out.println("arrlist2 : "+arrList2);
	}
	
	
	

	public static void main(String[] args) {
		
		String[] strArr1 = {"maulik", "Ashvi", "Krishna"};
		String[] strArr2 = {"maulik", "Ashvi", "Harsh", "Techno"};
		getUniqueList(strArr1,strArr2);
	//	m1();
		
		Integer[] intArr1 = {10,12,13,13,144,12};
		Integer[] intArr2 = {13,456,343,2342213};
		getUniqueListOFIntegers(intArr1, intArr2);
		
		//Play with ArrayList constructor what all can accept - int, collections
		ArrayList<Object> arr = new ArrayList<Object>(strArr1.length);
		for(int index=0;index<strArr1.length;index++) {
			arr.add(strArr1[index]);
		}
		System.out.println("***"+arr);
		
		
		ArrayList<Object> arrListNew1 = new ArrayList<Object>();
		arrListNew1.add(12);
		arrListNew1.add("Monika");
		arrListNew1.add('d');
		arrListNew1.add("Monika");
		System.out.println(arrListNew1);
		
		HashSet<Object> hashSetNew1 = new HashSet<Object>();
		hashSetNew1.add(12);
		hashSetNew1.add("Monika");
		hashSetNew1.add('d');
		hashSetNew1.add(12);


		Systemskype.out.println(hashSetNew1);//unique elements + order
	}

}
