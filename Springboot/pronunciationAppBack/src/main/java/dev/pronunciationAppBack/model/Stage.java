package dev.pronunciationAppBack.model;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Stage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    private String name;
    private String avatarUrl;
    private String status;
    private int progress;
    private int currentScore;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "laveleId")
    private List<Lavel> lavel;

    @JsonIgnore
    @OneToMany(mappedBy = "stageWordId",
            cascade = CascadeType.ALL)
    private List<StageWord> stage;

}