package ArrayLists;

import java.util.ArrayList;
//import java.util.*;

public class SimpleArrayLists {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
	ArrayList list=new ArrayList();
		
		list.add(1);
		list.add("asad");
		list.add(2, 4);
		
		System.out.println(list);		
		list.clone();		
		System.out.println(list);
		System.out.println(list.contains("asad"));		
		System.out.println(list.containsAll(list));		
		System.out.println(list.isEmpty());
		System.out.println(list.removeAll(list));
		System.out.println(list);		
		
	}
}
