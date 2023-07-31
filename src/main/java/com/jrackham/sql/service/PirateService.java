package com.jrackham.sql.service;

import com.jrackham.sql.model.Pirate;
import com.jrackham.sql.repository.PirateRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PirateService implements CrudService<Pirate, Integer> {
    private final PirateRepository repository;

    public PirateService(PirateRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Pirate> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Pirate> findById(Integer id) {
        return repository.findById(id);
    }

    @Override
    public void createOrUpdate(Pirate pirate) {
        repository.save(pirate);
    }

    @Override
    public boolean existsById(Integer id) {
        return repository.existsById(id);
    }
}
