package com.example.usermanagement.Mappers;


import com.example.usermanagement.Model.Renter;
import com.example.usermanagement.Model.dtos.UserDto;

public  class UserMapper {
    public static UserDto convertToDto(Renter user){
        return new UserDto(
                user.getId(),
                user.getFirstName(),
                user.getLastName(),
                user.getEmail(),
                user.getAllUtilities(),
                user.getRole(),
                user.getRoomList()
        );
    }
    public static Renter convertToEntity(UserDto dto){
        return new Renter(
                dto.getId(),
                dto.getFirstName(),
                dto.getLastName(),
                dto.getRole(),
                dto.getEmail(),
                dto.getRooms()
        );
    }
}
