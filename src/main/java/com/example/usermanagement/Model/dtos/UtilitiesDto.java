package com.example.usermanagement.Model.dtos;

import com.example.usermanagement.Model.UtilitiesType.*;

public class UtilitiesDto {

    private WaterUtilities waterUtilities;

    private ElectricUtilities electricUtilities;

    private GasUtilities gasUtilities;

    private DrusalUtilities drusalUtilities;

    private CleaningUtilities cleaningUtilities;

    private MeteoUtilities meteoUtilities;

    public UtilitiesDto(WaterUtilities waterUtilities, ElectricUtilities electricUtilities, GasUtilities gasUtilities,
                        DrusalUtilities drusalUtilities, CleaningUtilities cleaningUtilities, MeteoUtilities meteoUtilities) {
        this.waterUtilities = waterUtilities;
        this.electricUtilities = electricUtilities;
        this.gasUtilities = gasUtilities;
        this.drusalUtilities = drusalUtilities;
        this.cleaningUtilities = cleaningUtilities;
        this.meteoUtilities = meteoUtilities;
    }

    public WaterUtilities getWaterUtilities() {
        return waterUtilities;
    }

    public void setWaterUtilities(WaterUtilities waterUtilities) {
        this.waterUtilities = waterUtilities;
    }

    public ElectricUtilities getElectricUtilities() {
        return electricUtilities;
    }

    public void setElectricUtilities(ElectricUtilities electricUtilities) {
        this.electricUtilities = electricUtilities;
    }

    public GasUtilities getGasUtilities() {
        return gasUtilities;
    }

    public void setGasUtilities(GasUtilities gasUtilities) {
        this.gasUtilities = gasUtilities;
    }

    public DrusalUtilities getDrusalUtilities() {
        return drusalUtilities;
    }

    public void setDrusalUtilities(DrusalUtilities drusalUtilities) {
        this.drusalUtilities = drusalUtilities;
    }

    public CleaningUtilities getCleaningUtilities() {
        return cleaningUtilities;
    }

    public void setCleaningUtilities(CleaningUtilities cleaningUtilities) {
        this.cleaningUtilities = cleaningUtilities;
    }

    public MeteoUtilities getMeteoUtilities() {
        return meteoUtilities;
    }

    public void setMeteoUtilities(MeteoUtilities meteoUtilities) {
        this.meteoUtilities = meteoUtilities;
    }
}
