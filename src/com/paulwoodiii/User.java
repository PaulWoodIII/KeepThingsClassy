package com.paulwoodiii;

import java.util.ArrayList;

/**
 * Created by paul on 9/20/16.
 */
public class User {
    String username;
    String passwordHash;
    String description;
    int id;
    int age;
    boolean hasValidEmail;
    String email;
    ArrayList<User> friends;
}
