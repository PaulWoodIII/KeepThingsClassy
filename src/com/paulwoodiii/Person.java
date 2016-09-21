package com.paulwoodiii;

/**
 * Created by zach on 9/12/16.
 */
//Found on Github: https://raw.githubusercontent.com/TIY-Charleston-Back-End-Sept2016/HelloWorld/master/src/Person.java
public class Person {
    String name;
    int age;
    boolean isAlive;
    double balance;

    static int minimumAge = 18;

    Person(){

    }

    Person(String newName, int newAge, boolean newIsAlive) {
        setName(newName);
        setAge(newAge);
        setAlive(newIsAlive);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isAlive=" + isAlive +
                ", balance=" + balance +
                '}';
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}