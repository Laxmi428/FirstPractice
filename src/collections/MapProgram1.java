package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;



public class MapProgram1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Map<Integer, String> hm=new HashMap<Integer, String>();
hm.put(1001, "ram");
hm.put(1002, "jaya");
hm.put(1003, "seetha");
hm.put(1001, "veera");
System.out.println(hm);
Set entries=hm.entrySet();//fetch the entries
Iterator i=entries.iterator();//create cursor object to traverse
while(i.hasNext())//check whether object is available or not
{
	Object obj=i.next();
	Map.Entry e=(Map.Entry)obj;
	System.out.print("Key:    "+e.getKey());
	System.out.println("\nValue:"+e.getValue());
}

	}
}
