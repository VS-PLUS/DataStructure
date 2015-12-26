package com.collections;

import java.util.Comparator;
import java.util.Map;

public class SalaryComparator implements Comparator<Object> {

	Map map;

	public SalaryComparator(Map map) {
		this.map = map;
	}

	public SalaryComparator() {

	}

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		if (o1 instanceof Employee) {
			return ((Employee) o1).getSalary() - ((Employee) o2).getSalary();
		} else {
			return ((Employee) (map.get(o1))).getSalary()
					- ((Employee) (map.get(o2))).getSalary();
		}
	}

}
