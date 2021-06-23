package com.java.Inversion;

public class DependencyInversion {
    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
    }
}

class Email{
    public String getInfo(){
        return "这是一条电子邮件信息";
    }
}

class Person{
    public void receive(Email email){
        System.out.println(email.getInfo());
    }
}