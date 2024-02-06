package map.com;

import java.util.HashMap;

public class Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		HashMap hm=new HashMap();
		hm.put("A", "AAAAAA");
		hm.put("B", "BBBBBB");
		hm.put("C","CCCCCC");
		hm.put("D","DDDDDD");
		System.out.println(hm);
		
		
		
		HashMap hm1=new HashMap();
		hm1.put("E", "EEEEEE");
		hm1.put("F", "FFFFFF");
		hm1.put("B", "HHHHHH"); 
		hm1.put(7, 9999);
		hm1.putAll(hm);
		System.out.println(hm1);
		System.out.println(hm1.get("B"));
		System.out.println(hm1.containsValue("FFFFFF"));
		System.out.println(hm1.keySet());
		System.out.println(hm1.values());
		

		

	}

}
