package ru.itis.taxi.repositories;

import ru.itis.taxi.models.User;

import java.util.UUID;

public interface UsersRepository extends CrudRepository<UUID, User> {
}
