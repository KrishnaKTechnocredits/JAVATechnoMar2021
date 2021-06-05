package monika.Practise1.Revision.Collections_Map;

import java.util.HashMap;
import java.util.Set;

public class ExtraEmpTableProgram {
	
	static void m1() {
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(1,"Monika");
		hm.put(2,"Sonika");
		hm.put(1, "gagan");
		
		
		System.out.println(hm);
		System.out.println(hm.get(1));
	}
	

	static HashMap<Integer,HashMap<String,Object>> getEmpDetails(){
		HashMap<Integer, HashMap<String,Object>> empMap = new HashMap<Integer,HashMap<String,Object>>();

		HashMap<String,Object> empDetailMap = new HashMap<String,Object>();
		empDetailMap.put("ManagerId",20209);
		empDetailMap.put("DeptId","7001-Admin");
	//	System.out.println(empDetailMap.get("ManagerId"));
	//	System.out.println(empDetailMap.get("DeptId"));
		
		empMap.put(76993,empDetailMap);
	//	System.out.println((empMap.get(76993)));
		
		HashMap<String,Object> empDetailMap1 = new HashMap<String,Object>();
		empDetailMap1.put("DeptId","7002-Finance");
		empDetailMap1.put("ManagerId",20205);
		empMap.put(76585, empDetailMap1);
		
		return empMap;
	}
	
	public static void main(String[] args) {
		HashMap<Integer,HashMap<String,Object>> empMap = getEmpDetails();
	//	System.out.println(empMap.get(76993));
		Set<Integer> keys = empMap.keySet();
		for(int currentKey : keys) {
			HashMap<String,Object> empDetailMap = empMap.get(currentKey);
		//	System.out.println(currentKey +" : " + empMap.get(currentKey));
			int managerId = (Integer)empDetailMap.get("ManagerId");
			String deptId = (String)empDetailMap.get("DeptId");
			System.out.println(managerId + "--" + deptId);
		//	System.out.println(currentKey + ":" + empDetailMap);
		}
		m1();
	}
}
