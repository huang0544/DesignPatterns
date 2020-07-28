package com.hjj.Factory.Abstract;

public class WeChatSender implements Sender {
    @Override
    public void send() {
        System.out.println("微信发送消息");
    }
}