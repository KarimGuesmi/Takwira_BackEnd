package net.javaguides.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import net.javaguides.springboot.entities.Joueur;

@Repository
public interface JoueurRepository extends JpaRepository<Joueur, Long> {

	// Test in JoueurService for the method addJoueurWTUN
	boolean existsByUsername(String username);
	
	// Find Joueur by username
	Joueur findByUsername(String username);
	
	// Find List of joueurs by username starts with specific caracter
	@Query(value = "select * from joueur j where j.username like :cle%", nativeQuery = true)
	List<Joueur> findListJoueurByUsername(@Param("cle") String ch);
}
