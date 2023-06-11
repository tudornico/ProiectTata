package com.example.usermanagement.Model.UtilitiesType;


import com.example.usermanagement.Model.TypeOfCalculation;
import com.example.usermanagement.Model.Utilities;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.util.List;

//m^3 Water * waterPrice
@Entity
@Data
@Getter
@Setter
public class WaterUtilities {
    @jakarta.persistence.Id
    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="type")
    private TypeOfCalculation typeOfCalculation;

    @Column(name="volume")
    private double volume;

    @OneToMany(mappedBy = "water")
    private List<Utilities> utilities;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
