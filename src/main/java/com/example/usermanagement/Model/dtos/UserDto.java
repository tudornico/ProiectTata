package com.example.usermanagement.Model.dtos;


import com.example.usermanagement.Model.Role;
import com.example.usermanagement.Model.Room;

import java.util.List;

public class UserDto {
    private Long id;

    private String firstName;

    private String lastName;

    private String email;

    private double totalPrice;

    private Role role;

    private List<Room> rooms;
    public UserDto(Long id, String firstName, String lastName, String email, double totalPrice, Role role, List<Room> rooms) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.totalPrice = totalPrice;
        this.role = role;
        this.rooms = rooms;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    @Override
    public String toString() {
        return "UserDto{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", totalPrice=" + totalPrice +
                ", role=" + role +
                ", rooms=" + rooms +
                '}';
    }
}
