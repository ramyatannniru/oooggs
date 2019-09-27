package com.entity;

 import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "instructor")
@Data
@NoArgsConstructor
	

public class CdDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name = "id")
	private int id;
	@Column(name = "title")
	private String title;
	@Column(name = "author")
	private String author;
	@Column(name = "cost")
	private String cost;
	@Column(name="type")
	private String type;
	
	
	public CdDetails(String title, String author, String cost,String type) {
		super();
		this.author = author;
		this.title = title;
		this.cost = cost;
		this.type=type;
		
	}

	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

