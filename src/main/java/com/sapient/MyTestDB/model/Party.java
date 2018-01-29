package com.sapient.MyTestDB.model;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "parties")
public class Party {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "party_id")
	private long id;

	private String location;

	@Column(name = "party_date")
	@JsonFormat(pattern = "YYYY-MM-dd")
	private Date date;

	@ManyToMany
	@JoinTable(name = "people_parties", 
		joinColumns = @JoinColumn(name = "party_id", referencedColumnName = "party_id"), 
		inverseJoinColumns = @JoinColumn(name = "student_id", referencedColumnName = "id"))
	private Set<Student> people = new HashSet<Student>();
	
	public Set<Student> getPeople() {
		return people;
	}

	public void setPeople(Set<Student> people) {
		this.people = people;
	}

	public long getId() {
		return id;
	}

	public String getLocation() {
		return location;
	}

	public Date getDate() {
		return date;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	
	
	
	
}
