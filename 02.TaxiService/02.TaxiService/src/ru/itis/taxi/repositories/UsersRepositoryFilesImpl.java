package ru.itis.taxi.repositories;

import com.sun.security.auth.UnixNumericUserPrincipal;
import ru.itis.taxi.models.User;

import java.io.*;
import java.util.List;
import java.util.UUID;
import java.util.function.Function;
public class UsersRepositoryFilesImpl implements UsersRepository {

    private final String fileName;


    private static final Function<User, String> userToString = user ->
            user.getId()
                    + "|" + user.getFirstName()
                    + "|" + user.getLastName()
                    + "|" + user.getEmail()
                    + "|" + user.getPassword();

    public UsersRepositoryFilesImpl(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public void save(User entity) {
        entity.setId(UUID.randomUUID());
        try (Writer writer = new FileWriter(fileName, true);
             BufferedWriter bufferedWriter = new BufferedWriter(writer)) {

            String userAsString = userToString.apply(entity);
            bufferedWriter.write(userAsString);
            bufferedWriter.newLine();

        } catch (IOException e) {
            throw new IllegalArgumentException(e);
        }
    }

    @Override
    public void update(User entity) {

    }

    @Override
    public void delete(User entity) {

    }

    @Override
    public void deleteById(UUID id) {

    }

    @Override
    public User findById(UUID id) {
        return null;
    }
}


