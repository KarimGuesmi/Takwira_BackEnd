package net.javaguides.springboot.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.javaguides.springboot.entities.Role;

@Repository
public interface IRoleRepository extends JpaRepository<Role, Long>{

}
