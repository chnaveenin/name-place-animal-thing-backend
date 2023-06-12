package com.game.naplanth;

import com.game.naplanth.model.Room;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RoomRepo extends MongoRepository<Room, String> {
}
