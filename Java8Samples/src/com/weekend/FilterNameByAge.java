package com.weekend;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FilterNameByAge  {
	public static void main(String[] args) {
		List<Employee> li=new ArrayList<>();
		li.add(new Employee(1, "Ramya", 20));
		li.add(new Employee(1, "Angel", 30));
		li.add(new Employee(1, "BBRamya3", 40));
		li.add(new Employee(1, "ARamya", 50));
		List<String> li3=li.stream().filter(Employee->Employee.getName().startsWith("A")).map(Employee::getName).collect(Collectors.toList());
		System.out.println(li3);
		List<String> li2=li.stream().filter(Employee->Employee.getAge()>35).sorted(Comparator.comparing(Employee::getName)).map(Employee::getName).collect(Collectors.toList());
		System.out.println(li2);
		
		
		List<Employee>li1=new ArrayList<>();
		li1.add(new Employee(12, "Ramya", 20));
		li1.add(new Employee(13, "Ramya2", 70));
		li1.add(new Employee(14, "Ramya3", 50));
		li1.add(new Employee(15, "Ramya4", 22));
		li1.add(new Employee(16, "Ramya5", 30));
		
		Map<String, List<Employee>>departmentName=li1.stream().filter(Employee->Employee.getAge()>30).collect(Collectors.groupingBy(Employee::getName));
		System.out.println("@@"+departmentName.toString());
		List<String> sortedList=li.stream().filter(Employee->Employee.getAge()>30).sorted(Comparator.comparing(Employee::getName)).map(Employee::getName).collect(Collectors.toList());
		System.out.println(sortedList);
	
	
	

}
}
