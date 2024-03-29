package org.example.model;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@Entity
public class Film {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String title;
    String description;
    Double length;
    String language;
    Integer Rating;
    String directorName;

    public Film(String title, String description, Double length, String language, Integer rating, String directorName) {
        this.title = title;
        this.description = description;
        this.length = length;
        this.language = language;
        Rating = rating;
        this.directorName = directorName;
    }

    public Film(Integer id) {
        this.id = id;
    }
}

