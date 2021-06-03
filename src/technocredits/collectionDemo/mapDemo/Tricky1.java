package technocredits.collectionDemo.mapDemo;

import java.util.HashMap;
import java.util.Set;

public class Tricky1 {

	static HashMap<Integer,HashMap<String,Object>> getEmpDetails(){
		HashMap<Integer, HashMap<String,Object>> empMap = new HashMap<Integer,HashMap<String,Object>>();

		HashMap<String,Object> empDetailMap = new HashMap<String,Object>();
		empDetailMap.put("ManagerId",20209);
		empDetailMap.put("DeptId","7001-Admin");
		empMap.put(76993,empDetailMap);
		
		HashMap<String,Object> empDetailMap1 = new HashMap<String,Object>();
		empDetailMap1.put("DeptId","7002-Finance");
		empDetailMap1.put("ManagerId",20205);
		empMap.put(76585, empDetailMap1);
		
		return empMap;
	}
	
	public static void main(String[] args) {
		HashMap<Integer,HashMap<String,Object>> empMap = getEmpDetails();
		Set<Integer> keys = empMap.keySet();
		for(int currentKey : keys) {
			HashMap<String,Object> empDetailMap = empMap.get(currentKey);
			int managerId = (Integer)empDetailMap.get("ManagerId");
			String deptId = (String)empDetailMap.get("DeptId");
			//System.out.println(managerId + "--" + deptId);
			System.out.println(currentKey + ":" + empDetailMap);
		}
		//System.out.println(empMap);
	}
}
