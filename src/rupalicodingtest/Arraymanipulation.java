/*WAP to return the sum of all elements of an array, except ignore sections of numbers starting with 6 and extending to the next 9. Return 0 for No numbers.

input 1: [1,3,5]

output 1: 9

input 2 : [4,5,6,12,2,9,1,3]

output 2: 13

input 3 : [2,1,6,9,11,6,19,12,9,2]

output 3: 16

input 4 : [6,1,4,5,9]

output 4 : 0
 * 
 */
package rupalicodingtest;

public  class Arraymanipulation {
	public static int getarrayinput(int[] arr) {
		int ans=0;
		for(int index=0;index<arr.length;index++) {
			if(arr[index]==6) {
				do{
					index++;
				}while(arr[index]!=9);
			if(arr[index]==9 )
					index++;
			}
			if(index!=arr.length)
			ans=ans+arr[index];
		}
		return ans;
	}
	public static void main(String[] args) {
		int[] arr1= {1,3,5};
		int[] arr2= {4,5,6,12,2,9,1,3};
		int[] arr3= {2,1,6,9,11,6,19,12,9,2};
		int[] arr4= {6,1,4,5,9};
		System.out.println(getarrayinput(arr1));
		System.out.println(getarrayinput(arr2));
		System.out.println(getarrayinput(arr3));
		System.out.println(getarrayinput(arr4));
		
	}
}
