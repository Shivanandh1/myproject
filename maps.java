package javap;

import java.util.HashMap;
import java.util.Map.Entry;

public class maps {

	public static void main(String[] args) {
		HashMap<String,Integer> hm=new HashMap<>();
		hm.put("s",2);
		hm.put("h",3);
		hm.put("i",4);
		hm.put("s",5);
		System.out.println(hm);
		if(hm.containsKey("s")) {
	    Integer a=hm.get("s");
	    System.out.println("value of key is"+a);
		}
		
		for(String key:hm.keySet()) {
			System.out.println("key: " +key+",value is:"+hm.get(key));
		}
		for(Entry<String, Integer> entry:hm.entrySet()){
			System.out.println("key is:" +entry.getKey()+"value is: "+entry.getValue());
			 
		}
        
	}

}
