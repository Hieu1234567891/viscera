package com.example.buonbannoitang.controller.human;

import com.example.buonbannoitang.Entity.human.Heart;

import com.example.buonbannoitang.repository.HeartRepo;
import com.example.buonbannoitang.service.HeartService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestControllerAdvice
public class HeartResp {
    private final HeartRepo heartRepo;
    private final HeartService heartService;

    @GetMapping("heart")
    public ResponseEntity<List<Heart>> getAllProducts() {
        return ResponseEntity.ok(heartRepo.findAll());
    }

    @PostMapping("heart")
    public ResponseEntity<Heart> createProduct(@RequestBody  Heart heartRequest) {

        Heart product = new Heart();
        product.setName(heartRequest.getName());
        product.setAge(heartRequest.getAge());

        return ResponseEntity.status(201).body(heartRepo.save(product));
    }
}
