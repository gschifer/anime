package com.domain.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

@Entity
public class Anime {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String description;

    private List<Season> seasons;

    private String image;

    public Anime(String name, String description, List<Season> seasons, String image) {
        this.name = name;
        this.description = description;
        this.seasons = seasons;
        this.image = image;
    }
}
