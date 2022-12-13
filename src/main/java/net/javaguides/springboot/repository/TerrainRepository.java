package net.javaguides.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.javaguides.springboot.entities.Terrain;

@Repository
public interface TerrainRepository extends JpaRepository<Terrain, Long> {

}
