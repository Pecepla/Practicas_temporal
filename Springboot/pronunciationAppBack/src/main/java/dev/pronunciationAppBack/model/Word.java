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
public class Word {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    private String wordName;
    private String definition;
    private String phoneticSpelling;
    private String sentence;
    private boolean isActive;


    @JsonIgnore
    @OneToMany(mappedBy = "word")
    private List<Pronunciation> pronunciations;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "caategory")
    private Category categoryId;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "lavel")
    private Lavel lavel;

    @JsonIgnore
    @OneToMany(mappedBy = "word")
    private List<StageWord> stageword;

    @Override
    public String toString() {
        return "Word{" +
                "id='" + id + '\'' +
                ", wordName='" + wordName + '\'' +
                ", definition='" + definition + '\'' +
                ", phoneticSpelling='" + phoneticSpelling + '\'' +
                ", sentence='" + sentence + '\'' +
                ", isActive=" + isActive +
                ", lavel=" + lavel +
                '}';
    }
}
