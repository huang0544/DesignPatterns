package com.hjj.Factory.Abstract;

public class WeChatProvider implements Provider {
    @Override
    public Sender produce() {
        return new WeChatSender();
    }
}
