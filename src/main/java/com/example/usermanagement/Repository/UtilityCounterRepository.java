package com.example.usermanagement.Repository;


import com.example.usermanagement.Model.UtilityCounter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UtilityCounterRepository extends JpaRepository<UtilityCounter,Long> {
}
