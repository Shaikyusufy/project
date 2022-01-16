package project;

import java.util.HashMap;

public class Map {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Map<String ,Integer> map=new HashMap<>();
map.put("Manoj", 10);
map.put("karthick",20);
map.put("virat", 30);
map.put("zibran", 5);
map.put("rohit",45);
for(Map.Entry<String,Integer> f:map.entrySet())
System.out.println(f.getKey()+" "+f.getValue());

	}

}
}
