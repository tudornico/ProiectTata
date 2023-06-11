package com.example.usermanagement.Model.UtilitiesType;


import com.example.usermanagement.Model.TypeOfCalculation;
import com.example.usermanagement.Model.Utilities;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.util.List;

@Data
@Entity
@Getter
@Setter
//price
public class MeteoUtilities {
    @jakarta.persistence.Id
    @Column(name="id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="typeOfCalculation")
    private TypeOfCalculation typeOfCalculation;

    @Column(name="price")
    private double price;

    @OneToMany(mappedBy = "meteo")
    private List<Utilities> utilities;
    public double calculatePrice(){
        return this.price;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
