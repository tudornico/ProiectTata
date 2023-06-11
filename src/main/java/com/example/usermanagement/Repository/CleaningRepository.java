package com.example.usermanagement.Repository;


import com.example.usermanagement.Model.UtilitiesType.CleaningUtilities;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CleaningRepository extends JpaRepository<CleaningUtilities,Long> {
}
