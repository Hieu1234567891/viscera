package com.example.buonbannoitang.service;

import com.example.buonbannoitang.Entity.human.Heart;
import com.example.buonbannoitang.repository.HeartRepo;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class HeartService {
    private final HeartRepo heartRepo;
//a
    public List<Heart> getAllHeart (){
      return heartRepo.findAll();
 }

    public Heart save(Heart product) {

        return null;
    }
}
