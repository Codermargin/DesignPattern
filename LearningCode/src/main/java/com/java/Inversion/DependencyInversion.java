package com.java.Inversion;

public class DependencyInversion {
    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
        person.receive(new Wechat());
    }
}

interface Receiver{
    public String getInfo();
}
class Email implements Receiver{
    public String getInfo(){
        return "这是一条电子邮件信息";
    }
}
class Wechat implements Receiver{
    public String getInfo() {
        return "这是一条微信消息";
    }
}
class Person{
    public void receive(Receiver receiver){
        System.out.println(receiver.getInfo());
    }
}