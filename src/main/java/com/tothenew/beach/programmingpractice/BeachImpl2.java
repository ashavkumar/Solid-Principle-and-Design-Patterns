package com.tothenew.beach.programmingpractice;

import org.springframework.stereotype.Component;

@Component
public class BeachImpl2 implements Beach{
    @Override
    public String greetingMsg() {
        return "Say Hello from BeachImpl2";
    }
}
