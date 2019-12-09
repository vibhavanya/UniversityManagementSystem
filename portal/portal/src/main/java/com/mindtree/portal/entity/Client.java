package com.mindtree.portal.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="client")

public class Client {
	@Id
	@Column(name="client_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	@Column(name="client_name")
	private String name;
	
	@Column(name="client_budget")
	private int budget;
	
	@ManyToOne
	private Company company;
	
	
}
