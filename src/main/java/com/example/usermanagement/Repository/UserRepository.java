package com.example.usermanagement.Repository;


import com.example.usermanagement.Model.Renter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Renter, Long> {
}
