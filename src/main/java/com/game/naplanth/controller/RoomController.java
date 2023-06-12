package com.game.naplanth.controller;

import com.game.naplanth.RoomRepo;
import com.game.naplanth.model.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins="*")
public class RoomController {

    @Autowired
    RoomRepo repo;

    @RequestMapping(value="/")
    public String test() {
        return "Working";
    }

    @GetMapping(value="/rooms")
    public List<Room> getAllRooms() {
        System.out.println("in rooms");
        List<Room> rs = repo.findAll();
        System.out.println(rs);
        return repo.findAll();
    }

    @GetMapping(value="/insert")
    public void insert() {
        Room temp = new Room();
        temp.setRoomid("hello");
        String[] st = {"gani", "naveen"};
        temp.setParticipants(st);
        repo.insert(temp);
    }
}
