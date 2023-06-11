package com.example.usermanagement.Repository;


import com.example.usermanagement.Model.UtilitiesType.MeteoUtilities;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MeteoRepository extends JpaRepository<MeteoUtilities,Long> {
}
