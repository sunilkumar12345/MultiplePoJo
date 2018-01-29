package com.sapient.MyTestDB.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sapient.MyTestDB.model.Skill;
@Repository
public interface SkillRepo extends JpaRepository<Skill, Long> {

}
