package com.sapient.MyTestDB.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.sapient.MyTestDB.enumtype.Level;


@Entity
@Table(name = "skills")
@EntityListeners(AuditingEntityListener.class)
public class Skill {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "skill_id")
	private long id;

	private String name;

	@Enumerated(EnumType.STRING)
	private Level level;

	@ManyToOne
	@JoinColumn (name="id")
	@JsonBackReference
	private Student student;
	
	
	
	
	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Level getLevel() {
		return level;
	}

	public Student getStudent() {
		return student;
	}

	public void setLevel(Level level) {
		this.level = level;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	
}
