package com.example.usermanagement.Model.UtilitiesType;


import com.example.usermanagement.Model.Utilities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.springframework.data.annotation.Id;


import java.util.List;

// kW hour
@Data
@Entity
public class ElectricUtilities {
    @jakarta.persistence.Id
    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Amount")
    @NotNull
    private double amount;


    @OneToMany(mappedBy = "electricity")
    private List<Utilities> utilitiesList;
    public double calculatePrice(){
        return Utilities.getElectricUnitPrice()*this.amount;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
