package com.example.usermanagement.Repository;

import com.example.usermanagement.Model.UtilitiesType.ElectricUtilities;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ElectricRepository extends JpaRepository<ElectricUtilities,Long> {
}
