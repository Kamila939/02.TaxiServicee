package ru.itis.taxi.repositories;

import java.util.List;
import java.util.Optional;

public interface CrudRepository<ID, T> {
    List<T> findAll();

    void save(T entity);

    void update(T entity);

    void delete(T entity);

    void deleteById(ID id);

    T findById(ID id);

}

