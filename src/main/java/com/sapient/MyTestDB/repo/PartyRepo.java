package com.sapient.MyTestDB.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sapient.MyTestDB.model.Party;
@Repository
public interface PartyRepo extends JpaRepository<Party, Long> {

}
