package ru.itis.taxi.mappers;

import ru.itis.taxi.dto.SignUpForm;
import ru.itis.taxi.models.User;
public class Mappers {
    public static User fromSignUpForm(SignUpForm form) {
        return new User(form.getFirstName(), form.getLastName(), form.getEmail(), form.getPassword());
    }
}

