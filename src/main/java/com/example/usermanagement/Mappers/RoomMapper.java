package com.example.usermanagement.Mappers;


import com.example.usermanagement.Model.Room;
import com.example.usermanagement.Model.dtos.RoomDto;

public class RoomMapper {
   private static RoomDto convertToDto(Room room){
       return new RoomDto(
               room.getId(),
               room.getName(),
               room.getRenter(),
               room.getStartDate(),
               room.getEndDate(),
               room.getRentedSurface(),
               room.getTotalSurface(),
               room.getUtilities()
       );
   }

   private static Room convertToEntity(RoomDto dto){
       return new Room(
               dto.getId(),
               dto.getName(),
               dto.getUser(),
               dto.getStartDate(),
               dto.getEndDate(),
               dto.getRentedSurface(),
               dto.getTotalSurface(),
               dto.getUtilities()
       );
   }
}
