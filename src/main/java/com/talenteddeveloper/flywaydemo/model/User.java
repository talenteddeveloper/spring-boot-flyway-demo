package com.talenteddeveloper.flywaydemo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
//@Getter
//@Setter
@Table(name = "users")
public class User {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private  Long id; // will be set when persisting

    private String username;
	
	private String firstName;
	
	private String lastName;
	
	private int age;
}
