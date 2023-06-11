package com.example.usermanagement.Repository;


import com.example.usermanagement.Model.UtilitiesType.GasUtilities;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GasRepository extends JpaRepository<GasUtilities,Long> {
}
