package com.game.naplanth.controller;

import com.game.naplanth.RoomRepo;
import com.game.naplanth.model.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins="*")
public class RoomController {

    @Autowired
    RoomRepo repo;

    @GetMapping(value="/rooms")
    public List<Room> getAllRooms() {
        return repo.findAll();
    }

    @GetMapping(value="/room/{roomid}")
    public Room getRoom(@PathVariable String roomid) {
        return repo.findByRoomid(roomid);
    }

    @PostMapping(value="/create-room")
    public Room createRoom(@RequestBody Room room) {
        return repo.save(room);
    }

    @PatchMapping(value="/join-room/{roomid}")
    public Room joinRoom(@PathVariable String roomid, @RequestBody Room.Participant participant) {
        Room room = repo.findByRoomid(roomid);
        if (room != null) {
            room.addParticipant(participant);
            return repo.save(room);
        }
        return null;
    }
}
