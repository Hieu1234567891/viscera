package com.example.buonbannoitang.Entity.human;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Document("Heart")
public class Heart {


    @Id
    private String id;

    private String name;

    private String expiry;



}
