package com.sapient.MyTestDB.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonBackReference;
@Entity
@Table(name = "student")
@EntityListeners(AuditingEntityListener.class)

public class Student {
	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Long id;

	    @NotBlank
	    private String title;

	    @OneToMany(mappedBy = "student")
	    private Set<Skill> skills = new HashSet<Skill>();
	    
	    
	    @ManyToMany(cascade = CascadeType.ALL)
	    @JsonBackReference
	    @JoinTable(name = "people_parties",
	    	joinColumns = @JoinColumn(name = "student_id", referencedColumnName = "id"),
	    	inverseJoinColumns = @JoinColumn(name = "party_id", referencedColumnName = "party_id"))
	    private Set<Party> parties = new HashSet<Party>();
	    
		public Long getId() {
			return id;
		}

		public String getTitle() {
			return title;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public Set<Skill> getSkills() {
			return skills;
		}

		public void setSkills(Set<Skill> skills) {
			this.skills = skills;
		}

		public Set<Party> getParties() {
			return parties;
		}

		public void setParties(Set<Party> parties) {
			this.parties = parties;
		}
	    
	    
	    

}
