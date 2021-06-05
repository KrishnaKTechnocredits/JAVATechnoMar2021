// **********************************************************************//
// *********************** Functions on ArrayList ***********************//
// **********************************************************************//

package vaibhav.Practive.Collections;

import java.util.ArrayList;

public class Example7_ArrayListFunctions {

	public static void main(String[] args) {

		ArrayList<String> inputArrList = new ArrayList<String>();

		inputArrList.add("index 0");
		inputArrList.add("index 1");
		inputArrList.add("index 2");
		inputArrList.add("TOREMOVE");
		inputArrList.add("TOREMOVE");

		System.out.println("Printing ArrayList : " + inputArrList);
		System.out.println("Size of Arraylist  : " + inputArrList.size());
		System.out.println("");

		// **********************************************************************//
		// *********************** boolean add (Object e) ***********************//
		// **********************************************************************//

		System.out.println("1. Adding elements in ArrayList by add(Object)");
		System.out.println("=======================================================================================");
		boolean b = inputArrList.add("(ADD opration)");
		boolean b1 = inputArrList.add("(ADD opration)");
		System.out.println("return type for add(object) is : " + b);
		System.out.println("Printing ArrayList : " + inputArrList);
		System.out.println("Size of Arraylist  : " + inputArrList.size());
		System.out.println("");

		// ***************************************************************************//
		// *********************** void add (int index, Object e) ********************//
		// ***************************************************************************//

		System.out.println("2. Adding elements in ArrayList by add (index , object)");
		System.out.println("=======================================================================================");
		inputArrList.add(1, "(ADDING at 1st Index)");
		System.out.println("Printing ArrayList : " + inputArrList);
		System.out.println("Size of Arraylist  : " + inputArrList.size());
		System.out.println("");

		// *********************************************************************//
		// ******************** boolean remove (Object e) **********************//
		// *********************************************************************//

		System.out.println("3. remove elements in ArrayList by remove (Object)");
		System.out.println("=======================================================================================");

		boolean b2 = inputArrList.remove("TOREMOVE");
		System.out.println("return type for remove(object) is : " + b2);
		System.out.println("Printing ArrayList : " + inputArrList);
		System.out.println("Size of Arraylist  : " + inputArrList.size());
		System.out.println("");

		// ***************************************************************************//
		// *********************** void add (int index, Object e) ********************//
		// ***************************************************************************//

		System.out.println("4. remove elements in ArrayList by remove (index)");
		System.out.println("=======================================================================================");
		int tempIndex = inputArrList.indexOf("TOREMOVE");
		String removedElement = inputArrList.remove(tempIndex);
		System.out.println("Removed element & its index form ArrayList is : " + removedElement + "  &  " + tempIndex);
		System.out.println("Printing ArrayList : " + inputArrList);
		System.out.println("Size of Arraylist  : " + inputArrList.size());
		System.out.println("");

		// ********************************************************************//
		// ************* int indexOf(Object) & int lastIndexOf(Object)*********//
		// ********************************************************************//

		System.out
				.println("5. Use of indexOf(Object) & lastIndexOf(Object) which returns index (on avaiable elements)");
		System.out.println("=======================================================================================");
		int indexof1 = inputArrList.indexOf("index 2");
		int indexof2 = inputArrList.indexOf("(ADD opration)");
		int lastIndexOf = inputArrList.lastIndexOf("(ADD opration)");
		System.out.println("Printing indexOF     'index 2'        : " + indexof1);
		System.out.println("Printing indexOF     '(ADD opration)' : " + indexof2);
		System.out.println("Printing lastIndexOF '(ADD opration)' : " + lastIndexOf);
		System.out.println("");

		System.out.println(
				"6. use of indexOf(Object) & lastIndexOf(Object) which returns index (on unavaiable elements)");
		System.out.println("=======================================================================================");

		int indexof3 = inputArrList.indexOf("'Not_Present_Element'");
		int lastIndexOf2 = inputArrList.lastIndexOf("'Not_Present_Element'");
		System.out.println("Printing indexOF     'Not_Present_Element' : " + indexof3);
		System.out.println("Printing lastIndexOF 'Not_Present_Element' : " + lastIndexOf2);
		System.out.println("");

		// ********************************************************************//
		// ************* Object set (index, Object)****************************//
		// ********************************************************************//

		System.out.println("7. replace elements in ArrayList by set (index, Object)");
		System.out.println("=======================================================================================");
		String replacedElementBySet = inputArrList.set(0, "(REPLACED_BY_SET)");
		System.out
				.println("use of set() on index 0 : which replaces " + replacedElementBySet + " by (REPLACED_BY_SET)");
		System.out.println("Printing ArrayList : " + inputArrList);
		System.out.println("Size of Arraylist  : " + inputArrList.size());
		System.out.println("");

		// ********************************************************************//
		// ************* Object get (index )***********************************//
		// ********************************************************************//

		System.out.println("8. get element at specified index using get (index)");
		System.out.println("=======================================================================================");
		int tempIndex1 = inputArrList.indexOf("index 2");
		System.out.println("index of 'index 2 ' is      : " + tempIndex1);
		String getElement = inputArrList.get(tempIndex1);
		System.out.println("Element at " + tempIndex1 + " using get() is : " + getElement);
		System.out.println("Printing ArrayList : " + inputArrList);
		System.out.println("Size of Arraylist  : " + inputArrList.size());
		System.out.println("");

		// ********************************************************************//
		// ************* boolean contains (Object)*****************************//
		// ********************************************************************//

		System.out.println("9. check element is present in ArrayList using contains (Object)");
		System.out.println("=======================================================================================");

		boolean isElementPresent1 = inputArrList.contains("index 0");
		boolean isElementPresent2 = inputArrList.contains("index 1");

		System.out.println("Printing ArrayList : " + inputArrList);
		System.out.println("Size of Arraylist  : " + inputArrList.size());
		System.out.println("Presence of 'index 0 ' in ArryList : " + isElementPresent1);
		System.out.println("Presence of 'index 1 ' in ArryList : " + isElementPresent2);
		System.out.println("");

		// **********************************************************//
		// ************* void clear () *****************************//
		// **********************************************************//

		System.out.println("10. Remove all elements of ArrayList using clear()");
		System.out.println("=======================================================================================");

		System.out.println("Printing ArrayList : " + inputArrList);
		System.out.println("Size of Arraylist  : " + inputArrList.size());
		System.out.println("");
		System.out.println("After using clear() ");
		System.out.println("");
		inputArrList.clear();

		System.out.println("Printing ArrayList : " + inputArrList);
		System.out.println("Size of Arraylist  : " + inputArrList.size());

	}

}
