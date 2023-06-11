package com.example.usermanagement.Repository;


import com.example.usermanagement.Model.Renter;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<Renter, Long> {

    List<Renter> findAllByFirstName(String firstName);

}
