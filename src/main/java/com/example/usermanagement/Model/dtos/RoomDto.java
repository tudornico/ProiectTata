package com.example.usermanagement.Model.dtos;



import com.example.usermanagement.Model.Renter;
import com.example.usermanagement.Model.Utilities;

import java.time.LocalDate;

public class RoomDto {


    private Long id;

    private String name;

    private Renter user;

    private LocalDate startDate;

    private LocalDate endDate;

    private int rentedSurface;

    private int totalSurface;

    private Utilities utilities;

    public RoomDto(Long id, String name, Renter user, LocalDate startDate, LocalDate endDate, int rentedSurface, int totalSurface, Utilities utilities) {
        this.id = id;
        this.name = name;
        this.user = user;
        this.startDate = startDate;
        this.endDate = endDate;
        this.rentedSurface = rentedSurface;
        this.totalSurface = totalSurface;
        this.utilities = utilities;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Renter getUser() {
        return user;
    }

    public void setUser(Renter user) {
        this.user = user;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public int getRentedSurface() {
        return rentedSurface;
    }

    public void setRentedSurface(int rentedSurface) {
        this.rentedSurface = rentedSurface;
    }

    public int getTotalSurface() {
        return totalSurface;
    }

    public void setTotalSurface(int totalSurface) {
        this.totalSurface = totalSurface;
    }

    public Utilities getUtilities() {
        return utilities;
    }

    public void setUtilities(Utilities utilities) {
        this.utilities = utilities;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
