package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="cd_detail")
@Data
@NoArgsConstructor
public class CdDetailsXt {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "region")
	private String region;
	
	public CdDetailsXt(String region) {
		super();
		this.region = region;

	}
	
	
	
	
}