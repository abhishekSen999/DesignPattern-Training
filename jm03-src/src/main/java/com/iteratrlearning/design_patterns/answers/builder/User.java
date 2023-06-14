package com.iteratrlearning.design_patterns.answers.builder;

import java.time.LocalDate;

public class User {

    private final String name;
    private final LocalDate birthDate;
    private final String email;
    private final String phoneNumber;

    public User(String name, LocalDate birthDate, String email, String phoneNumber) {
        this.name = name;
        this.birthDate = birthDate;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public static UserBuilder builder(){
        return new UserBuilder();
    }

    public static class UserBuilder {
        private String name;
        private LocalDate birthDate;
        private String email;
        private String phoneNumber;

        public UserBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public UserBuilder withBirthDate(LocalDate birthDate) {
            this.birthDate = birthDate;
            return this;
        }

        public UserBuilder withEmail(String email) {
            this.email = email;
            return this;
        }

        public UserBuilder withPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public User build() {
            return new User(name, birthDate, email, phoneNumber);
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", birthDate=" + birthDate +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
