package technocredits.arrayDemo.setDemo;

import java.util.HashSet;

public class Example10 {

	public static void main(String[] args) {
		Integer[] arr = {76993, 76994,76995,76994,76123, 76993};
		HashSet<Integer> hs = new HashSet<Integer>(); 
		for(int id : arr) {
			if(!hs.add(id))
				System.out.println("Id - " + id + " is duplicate");
		}
		System.out.println(hs.size());
	}
}
