package ru.itis.taxi.app;

import ru.itis.taxi.dto.SignUpForm;
import ru.itis.taxi.mappers.Mappers;
import ru.itis.taxi.repositories.UsersRepository;
import ru.itis.taxi.repositories.UsersRepositoryFilesImpl;
import ru.itis.taxi.services.UsersService;
import ru.itis.taxi.services.UsersServiceImpl;

import java.util.UUID;

public class Main {

    public static void main(String[] args) {
        System.out.println(UUID.randomUUID().toString());
        UsersRepository usersRepository = new UsersRepositoryFilesImpl("users.txt");
        UsersService usersService = new UsersServiceImpl(usersRepository, Mappers::fromSignUpForm);

        usersService.signUp(new SignUpForm("Камила", "Дмитриева",
                "dmitrieva.kamila@mail.com", "kdt2003"));

        int i = 0;
    }
}

