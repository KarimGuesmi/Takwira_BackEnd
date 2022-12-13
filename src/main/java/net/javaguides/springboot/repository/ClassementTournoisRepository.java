package net.javaguides.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.javaguides.springboot.entities.ClassementTournois;

@Repository
public interface ClassementTournoisRepository extends JpaRepository<ClassementTournois, Long> {

}
