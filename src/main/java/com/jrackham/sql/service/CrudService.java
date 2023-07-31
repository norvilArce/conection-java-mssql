package com.jrackham.sql.service;

import java.util.List;
import java.util.Optional;

public interface CrudService<C, K> {
    List<C> findAll();

    Optional<C> findById(K k);

    void createOrUpdate(C c);

    boolean existsById(K k);
}
