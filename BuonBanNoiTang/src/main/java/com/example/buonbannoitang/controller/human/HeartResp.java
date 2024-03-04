package com.example.buonbannoitang.controller.human;

import com.example.buonbannoitang.Entity.human.Heart;

import com.example.buonbannoitang.common.Common;
import com.example.buonbannoitang.repository.HeartRepo;
import com.example.buonbannoitang.service.HeartService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestControllerAdvice
@AllArgsConstructor
public class HeartResp {
    private final HeartService heartService;


    @GetMapping("heart")
    public ResponseEntity<List<Heart>> getAllProducts() {
        return ResponseEntity.ok(heartService.getAllHeart());
    }

    @PostMapping("heart")
    public ResponseEntity<Heart> createProduct(@RequestBody  Heart heartRequest) {

        Heart product = new Heart();
        product.setName(heartRequest.getName());
        product.setExpiry(heartRequest.getExpiry());

        return ResponseEntity.status(201).body(heartService.save(product));
    }
}
