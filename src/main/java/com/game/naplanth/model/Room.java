package com.game.naplanth.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Indexed;

import java.util.Arrays;

@Document(collection="room")
public class Room {
    @Id
    private ObjectId id;
    private String roomid;

    public static class Participant {
        private String name;
        private int score;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getScore() {
            return score;
        }

        public void setScore(int score) {
            this.score = score;
        }

        @Override
        public String toString() {
            return "Participant{" +
                    "name='" + name + '\'' +
                    ", score=" + score +
                    '}';
        }
    }
    private Participant participants[];

    @Override
    public String toString() {
        return "Room{" +
                "id=" + id +
                ", roomid='" + roomid + '\'' +
                ", participants=" + Arrays.toString(participants) +
                '}';
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getRoomid() {
        return roomid;
    }

    public void setRoomid(String roomid) {
        this.roomid = roomid;
    }

    public Object[] getParticipants() {
        return participants;
    }

    public void setParticipants(Participant[] participants) {
        this.participants = participants;
    }

    public void addParticipant(Participant participant) {
        Participant[] updatedParticipants = Arrays.copyOf(participants, participants.length + 1);
        updatedParticipants[participants.length] = participant;
        participants = updatedParticipants;
    }
}