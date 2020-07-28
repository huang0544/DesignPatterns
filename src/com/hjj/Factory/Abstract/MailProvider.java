package com.hjj.Factory.Abstract;

public class MailProvider implements Provider {
    @Override
    public Sender produce() {
        return new MailSender();
    }
}
