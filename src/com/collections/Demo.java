package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(5000, "1"));
		list.add(new Employee(1000, "12"));
		list.add(new Employee(100, "123456789"));
		list.add(new Employee(700, "12345"));
		list.add(new Employee(10000, "1234567890"));
		for(Employee  emp:list){
			System.out.println(emp);
		}
		System.out.println("Calling Reverse");
		Collections.reverse(list);
		for(Employee  emp:list){
			System.out.println(emp);
		}
		//Collections.sort(list);
		System.out.println("After reverseOrder");
		Comparator<Employee> comp=Collections.reverseOrder();
		Collections.sort(list,comp);
		for(Employee  emp:list){
			System.out.println(emp);
		}
		
		//Collections.reverseOrder();
		// list.add(new Employee(5000, "shipra"));

	/*	Collections.sort(list, new SalaryComparator());
		for (Employee employee : list) {
			System.out.println("salary comparator : " + employee.getSalary()
					+ " : " + employee.getName());
		}*/

		Map map = new HashMap<Integer, Employee>();
		
		
		map.put(1, new Employee(5000, "1"));
		map.put(2, new Employee(2, "12"));
		map.put(3, new Employee(100, "123456789"));

		Map map1 = new TreeMap<Integer, Employee>(new SalaryComparator(map));
		map1.putAll(map);
		Map map3 =Collections.synchronizedMap(map1);

		Set<Integer> keys = map1.keySet();
		Iterator<Integer> itr = keys.iterator();
		while (itr.hasNext()) {
			Integer i = itr.next();
			System.out.println(i + "::" + map1.get(i));

		}

		List<String> str=new ArrayList<String>();
		str.add("Abc");
		str.add("abc");
		str.add("cde");
		str.add("Dde");
		List l=Collections.unmodifiableList(str);
		Collections.sort(str, String.CASE_INSENSITIVE_ORDER);
//l.add("a");
		/*for (String string : str) {
			System.out.println(string);
		}*/
		
		Iterator<String> itr1 =str.iterator();
		while(itr1.hasNext())
		{
			System.out.println("shipra="+itr1.next());
			//str.remove(1);
			itr1.remove();
			
			//str.remove("Dde");
		}
		
		Iterator<String> itr2 =str.iterator();
		while(itr2.hasNext())
		{
			System.out.println("after removal shipra="+itr2.next());
			//str.remove(1);
			//itr2.remove();
			
			//str.remove("Dde");
			
		
		}
		
		
	}

}
