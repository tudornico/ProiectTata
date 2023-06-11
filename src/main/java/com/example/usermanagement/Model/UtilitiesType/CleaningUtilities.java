package com.example.usermanagement.Model.UtilitiesType;


import com.example.usermanagement.Model.Utilities;
import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.annotation.Id;


import java.util.List;

@Data
@Entity
public class CleaningUtilities {
    @jakarta.persistence.Id
    @Column(name="id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="price")
    private double price;

    @OneToMany(mappedBy = "cleaning")
    private List<Utilities> utilities;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
