package com.example.usermanagement.Repository;


import com.example.usermanagement.Model.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room,Long> {
}
