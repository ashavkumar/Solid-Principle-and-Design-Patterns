package com.tothenew.beach.programmingpractice;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class BeachImpl1 implements Beach{
    @Override
    public String greetingMsg() {
        return "Say Hello from BeachImpl1";
    }
}
