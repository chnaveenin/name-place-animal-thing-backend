package com.game.naplanth.controller;

import com.game.naplanth.RoomRepo;
import com.game.naplanth.model.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RoomController {

    @Autowired
    RoomRepo repo;

    @GetMapping(value="/")
    public String test() {
        return "Working";
    }

    @GetMapping(value="/rooms")
    public List<Room> getAllRooms() {
        return repo.findAll();
    }

}
