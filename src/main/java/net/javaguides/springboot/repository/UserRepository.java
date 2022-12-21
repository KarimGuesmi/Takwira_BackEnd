package net.javaguides.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import net.javaguides.springboot.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	@Query(value ="select id_user from user_role ur where ur.id_role=1 ", nativeQuery = true)
	List<Long> findUserbyIdRole();
	
	@Query(value ="select id_user from user_role ur where ur.id_role=?1 ", nativeQuery = true)
	List<Long> findUsersbyIdRole(Long idr);
}
