package com.coderscampus.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.coderscampus.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {
	//ktbna el query dy 3shan byglnash failed lazy fetch.
	@Query("select u from User u"
			+ " left join fetch u.authorities"
			+ " where u.userName = :username")
	User findByUserName(@Param(value = "username") String username);
	

}
