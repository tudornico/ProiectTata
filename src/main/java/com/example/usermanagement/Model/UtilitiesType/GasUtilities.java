package com.example.usermanagement.Model.UtilitiesType;


import com.example.usermanagement.Model.TypeOfCalculation;
import com.example.usermanagement.Model.Utilities;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.util.List;

//m^3 * GasPrice
@Data
@Entity
@Getter
@Setter
public class GasUtilities {

    @jakarta.persistence.Id
    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "typeOfCalculation")

    private TypeOfCalculation calculation;


    public GasUtilities(Long id, TypeOfCalculation calculation) {
        this.id = id;
        this.calculation = calculation;
    }

    @Column(name = "volume")
    @NotNull
    private double volume;

    @OneToMany(mappedBy = "gas")
    private List<Utilities> utilities;

    public GasUtilities() {
    }

    public double calculateGas() {
        return this.volume * Utilities.getGasUnitPrice();
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
