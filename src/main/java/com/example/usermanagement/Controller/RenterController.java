package com.example.usermanagement.Controller;

import com.example.usermanagement.Model.Renter;
import com.example.usermanagement.Repository.UserRepository;

import java.io.Console;
import java.util.List;

public class RenterController {
    public UserRepository userRepository;

    public void addRenter(Renter renter){
        try{
            this.userRepository.save(renter);
        }
        catch (Exception e ){
            System.out.println(e.getMessage());
        }
    }

    public void removeRenter(Renter renter){
        try{
            this.userRepository.save(renter);
        }
        catch (Exception e ){
            System.out.println(e.getMessage());
        }
    }

    public List<Renter> findByFirstName(String firstName){
        try{
            return this.userRepository.findAllByFirstName(firstName);
        }
        catch (Exception e ){
            System.out.println(e.getMessage());
        }
        return null;
    }
}
