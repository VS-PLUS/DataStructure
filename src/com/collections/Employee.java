package com.collections;


public class Employee implements Comparable<Employee> {

	private Integer salary;
	private String name;

	public Employee(Integer sal, String n) {
		this.setSalary(sal);
		this.setName(n);
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [salary=" + salary + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		if (this.salary > o.salary) {
			return 1;
		} else if (this.salary < o.salary) {
			return -1;
		} else {
			return 0;
		}
		
	
	}

}
