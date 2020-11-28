package com.sb.basic.entity;

public class Employee {
	private int id;
	private String name;
	private String clgName;

	public Employee(int id, String name, String clgName) {
		super();
		this.id = id;
		this.name = name;
		this.clgName = clgName;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
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

	public String getClgName() {
		return clgName;
	}

	public void setClgName(String clgName) {
		this.clgName = clgName;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", clgName=" + clgName + "]";
	}

}
