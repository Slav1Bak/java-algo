package model;

import java.time.LocalDate;

public class UserModel {

    //login, haslo, data rejestracji

    String login, password;
    LocalDate registration;

    public UserModel(String login, String password) {
        this.login = login;
        this.password = password;
        registration = LocalDate.now();


    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDate getRegistration() {
        return registration;
    }

    public void setRegistration(LocalDate registration) {
        this.registration = registration;
    }

    @Override
    public String toString() {
        return "UserModel{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", registration=" + registration +
                '}';
    }
}
