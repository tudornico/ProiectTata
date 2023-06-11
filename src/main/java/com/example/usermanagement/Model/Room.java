package com.example.usermanagement.Model;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;


import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

@Entity
@Data
@Getter
@Setter
public class Room {
    @jakarta.persistence.Id
    @Column(name="id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    @NotNull
    private String name;

    @ManyToOne
    @JoinColumn(name="renterid")
    private Renter renter;

    @Column(name = "startDate")
    @NotNull
    private LocalDate startDate;

    @Column(name = "endDate")
    @NotNull
    private LocalDate endDate;

    @Column(name = "rentedSurface")
    @NotNull
    private int rentedSurface;

    @Column(name = "totalSurface")
    @NotNull
    private int totalSurface;

    @OneToOne
    @JoinColumn(name = "utilities_id" ,referencedColumnName = "id")
    private Utilities utilities;

    @ElementCollection
    public Map<String, Double> emailText = new HashMap<>();

    public Room(Long id, String name, Renter user, LocalDate startDate, LocalDate endDate, int renterdSurface,
                int totalSurface, Utilities utilities) {
        this.id = id;
        this.name = name;
        this.renter = user;
        this.startDate = startDate;
        this.endDate = endDate;
        this.rentedSurface = renterdSurface;
        this.totalSurface = totalSurface;
        this.utilities = utilities;
    }

    public Room() {
    }

    public double calculateUtilityPrice() {
        double total = 0;
        total += this.utilities.getGas().calculateGas();
        this.emailText.put("Cost Gaz", this.utilities.getGas().calculateGas());

        total += this.utilities.getDrusal().calculatePrice();
        this.emailText.put("Cost Drusal", this.utilities.getDrusal().calculatePrice());

        total += this.utilities.getElectricity().calculatePrice();
        this.emailText.put("Cost curent", this.utilities.getElectricity().calculatePrice());

        total += this.utilities.getMeteo().calculatePrice();
        this.emailText.put("Cost Meteo", this.utilities.getMeteo().calculatePrice());

        total += this.utilities.getCleaning().getPrice();
        this.emailText.put("Cost Curatenie", this.utilities.getCleaning().getPrice());

        this.emailText.put("Cost Total", total);
        return total;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
