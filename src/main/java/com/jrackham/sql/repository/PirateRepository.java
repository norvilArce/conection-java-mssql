package com.jrackham.sql.repository;

import com.jrackham.sql.model.Pirate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PirateRepository extends JpaRepository<Pirate, Integer> {
}
