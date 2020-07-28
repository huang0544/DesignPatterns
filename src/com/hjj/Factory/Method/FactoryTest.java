package com.hjj.Factory.Method;

public class FactoryTest {
    public static void main(String[] args) {
//        SendFactory sendFactory = new SendFactory();
        //第一种调用
//        Sender sender = sendFactory.produce("sms");
//        sender.send();

        //第二种调用
//        Sender sender = sendFactory.produceMail();
//        sender.send();

        //第三种调用
        Sender sender = SendFactory.produceMail();
        sender.send();
    }
}
