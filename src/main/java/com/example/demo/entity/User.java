package com.example.demo.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private final String name;
    private final String email;
    private final String favoriteCharacter;

    public User() {
        this.name = "";
        this.email = "";
        this.favoriteCharacter = "";
    }

    public User(String name, String email, String favoriteCharacter) {
        this.name = name;
        this.email = email;
        this.favoriteCharacter = favoriteCharacter;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getFavoriteCharacter() {
        return favoriteCharacter;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", name=" + name + ", email=" + email + ", favoriteCharacter=" + favoriteCharacter +"}";
    }
}
