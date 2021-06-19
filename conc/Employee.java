package com.cg.demo.conc;

public class Employee {
	private int id;
	private String name;
	private Double salary;

	public Employee(int id, String name, Double salary) {
		this.setId(id);
		this.setName(name);
		this.setSalary(salary);

	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

}