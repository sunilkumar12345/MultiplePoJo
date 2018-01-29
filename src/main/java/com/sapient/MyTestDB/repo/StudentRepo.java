package com.sapient.MyTestDB.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sapient.MyTestDB.model.Student;
@Repository
public interface StudentRepo extends JpaRepository<Student, Long> {

}
