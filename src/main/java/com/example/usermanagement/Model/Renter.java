package com.example.usermanagement.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.util.List;
@Entity
@Getter
@Setter
public class Renter {
    @jakarta.persistence.Id
    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "firstName")
    @NotNull
    private String firstName;

    @Column(name="password")
    @NotNull
    //todo make password Hashing system
    private String password;

    @Column(name = "lastName")
    @NotNull
    private String lastName;

    @Column(name = "role")
    private Role role;

    @Column(name = "email")
    @NotNull
    private String email;

    @OneToMany(mappedBy = "renter")
    private List<Room> roomList;

    public Renter(Long id, String firstName, String lastName, Role role, String email, List<Room> roomList) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.role = role;
        this.email = email;
        this.roomList = roomList;
    }
    public double getAllUtilities(){
        double total = 0;
        for (Room room : this.roomList
                ) {
            total+=room.calculateUtilityPrice();
        }
        return total;
    }

    @Override
    public String toString() {
        return "Renter{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", password='" + password + '\'' +
                ", lastName='" + lastName + '\'' +
                ", role=" + role +
                ", email='" + email + '\'' +
                ", roomList=" + roomList +
                '}';
    }

    public Renter() {}

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
