package net.javaguides.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.javaguides.springboot.entities.Joueur;

@Repository
public interface JoueurRepository extends JpaRepository<Joueur, Long> {

}
