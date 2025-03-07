package dev.pronunciationAppBack.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;


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

    @JsonIgnore
    @OneToMany(mappedBy = "lavelid",
            cascade = CascadeType.ALL)
    private List<Word> listWords;

    @JsonIgnore
    @OneToMany(mappedBy = "lavelid",
            cascade = CascadeType.ALL)
    private List<Stage> stage;

}
