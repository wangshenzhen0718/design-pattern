package com.wang.seven_principles.p3_inversion.error;

public class DependecyInversion {
    public static void main(String[] args) {
        Person person = new Person();
        Email email = new Email();
        person.receive(email);
    }
}
