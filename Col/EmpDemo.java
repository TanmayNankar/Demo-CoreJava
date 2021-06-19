package com.cg.demo.Col;

import java.util.ArrayList;
import java.util.List;

public class EmpDemo {

	public static void main(String[] args) {

		Employee emp = new Employee();

		Delete delete = new Delete();

		List<Employee> emplist = new ArrayList<Employee>();

		emplist.add(emp);
		emplist.add(new Employee());
		emplist.add(new Employee(103, "Aaa", 10.5));
//		empList.add("Aaa"); // CE
//		empList.add(delete); // CE

		System.out.println(emplist);

	}

}
