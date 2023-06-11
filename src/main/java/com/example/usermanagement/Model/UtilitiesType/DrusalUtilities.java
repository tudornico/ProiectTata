package com.example.usermanagement.Model.UtilitiesType;


import com.example.usermanagement.Model.Utilities;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.util.List;

//m^3 * GarbagePrice
@Entity
@Data
@Getter
@Setter
public class DrusalUtilities {

    @jakarta.persistence.Id
    @Column(name="id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="volume")
    @NotNull
    private double volume;


    @OneToMany(mappedBy = "drusal")
    private List<Utilities> utilities;

    public DrusalUtilities(Long id, double volume) {
        this.id = id;
        this.volume = volume;
    }

    public DrusalUtilities() {}

    public double calculatePrice(){
        return this.volume * Utilities.getDrusalUnitPrice();
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
