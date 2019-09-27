package com.ibmfsd.EmployeeManipulation;



import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;


@Entity
@Data
@javax.persistence.Table(name="emp")
public class Employee  implements Serializable{
public Employee(int id, String firstname, String lastname, String email) {
	super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
	}

@Id
@Column(name="id")
private int id;
@Column(name="firstname")
private String firstname;
@Column(name="lastname")
private String lastname;

@Column(name="email")


private String email;


}

