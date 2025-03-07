package dev.pronunciationAppBack.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Lavel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    private int number;
    private String name;
    private int requiredScore;
    private Boolean isBloked;


}
