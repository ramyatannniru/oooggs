package io.com.example;

import java.io.Serializable;

public class EmployeeSerializable  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2321094265740329855L;
	private String id;
	private String name;
	 private transient  String address;

	public EmployeeSerializable() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmployeeSerializable(String id, String name, String address) {
		// TODO Auto-generated constructor stub
		super();
		this.address=address;
		this.id=id;
		this.name=name;
	}
	
	@Override
	public String toString() {
		return "EmployeeSerializable [id=" + id + ", name=" + name + "]";
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAddress(String address) {
		this.address = address;
	}

}
