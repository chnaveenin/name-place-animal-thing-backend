package com.game.naplanth.model;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Arrays;

@Document(collection="room")
public class Room {
    private String roomid;
    private String participants[];

    public String getRoomid() {
        return roomid;
    }

    public void setRoomid(String roomid) {
        this.roomid = roomid;
    }

    public String[] getParticipants() {
        return participants;
    }

    public void setParticipants(String[] participants) {
        this.participants = participants;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomid='" + roomid + '\'' +
                ", participants=" + Arrays.toString(participants) +
                '}';
    }
}
