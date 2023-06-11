package com.example.usermanagement.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CollectionId;
import org.springframework.data.annotation.Id;


@Entity
@Data
@Getter
@Setter
public class UtilityCounter {
    @jakarta.persistence.Id
    @Column(name = "id")
    @Id
    private Long id;

    @Column(name = "type")
    private UtilityType type;

    @Column(name = "correction")
    private double correction;

    public UtilityCounter(UtilityType type, double correction) {
        this.type = type;
        this.correction = correction;
    }

    public UtilityCounter() {
    }

    public UtilityType getType() {
        return type;
    }

    public void setType(UtilityType type) {
        this.type = type;
    }

    public double getCorrection() {
        return correction;
    }

    public void setCorrection(double correction) {
        this.correction = correction;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
