package com.example.usermanagement.Model;


import com.example.usermanagement.Model.UtilitiesType.*;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;



@Entity
@Getter
@Setter
public class Utilities {

    @jakarta.persistence.Id
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name="water_id")
    private WaterUtilities water;

    @Column(name = "gasUnitPrice")
    @NotNull
    private static double gasUnitPrice;

    @Column(name="waterUnitPrice")
    @NotNull
    private static double waterUnitPrice;

    @Column(name="drusalUnitPrice")
    @NotNull
    private static double drusalUnitPrice;

    @Column(name="eletricUnitPrice")
    @NotNull
    private static double electricUnitPrice;
    @ManyToOne
    @JoinColumn(name = "gas_id")
    private GasUtilities gas;

    @ManyToOne
    @JoinColumn(name="electric_id")
    private ElectricUtilities electricity;

    @ManyToOne
    @JoinColumn(name="meteo_id")
    private MeteoUtilities meteo;

    @ManyToOne
    @JoinColumn(name="drusal_id")
    private DrusalUtilities drusal;

    @ManyToOne
    @JoinColumn(name = "cleaning_id" )
    private CleaningUtilities cleaning;


    public static double getGasUnitPrice() {
        return gasUnitPrice;
    }

    public static void setGasUnitPrice(double gasUnitPrice) {
        Utilities.gasUnitPrice = gasUnitPrice;
    }

    public static double getWaterUnitPrice() {
        return waterUnitPrice;
    }

    public static void setWaterUnitPrice(double waterUnitPrice) {
        Utilities.waterUnitPrice = waterUnitPrice;
    }

    public static double getDrusalUnitPrice() {
        return drusalUnitPrice;
    }

    public static void setDrusalUnitPrice(double drusalUnitPrice) {
        Utilities.drusalUnitPrice = drusalUnitPrice;
    }

    public static double getElectricUnitPrice() {
        return electricUnitPrice;
    }

    public static void setElectricUnitPrice(double electricUnitPrice) {
        Utilities.electricUnitPrice = electricUnitPrice;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
