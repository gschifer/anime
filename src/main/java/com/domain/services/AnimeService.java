package com.domain.services;

import com.domain.entities.Anime;
import com.domain.repository.AnimeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimeService {
    private AnimeRepository repository;

    public List<Anime> getRepository() {
        return repository.findAll();
    }
}
