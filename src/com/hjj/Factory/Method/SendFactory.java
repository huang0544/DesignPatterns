package com.hjj.Factory.Method;

public class SendFactory {
    //1.普通工厂方法模式，就是建立一个工厂类，对实现了同一接口的一些类进行实例的创建
//    public Sender produce(String type) {
//        if ("mail".equals(type)) {
//            return new MailSender();
//        } else if ("sms".equals(type)) {
//            return new SmsSender();
//        } else {
//            System.out.println("请输入正确的类型!");
//            return null;
//        }
//    }

    //2.多个工厂方法模式
//    public Sender produceMail(){
//        return new MailSender();
//    }
//
//    public Sender produceSms(){
//        return new SmsSender();
//    }

    //3.静态工厂方法模式，不需要创建实例，直接调用即可
    public static Sender produceMail(){
        return new MailSender();
    }

    public static Sender produceSms(){
        return new SmsSender();
    }
}
