package technocredits.collectionDemo.listDemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example14 {
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		//List<Integer> temp = Arrays.asList(arr);
		
		List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
		/*list.remove(0);
		list.remove(1);
		
		System.out.println(list);
		
		list.forEach(item ->{
			System.out.println(item);
		});*/
		
		List<Integer> ans= list.stream().filter(element -> (element % 2 == 0)).collect(Collectors.toList());
		System.out.println(ans);
	}
}
