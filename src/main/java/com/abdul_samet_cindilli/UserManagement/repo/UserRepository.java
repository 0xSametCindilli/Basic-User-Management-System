package com.abdul_samet_cindilli.UserManagement.repo;

import com.abdul_samet_cindilli.UserManagement.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
