package com.weekend;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;import java.util.stream.Collectors;

public class FilterNameByAge {
	public static void main(String[] args) {
		List<Employee> li=new ArrayList<>();
		li.add(new Employee(1, "Ramya", 20));
		li.add(new Employee(1, "Angel", 30));
		li.add(new Employee(1, "BBRamya3", 40));
		li.add(new Employee(1, "ARamya", 50));
		List<String> li3=li.stream().filter(Employee->Employee.getName().startsWith("A")).map(Employee::getName).collect(Collectors.toList());
		System.out.println(li3);
		List<String> li2=li.stream().filter(Employee->Employee.getAge()>35).sorted(Comparator.comparing(Employee::getName)).map(Employee::getName).toList();
		System.out.println(li2);
		}

}
