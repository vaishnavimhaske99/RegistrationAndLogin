package com.web.secur.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.web.secur.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
	 @Query("SELECT u FROM User u WHERE u.email = ?1")
	User findByEmail(String username);

}
