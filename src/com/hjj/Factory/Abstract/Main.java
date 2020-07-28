package com.hjj.Factory.Abstract;

public class Main {
    public static void main(String[] args) {
        MailProvider mailProvider = new MailProvider();
        Sender sender = mailProvider.produce();
        sender.send();
    }
}
