package com.hjj.Factory.Method;

public class WeChatSender implements Sender {
    @Override
    public void send() {
        System.out.println("发送微信");
    }
}
