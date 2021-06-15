package com.rooms.repository;

import com.rooms.model.rooms;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface roomsRepository extends MongoRepository<rooms, Integer>
{
}
