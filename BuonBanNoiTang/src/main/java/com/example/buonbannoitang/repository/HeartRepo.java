package com.example.buonbannoitang.repository;

import com.example.buonbannoitang.Entity.human.Heart;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface HeartRepo extends MongoRepository<Heart, String> {

}
