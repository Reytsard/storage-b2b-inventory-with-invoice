package com.b2b.orderandinventory.user;

import com.b2b.orderandinventory.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<User, UUID> {
    public User findByEmailEqualsIgnoreCase(String email);
    public Boolean existsByEmailIgnoreCase(String email);
}
